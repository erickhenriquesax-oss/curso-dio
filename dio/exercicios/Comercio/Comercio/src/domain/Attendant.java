package domain;

public non-sealed class Attendant extends User {
    private double cashValue;
    public Attendant(String email, String name, String password, boolean type) {
        super(email, name, password, type);
        type = false;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void putMoneyInTheBox(double cashValue) {
        this.cashValue += cashValue ;
    }
    
}
