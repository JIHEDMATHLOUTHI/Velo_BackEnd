package com.jihedmathlouthi.veloback.Service;





import com.jihedmathlouthi.veloback.Entity.Cart;
import com.jihedmathlouthi.veloback.Entity.Product;

import java.util.List;

public interface CartServiceInterface {
    public void deleteCartItem(Integer cartId);
    public Cart addToCart(Integer productId);
    public List<Product> getCartDetails();


}
