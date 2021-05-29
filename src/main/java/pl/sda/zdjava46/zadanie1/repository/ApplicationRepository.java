package pl.sda.zdjava46.zadanie1.repository;

import lombok.Data;
import org.springframework.stereotype.Repository;
import pl.sda.zdjava46.zadanie1.domain.Address;
import pl.sda.zdjava46.zadanie1.domain.User;

import java.util.ArrayList;
import java.util.List;

@Data
@Repository
public class ApplicationRepository {
    private List<User> users = new ArrayList<>();
    private List<Address> addresses = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void createUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public List<Address> getAddresses(){
        return addresses;
        }

    public void createAddress(Address address){
        addresses.add(address);
    }
    public void removeAddress(Address address){
        addresses.remove(address);
    }
}
