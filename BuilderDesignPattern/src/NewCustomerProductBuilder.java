public class NewCustomerProductBuilder extends ProductBuilder{ //concrete builder

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
        model.discountedPrice = (int) (model.unitPrice * 0.9);
        model.discountApplied = true;
    }

    @Override
    public ProductViewModel getModel() {
        return model;
    }
}
