package com.jihedmathlouthi.veloback.ServiceImp;



import com.jihedmathlouthi.veloback.Entity.Role;
import com.jihedmathlouthi.veloback.Repository.RoleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepo roleRepo;

    public Role createNewRole(Role role) {
        return roleRepo.save(role);
    }
}
