public class OldCustomerProductBuilder extends ProductBuilder { //concrete builder
    ProductViewModel model = new ProductViewModel();
    @Override
    public void getProductData() {
        model.id = 1;
        model.categoryName = "Beverage";
        model.productName = "Chai";
        model.unitPrice = 20;
    }

    @Override
    public void applyDiscount() {
        model.discountedPrice = (int) model.unitPrice;
        model.discountApplied = false;
    }

    @Override
    public ProductViewModel getModel() {
        return model;
    }
}
