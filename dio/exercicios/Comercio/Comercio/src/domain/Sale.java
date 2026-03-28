package domain;

public class Sale {
    protected int amount;
    protected double unitValue;
    protected Seller seller;

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double getUnitValue() {
        return unitValue;
    }
    public void setUnitValue(double unitValue) {
        this.unitValue = unitValue;
    }
    public double getTotalValue() {
        return amount * unitValue;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    
}

