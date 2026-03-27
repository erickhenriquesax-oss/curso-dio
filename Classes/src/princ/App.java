package princ;

import objetos.Estudante;

public class App {
    public static void main(String[] args) {
        
        Estudante estudante1 = new Estudante();
        estudante1.setNome("João");
        estudante1.setIdade(20);
        estudante1.setSexo("Masculino");

        System.out.println("Nome: " + estudante1.getNome() + ", Idade: " + estudante1.getIdade() + ", Sexo: " + estudante1.getSexo());
        
    }

}
