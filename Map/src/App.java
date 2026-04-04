
import domain.User;
import java.util.HashMap;
import java.util.Map;


public class App {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("joao@joao", new User("Joao", 22));
        users.put("maria@maria", new User("Maria", 32));
        users.put("teste@teste", new User("Teste", 18));
        System.out.println(users);
        System.out.println("=================");
        users.keySet().forEach(System.out::println);
        System.out.println();
        System.out.println("=================");
        users.values().forEach(System.out::println);

        System.out.println(users.containsKey("marcos@marcos.com"));
        System.out.println(users.containsValue(new User("Marcos", 42)));

        users.forEach((k, v) -> System.out.printf("Key %s | Value %s \n", k, v));
        System.out.println("=================");
        users.replace("teste@teste", new User("TesteziN", 25));
        users.forEach((k, v) -> System.out.printf("Key %s | Value %s \n", k, v));
        System.out.println(users.isEmpty());

        users.merge("maria@maria", new User("", -1), (user, user2) ->{
            System.out.println(user);
            System.out.println(user2);
            return user2;
        });
        System.out.println("=================");
        users.forEach((k, v) -> System.out.printf("Key %s | Value %s \n", k, v));

    }
}
