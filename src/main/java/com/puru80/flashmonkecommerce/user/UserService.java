package com.puru80.flashmonkecommerce.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }
}
