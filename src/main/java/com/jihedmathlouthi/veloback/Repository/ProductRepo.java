package com.jihedmathlouthi.veloback.Repository;

import com.jihedmathlouthi.veloback.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo  extends JpaRepository<Product,Integer> {
}
