public non-sealed class Salesman extends Employee {
    
    private double percentPerSold;

    public double getPercentPerSold() {
        return percentPerSold;
    }

    
    public Salesman(String code, String name, String address, int age, double salary, double percentPerSold) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
    }


    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    
}
