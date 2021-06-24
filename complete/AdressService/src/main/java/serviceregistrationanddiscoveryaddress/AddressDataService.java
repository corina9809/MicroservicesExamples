package serviceregistrationanddiscoveryaddress;

import java.util.ArrayList;
import java.util.List;

public class AddressDataService {
    private Address adress;
    private List<Address> addressListe = new ArrayList<Address>();

    public Address getAddress(Integer memberId) {

        setAdress(memberId);
            addressListe.add(adress);
        System.out.println("getAddress11\n" + adress.toString());
        return adress;
    }

    public List<Address> getAdressListe() {
        if (addressListe == null){
            addressListe = new ArrayList<Address>();
        }
        return addressListe;
    }

    public void setAdress(Integer memberId) {
        this.adress = new Address("3434" + memberId + " Anderson Avenue",
                "Apt# 420" + memberId,
                "San Jose",
                "California",
                "United States");
        addressListe.add(this.adress);
    }
}
