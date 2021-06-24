package serviceregistrationanddiscoverymail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class MailWebClientController {
    @Autowired
    private DiscoveryClient discoveryClient;

    private MailDataService mailDataService;

    @PostMapping("/{member-id}/mails")
    public ResponseEntity sendMail(@PathVariable("member-id") int memberId, @RequestBody Mail mail) {

        mailDataService = new MailDataService();
        List<ServiceInstance> instances = discoveryClient.getInstances("address-service");
        if (instances != null && instances.size() > 0) {//todo: replace with a load balancing mechanism
            ServiceInstance serviceInstance = instances.get(0);
            String url = serviceInstance.getUri().toString();
            url = url + "/" + memberId +"/address";
            RestTemplate restTemplate = new RestTemplate();
            Address memberAddress = restTemplate.getForObject(url,
                    Address.class);
            mail.setAddress(memberAddress);
            mailDataService.postMail(memberId, mail);

        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
