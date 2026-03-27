package poo.ninja;

public class AlunoNinja extends Ninja {

    private String nomeTime;
    private String nomeProfessor;

    public AlunoNinja(String nome, int idade, String aldeia, String cla,
                      String equipamento, String nomeJutsu,
                      String nomeTime, String nomeProfessor) {

        // chamada correta do construtor da classe pai
        super(nome, idade, aldeia, cla, equipamento, nomeJutsu);

        this.nomeTime = nomeTime;
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    @Override
    public void apresentarse() {
        System.out.println(
            "Olá meu nome é " + getNome() +
            " sou do cla " + getCla() +
            " e meu time é " + nomeTime
        );
    }

    public void realizarInvocacao() {
        System.out.println("Realizando invocação de um doguinho 🐶");
    }
}
