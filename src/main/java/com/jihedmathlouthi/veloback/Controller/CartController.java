package com.jihedmathlouthi.veloback.Controller;



import com.jihedmathlouthi.veloback.Entity.Cart;
import com.jihedmathlouthi.veloback.Entity.Product;
import com.jihedmathlouthi.veloback.Repository.UserRepo;
import com.jihedmathlouthi.veloback.Service.CartServiceInterface;
import com.jihedmathlouthi.veloback.ServiceImp.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartServiceInterface cartService;
    @Autowired
    private UserRepo userDao;
    @Autowired
    private ProductService productService;
    @PreAuthorize("hasRole('ROLE_MEMBRE')")

   // @PreAuthorize("hasRole('User')")
    @GetMapping({"/addToCart/{productId}"})
    public Cart addTocart(@PathVariable(name="productId") Integer productId) {
        return cartService.addToCart(productId);

    }
    @PreAuthorize("hasRole('ROLE_MEMBRE')")
    @DeleteMapping({"/deleteCartItem/{cartId}"})
    public void deleteCartItem(@PathVariable(name= "cartId") Integer cartId) {
        cartService.deleteCartItem(cartId);
    }



    @PreAuthorize("hasRole('ROLE_MEMBRE')")
    @GetMapping({"/getCartDetails"})
    public List<Product> getCartDetails() {
        return cartService.getCartDetails();

    }
    @PreAuthorize("hasRole('ROLE_MEMBRE')")
    @GetMapping("/api/removeProductFromCart/{productId}")
    public void removeProductFromCart(@PathVariable(name= "productId") Integer productId) {
        productService.removeProductFromCart(productId);
    }

    /*@GetMapping("/getUserFromUsername")
    public User getUserFromUsername() {
        return cartService.getuserfromusername();
    }
*/
}