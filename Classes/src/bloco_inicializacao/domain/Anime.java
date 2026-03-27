package bloco_inicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    //alocado espaço em memória pro objeto
    //feitos atributos e inicializado com nada ou o que vc colocar
    //Bloco de inicialização é executado
    //construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
         for (int i = 0; i<episodios.length; i++) {
            episodios[i] = i+1;
        }
        for (int i : episodios) {
            System.out.printf(i + " ");
        }
        System.out.println();
        }
    
    
    public Anime(String nome) {
        this.nome = nome;
    }


    public Anime(){
        episodios = new int[100];
    }


    public String getNome() {
        return nome;
    }


    public int[] getEpisodios() {
        return episodios;
    }
}