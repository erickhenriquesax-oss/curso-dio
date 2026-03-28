package domain;

public non-sealed  class Seller extends User {

    private int salesQuantity;

    public Seller(String email, String name, String password, boolean type) {
        super(email, name, password, false);
        this.salesQuantity = 0;
    }

    public Seller(){
        this.salesQuantity = 0;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(int salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public void incrementSalesQuantity() {
        this.salesQuantity++;
    }
}
