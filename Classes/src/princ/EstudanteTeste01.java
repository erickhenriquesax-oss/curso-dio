package princ;

import objetos.EstudanteTeste;
import objetos.ImprimeEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        EstudanteTeste estudante01 = new EstudanteTeste();
        EstudanteTeste estudante02 = new EstudanteTeste();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante01.nome="Midorya";
        estudante01.idade=15;
        estudante01.sexo='M';

        estudante02.nome="Sakura";
        estudante02.idade=16;
        estudante02.sexo='F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        

       
        
    }
}