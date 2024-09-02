package com.jihedmathlouthi.veloback;

import com.jihedmathlouthi.veloback.Entity.Role;
import com.jihedmathlouthi.veloback.Enum.ERole;
import com.jihedmathlouthi.veloback.Repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class VeloBackApplication {
    @Autowired
    RoleRepo roleRepository;

    public static void main(String[] args) {
        SpringApplication.run(VeloBackApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    @Bean
    CommandLineRunner start() {
        return args -> {

            for (ERole r1 : ERole.values()
            ) {

                if (!roleRepository.existsByName(r1)) {
                    Role r = new Role(r1);
                    roleRepository.save(r);
                }
            }

        };
    }

}
