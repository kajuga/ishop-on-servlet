package sashok;

public final class Constants {
    public static final String CURRENT_SHOPPING_CART = "CURRENT_SHOPPING_CART";
    public static final int MAX_PRODUCT_COUNT_PER_SHOPPING_CART = 10;   //мах количество одного продукта в корзине
    public static final int MAX_PRODUCTS_PER_SHOPPING_CART = 20;        //мах количество продуктов разных типов в корзине


    public enum Cookie {

        SHOPPING_CART("iSCC", 60 * 60 * 24 * 365);

        private final String name;
        private final int ttl;

        Cookie(String name, int ttl) {
            this.name = name;
            this.ttl = ttl;
        }

        public String getName() {
            return name;
        }

        public int getTtl() {
            return ttl;
        }
    }
//.
    /*public static class Color {

        public final static Color RED = new Color("красный");
        public final static Color BLACK = new Color("черный");

        private String nameByRussian;

        private Color(String nameByRussian) {
            this.nameByRussian = nameByRussian;
        }
    }*/
}