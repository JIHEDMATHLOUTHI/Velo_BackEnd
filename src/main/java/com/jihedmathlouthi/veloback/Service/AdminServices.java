package com.jihedmathlouthi.veloback.Service;


import com.jihedmathlouthi.veloback.Entity.Role;
import com.jihedmathlouthi.veloback.Entity.User;

import java.util.List;

public interface AdminServices {
    List<User> getall();
    void UpdateROle(Long id,String role);
    List<Role> getAllROles();
}
