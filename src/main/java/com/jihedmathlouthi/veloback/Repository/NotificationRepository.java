package com.jihedmathlouthi.veloback.Repository;



import com.jihedmathlouthi.veloback.Entity.Notification;
import com.jihedmathlouthi.veloback.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {


    List<Notification> findByUserEnvoyer(User user);
}
