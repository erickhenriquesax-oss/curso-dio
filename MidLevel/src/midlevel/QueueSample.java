package midlevel;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        
        Queue<String> filaPessoas = new LinkedList<>(); 

        filaPessoas.add("Erick");
        filaPessoas.add("Gabi");
        filaPessoas.add("Guilherme");
        filaPessoas.add("Emilly");

        PriorityQueue<String> filaOrdenada = new PriorityQueue<>(); //priority ordena a lista
        filaOrdenada.addAll(filaPessoas);
         
        filaOrdenada.forEach(item -> System.out.println(item));
        

     // filaPessoas.poll();///remove o primeiro da fila
     //   filaPessoas.remove();//remove o primeir da fila só que dá um trows(excessão) se a fila estive vazia   
        filaPessoas.peek();// vê o primeiro da fila

        System.out.println(filaPessoas.peek());

        //filaPessoas.clear(); //limpa a lista inteira

    

    }
}
