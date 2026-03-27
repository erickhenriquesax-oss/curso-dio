package metodos.Sobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.nome=nome;
        this.tipo=tipo;
        this.episodios=episodios;
        this.genero=genero;
        
    }
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio=estudio;
        
    }
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }
   
   

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }
    public String getNome(){
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public int getEpisodios() {
        return episodios;
    }
    public void setNome(){
        this.nome=nome;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }

    
}
