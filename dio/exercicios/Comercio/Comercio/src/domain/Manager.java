package domain;

public non-sealed class Manager extends User {

    public Manager(String email, String name, String password, boolean type) {
        super(email, name, password, type);
        type = false;
    }
    public Manager(){
        
    }
    

    
}