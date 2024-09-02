package com.jihedmathlouthi.veloback.Repository;

import com.jihedmathlouthi.veloback.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo  extends JpaRepository<Product,Integer> {
    Product findByReference(String ref);
    Product findProductByIdProduct(int id);

    Product getProductByIdProduct(Integer productId);
//    List<Product> findByNameContainingIgnoreCaseAndBrandAndPriceContainingIgnoreCase(String name, String brand, float price);
}
