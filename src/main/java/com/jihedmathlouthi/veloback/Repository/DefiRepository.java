package com.jihedmathlouthi.veloback.Repository;

import com.jihedmathlouthi.veloback.Entity.Defi;
import com.jihedmathlouthi.veloback.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DefiRepository extends JpaRepository<Defi, Long> {

        @Query("SELECT c FROM Defi c  where c.status=false and c.DateSortie > CURRENT_DATE() ")
        List<Defi> getDefi();

}