package domain;
public sealed abstract class User permits Attendant, Manager, Seller {
    protected String name;
    protected String email;
    protected String password;
    protected boolean type;

    
    public User(String email, String name, String password, boolean type) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.type = type;
        
    }
    public User(){}
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type == false ? "Usuário padrão" : "Administrador";
    }


}
