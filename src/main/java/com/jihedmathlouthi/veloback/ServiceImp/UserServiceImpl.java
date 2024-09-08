package com.jihedmathlouthi.veloback.ServiceImp;


import com.jihedmathlouthi.veloback.Entity.User;
import com.jihedmathlouthi.veloback.Repository.UserRepo;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl {


    private final UserRepo userRepository;


    public long getUserIdFromUsername(String username) {
        User user = userRepository.findIdByUsername(username);
        if (user != null) {
            return user.getId();
        } else {
            // Handle case when user is not found
            return -1; // Or throw an exception, depending on your requirements
        }
    }


}

