package org.portfolio.portfolioapi.core.controller;

import lombok.RequiredArgsConstructor;
import org.portfolio.portfolioapi.domain.model.UserModal;
import org.portfolio.portfolioapi.domain.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<?> saveUser(){
        Map<String, String> emails = new HashMap<>();
        emails.put("personal", "camposdlucasoli@gmail.com");
        emails.put("work", "lucasolisocialmedia@gmail.com");

        Map<String, String> phones = new HashMap<>();
        phones.put("mobile-personal", "+55 11 95073-5140");
        phones.put("mobile-work", "+55 11 95073-5140");

        Map<String, String> socialMediaLinks = new HashMap<>();
        socialMediaLinks.put("github", "https://www.github.com/lucasoliveira04");
        socialMediaLinks.put("linkedin", "https://www.linkedin.com/in/lucas-campos-oliveira/");

        UserModal user = UserModal.builder()
                .firstName("Lucas")
                .lastName("Campos")
                .emails(emails)
                .phoneNumbers(phones)
                .socialMediaLinks(socialMediaLinks)
                .build();
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @GetMapping("/get")
    public ResponseEntity<List<UserModal>> getUser() {
        return ResponseEntity.ok(userService.getUser());
    }

}
