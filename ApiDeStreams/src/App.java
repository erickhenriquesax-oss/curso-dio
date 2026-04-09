import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<String> debugValues = new ArrayList<>();
        var value = Stream.of("Maria", "João", "Marcio", "Luana" , "Leandro", "Marcia") //filtrando os que tem "o", adicionando na variável debugValues e colocando numa lista
            .peek(debugValues::add)
            //.peek(System.out::println)
            .filter(name -> name.endsWith("o"))
            //.limit(2)
            .toList();

        var value1 = Stream.of("Maria", "João", "Marcio", "Luana" , "Leandro", "Marcia") //Verificando se algum tem 'a'
            .anyMatch(n -> n.contains("a"));

        var value2 = Stream.of("Maria", "João", "Marcio", "Luana" , "Leandro", "Marcia", "Leo") //Verificando se tem algum não contém 'a'
            .noneMatch(n -> n.contains("a"));   
            
        var value3 = Stream.of("Maria", "João", "Marcio", "Luana" , "Leandro", "Marcia") //Verificando se todos tem a letra 'J'
            .allMatch(n -> n.contains("J"));

        var value4 = Stream.of(1, 2, 3, 4, 5 ,6 ,7, 7, 7 ) //usando o distinct para remover valores repetidos
            .distinct().toList();

        var value5 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 7, 8)  //mapeando pra lista de booleanos, se o resto da divisão é 0
            .map(n -> n % 2 == 0)
            .toList();

        System.out.println(debugValues);
        System.out.println(value);
        System.out.println(value1 );
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
    }
}