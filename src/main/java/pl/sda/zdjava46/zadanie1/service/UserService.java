package pl.sda.zdjava46.zadanie1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.zdjava46.zadanie1.domain.User;
import pl.sda.zdjava46.zadanie1.repository.ApplicationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final ApplicationRepository applicationRepository;

    public void createUser(User user){
        applicationRepository.createUser(user);
    }
    public void removeUser(User user){
        applicationRepository.removeUser(user);
    }
    public List<User> getUsers(){
        return applicationRepository.getUsers();
    }

}
