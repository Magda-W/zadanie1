package pl.sda.zdjava46.zadanie1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.zdjava46.zadanie1.domain.User;
import pl.sda.zdjava46.zadanie1.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
@CrossOrigin(origins="*")
public class UserController {
    private final UserService userService;

    @GetMapping(value="/getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }


}
