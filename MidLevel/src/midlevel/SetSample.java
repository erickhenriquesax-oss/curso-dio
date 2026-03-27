package midlevel;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;  //não permite duplicidade e não tem "Código"

public class SetSample {
    

    public static void main(String[] args) {
        
        Set<String> nomes = new HashSet<>();

        nomes.add("Erick");
        nomes.add("Gabi");
        nomes.add("Emilly");
        nomes.add("Guilherme");
        nomes.add("Erick");


        //nomes.removeIf(nome -> nome.contains("a"));

         
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
      
