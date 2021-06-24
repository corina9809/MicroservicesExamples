package serviceregistrationanddiscoveryaddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AddressController {
    private AddressDataService dataService;


    @GetMapping("/{member-id}/address")
    public Address getAddress(@PathVariable("member-id") int memberId) {
        dataService = new AddressDataService();

        Address address = dataService.getAddress(memberId);
        return address;
    }
}
