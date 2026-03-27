package modificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    //Bloco de inicialização é executado quando a classe é carregada, ou seja, antes mesmo de criar um objeto 
    //alocado espaço em memória pro objeto
    //feitos atributos e inicializado com nada ou o que vc colocar
    //Bloco de inicialização é executado
    //construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i<episodios.length; i++) {
            episodios[i] = i+1;
        }
        
        
    }
    static { //pode ter mais de um bloco de inicialização mas pega a ordem em que for colocado no código
        System.out.println("Dentro do bloco de inicialização 2");
        
    }
    { //pode ter mais de um bloco de inicialização mas pega a ordem em que for colocado no código
        System.out.println("Dentro do bloco de inicialização não estático");
        
    }
    
    
    public Anime(String nome) {
        this.nome = nome;
    }


    public Anime(){
        for (int i : Anime.episodios) {
            System.out.printf(i + " ");

        }
        System.out.println();
        System.out.println();
    }


    public String getNome() {
        return nome;
    }


    public int[] getEpisodios() {
        return episodios;
    }
}