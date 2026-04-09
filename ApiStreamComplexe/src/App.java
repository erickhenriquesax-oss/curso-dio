import domain.Contact;
import domain.ContactType;
import static domain.Sex.FEMALE;
import static domain.Sex.MALE;
import domain.User;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
    }

    private static List<User> generateUsers(){
        var contacts1 = List.of(
            new Contact("(19)90665-8104", ContactType.PHONE),
            new Contact("joao@gmail.com", ContactType.EMAIL)
        );
        var contacts2 = List.of(
            new Contact("(21)92121-0032", ContactType.PHONE)
        );
        var contacts3 = List.of(
            new Contact("lucas@outlook.com", ContactType.EMAIL)
        );
        var contacts4 = List.of(
            new Contact("", ContactType.PHONE),
            new Contact("", ContactType.EMAIL)
        );
        var contacts5 = List.of(
            new Contact("", ContactType.PHONE),
            new Contact("", ContactType.EMAIL)
        );

        var user1 = new User("João", 26, MALE, new ArrayList<>(contacts1));
        var user2 = new User("Maria", 28, FEMALE, new ArrayList<>(contacts2));
        var user3 = new User("Lucas", 0, MALE, new ArrayList<>(contacts3));
        var user4 = new User("", 0, MALE, new ArrayList<>(contacts4));
        var user5 = new User("", 0, MALE, new ArrayList<>(contacts5));
        return List.of(user1, user2, user3, user4, user5);
    }
}
