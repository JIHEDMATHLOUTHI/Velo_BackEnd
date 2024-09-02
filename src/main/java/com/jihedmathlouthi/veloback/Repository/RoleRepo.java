package com.jihedmathlouthi.veloback.Repository;




import com.jihedmathlouthi.veloback.Entity.Role;
import com.jihedmathlouthi.veloback.Enum.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role,String> {
    Optional<Role> findByName (ERole name);
    boolean existsByName(ERole r1);
}
