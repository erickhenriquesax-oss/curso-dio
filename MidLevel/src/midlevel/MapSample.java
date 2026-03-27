package midlevel;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSample {
    public static void main(String[] args) {
        
        TreeMap<String, Integer> concessionaria = new TreeMap<>(); //TreeMap ordena a lista por chave (ordem alfabetica), LinkedHashMap mantém a ordem de inserção, HashMap não tem ordem definida

        concessionaria.put("BMW", 6);
        concessionaria.put("Fiat", 12);
        concessionaria.put("Audi", 2);
        concessionaria.put("GM", 10);
        concessionaria.put("BMW", null); //sobrescreve o valor da chave

        //System.out.println(concessionaria.get("BMW")); //pega o valor da chave
        //System.err.println(concessionaria.getOrDefault("Bulgati", 0));
        //System.out.println(concessionaria.containsKey("Bulgati")); //verifica se a chave existe

        System.out.println();

        concessionaria.forEach((chave, valor) -> {
            System.out.println(chave + " - " + valor);
                });
        System.out.println("-----------------------------");
        concessionaria.values().forEach(valor -> System.out.println(valor)); //imprime somente os valores

        System.out.println("-----------------------------");

        System.out.println("Primeira chave: " + concessionaria.firstKey());
        System.out.println("Última chave: " + concessionaria.lastKey());
    }
}
