import static domain.ContactType.EMAIL;
import static domain.ContactType.PHONE;
import static domain.Sex.FEMALE;
import static domain.Sex.MALE;
import domain.Contact;
import domain.User;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        List<User> users = new ArrayList<>(generateUsers());
        //users.sort(Comparator.comparing(User::name));                     // ORDENANDO POR ORDEM ALFABÉTICA
        //var values = users.stream().filter(u -> u.contacts().size() >= 2) // PEGANDO APENAS OS QUE TEM PELO MENOS 2 CONTATOS
        var values = users.stream()
            .flatMap(u -> u.contacts().stream())                        // PEGANDO SOMENTE OS CONTATOS
            //.filter(c -> c.type() == EMAIL)                            // PEGANDO SOMENTE OS CONTATOS COM EMAIL
            .sorted(Comparator.comparing(Contact::description))        // ORDENANDO POR ORDEM ALFABETICA
            .map(c -> String.format("{\n    'description': '%s',\n    'type': '%s' \n}", c.description(), c.type()))
            //.filter(u -> u.contacts().stream().anyMatch(c -> c.type() == EMAIL)) // PEGANDO SOMENTE OS COM EMAIL
            //.filter(u -> u.contacts() == null || u.contacts().isEmpty())  // PEGANDO SOMENTE OS NULOS E VAZIOS
                .toList();     
        values.forEach(System.out::println);
    }

    private static List<User> generateUsers(){
        var contacts1 = List.of(
            new Contact("(19)90665-8104", PHONE),
            new Contact("joao@gmail.com", EMAIL)
        );
        var contacts2 = List.of(
            new Contact("(21)92121-0032", PHONE)
        );
        var contacts3 = List.of(
            new Contact("lucas@outlook.com", EMAIL)
        );
        var contacts4 = List.of(
            new Contact("andreia@outlook.com", EMAIL),
            new Contact("andreia@gmail.com", EMAIL)
        );
        var contacts5 = List.of(
            new Contact("(31),97785-4456", PHONE),
            new Contact("(31)92115-0011", PHONE)
        );

        var user1 = new User("João", 26, MALE, new ArrayList<>(contacts1));
        var user2 = new User("Maria", 28, FEMALE, new ArrayList<>(contacts2));
        var user3 = new User("Lucas", 19, MALE, new ArrayList<>(contacts3));
        var user4 = new User("Andreia", 40, MALE, new ArrayList<>(contacts4));
        var user5 = new User("Vitor", 30, MALE, new ArrayList<>(contacts5));
        var user6 = new User("Bruna", 36, FEMALE, new ArrayList<>());
        return List.of(user1, user2, user3, user4, user5, user6);
    }
}
