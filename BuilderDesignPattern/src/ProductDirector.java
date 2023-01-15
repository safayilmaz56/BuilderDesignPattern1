public class ProductDirector {  //director
    public void generateProduct(ProductBuilder productBuilder){
        productBuilder.getProductData();
        productBuilder.applyDiscount();

    }
}
