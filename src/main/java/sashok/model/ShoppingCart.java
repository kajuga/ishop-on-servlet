package sashok.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart implements Serializable {
    private Map<Integer, ShoppingCartItem> products = new HashMap<>();
    private int totalCount = 0;

    public void addProduct(int idProduct, int count) {
        validateShoppingCartSize(idProduct);
    }








    private void validateShoppingCartSize(int idProduct) {


    }


}
