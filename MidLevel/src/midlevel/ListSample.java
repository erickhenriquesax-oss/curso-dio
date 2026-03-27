package midlevel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListSample {
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        List<Pessoa> pessoasDB = new ArrayList<>();

        
        nomes.add("Erick");
        nomes.add("Emilly");
        nomes.add("Gabi");
        nomes.add("Guilerme");

        nomes.remove(0);
        
        for (String nome : nomes) {
           System.out.println(nome);
        }

        LinkedList<String> nomesLigados = new LinkedList<>();

        nomesLigados.add("Gabi");
        nomesLigados.add("Emilly");
        nomesLigados.add("Guilherme");
        nomesLigados.add("Erick");


        System.out.println();

        System.out.println(nomesLigados.getFirst());
        System.out.println(nomesLigados.getLast());


        CopyOnWriteArrayList<String> nomesThreadSafe = new CopyOnWriteArrayList<>();
        System.out.println();
        List<String> nomesVector = new Vector<>(); //Vector é thread safe, ou seja, é seguro para uso em ambientes multithread, mas tem um desempenho inferior ao ArrayList em ambientes de thread única devido à sincronização. O CopyOnWriteArrayList é uma alternativa mais eficiente para ambientes multithread, pois cria uma nova cópia da lista a cada modificação, permitindo leituras sem bloqueios.
        nomesVector.add("Juliano");

        for (String nomeVector : nomesVector) {
            System.out.println(nomeVector);
        }
        }

    }

