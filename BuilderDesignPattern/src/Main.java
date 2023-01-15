public class Main {
    public static void main(String[] args) {
        ProductDirector productDirector = new ProductDirector();
        NewCustomerProductBuilder newCustomerProductBuilder = new NewCustomerProductBuilder();
        productDirector.generateProduct(newCustomerProductBuilder);
        System.out.println(newCustomerProductBuilder.getModel().id);

    }
}