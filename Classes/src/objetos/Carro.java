package objetos;

public class Carro {
    private String nome;
    private String modelo;
    private int ano;

    public Carro(){
    }
    public Carro(String nome, String modelo, int Ano){
        this.nome=nome;
        this.modelo=modelo;
        this.ano=ano;
    }

    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getModelo(){
        return modelo;
    }
     public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }
}
