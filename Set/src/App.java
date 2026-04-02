
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User (1, "Jão"));
        users.add(new User (2, "Maria"));
        users.add(new User (3, "Juca"));
        users.add(new User (4, "Leo"));
        users.add(new User (4, "Leo"));

        //System.out.println(new User(1, "Jão").equals(new User(1, "Jão")));

        System.out.println((new User (1, "Jão").hashCode()));
        users.removeIf(Predicate.not(user ->user.getId() > 2));

        System.out.println(users.contains(new User(1, "Jão")));

        users.forEach(System.out::println);

    }
}
