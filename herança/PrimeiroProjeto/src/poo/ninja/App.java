package poo.ninja;

public class App {

    public static void main(String[] args) {

        AlunoNinja aluno = new AlunoNinja(
            "Naruto",
            17,
            "Folha",
            "Uzumaki",
            "Kunai",
            "Rasengan",
            "Time 7",
            "Kakashi"
        );

        aluno.apresentarse();
        aluno.realizarJutso();
        aluno.realizarInvocacao();
        System.out.println(aluno);
    }
}
