import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        var value = "java;java;java;java";
        value = value.replaceFirst("j", "J"); // Verifica se começa com
        System.out.println(value);
        value = value.replace("j", "J"); // Substitui
        System.out.println(value);
        var values = value.split(";", 2); // Divide em arrays

        for(var v : values){
            System.out.println(v);
        }
        var teste = "/****java****/";
        System.out.println(teste.substring(4, 10)); //Extrai de x ponto até x ponto
        System.out.println(value.toLowerCase()); // Transforma em minúsculo
        System.out.println(value.toUpperCase()); // Transforma em maiúsculo
        System.out.println(value.contains(";")); //Verifica se contém x caracter
        System.out.println(value.indexOf("J", 2, 6)); /* Verifica a posição
        do caracter começando em x posição até x posição*/ 
        System.out.println(value.startsWith("Ja")); //Verifica se começa com
        System.out.println(value.endsWith(";")); //Verifica se termina com
        System.out.println(value.isBlank()); //Verifica se não há nada, desconsiderando espaços
        System.out.println(value.trim());//Elimina espaços em branco
        var eu = "e";
        System.out.println(eu.repeat(5));
        var testeValue = """
                {"name":"Joao","age": 18}
                """;
        System.out.println(testeValue);
        Map<String, String> map= new HashMap<>();
        while(map.size() != 2){
            var startKeyIndex = testeValue.indexOf( "\"");
            var endKeyIndex = testeValue.indexOf("\":");
            var keyValue = testeValue.substring(startKeyIndex + 1, endKeyIndex);

            var startValueIndex = testeValue.indexOf( ":\"");
            var endValueIndex = testeValue.indexOf("\"", startValueIndex);
            var valueKey = testeValue.substring(startValueIndex + 1, endValueIndex);
            map.put(keyValue, valueKey);
        }
        System.out.println(map);
        
    }

}
