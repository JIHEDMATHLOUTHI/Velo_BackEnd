package com.jihedmathlouthi.veloback.ServiceImp;


import com.jihedmathlouthi.veloback.Entity.Role;
import com.jihedmathlouthi.veloback.Entity.User;
import com.jihedmathlouthi.veloback.Repository.RoleRepo;
import com.jihedmathlouthi.veloback.Repository.UserRepo;
import com.jihedmathlouthi.veloback.Service.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServicesImpl implements AdminServices {
    @Autowired
    UserRepo userRepository;
    @Autowired
    RoleRepo roleRepository;
    @Override
    public List<User> getall() {
        return userRepository.findAll();
    }

    @Override
    public void UpdateROle(Long id, String role) {

    }

    @Override
    public List<Role> getAllROles() {
        return roleRepository.findAll();
    }
}