package pl.sda.zdjava46.zadanie1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.zdjava46.zadanie1.domain.Address;
import pl.sda.zdjava46.zadanie1.repository.ApplicationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AddressService {
    private final ApplicationRepository applicationRepository;

    public List<Address> getAddresses(){
        return applicationRepository.getAddresses();
    }
    public void createAddress(Address address){
        applicationRepository.createAddress(address);
    }

    public void removeAddress(Address address){
        applicationRepository.removeAddress(address);
    }
}
