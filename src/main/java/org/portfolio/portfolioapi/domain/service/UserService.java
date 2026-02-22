package org.portfolio.portfolioapi.domain.service;

import lombok.RequiredArgsConstructor;
import org.portfolio.portfolioapi.domain.model.UserModal;
import org.portfolio.portfolioapi.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public List<UserModal> getUser() {
        return userRepository.findAll();
    }
    public UserModal saveUser(UserModal user) {
        return userRepository.save(user);
    }
}
