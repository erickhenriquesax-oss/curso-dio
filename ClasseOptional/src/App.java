import java.util.Optional;

import static domain.SexEnum.FEMALE;
import static domain.SexEnum.MALE ;

import domain.User;

public class App {
    public static void main(String[] args){
        //Optional<User> optional = Optional.ofNullable(new User( "Joao", 18, MALE));
        Optional<User> optional = Optional.ofNullable(null);

        System.out.println(optional.orElseThrow(() -> new RuntimeException("Errou")));
        System.out.println(optional.orElse(new User( "Maria", 22, FEMALE)));
        

        //int newAge = 22;
        //System.out.println(optional.isPresent());
        //System.out.println(optional.get());
        //System.out.println(optional);

        //optional.ifPresentOrElse(
          //  user -> {
            //    System.out.printf("Usuário: %s \n", user);
              //  user = new User("João", newAge, MALE);
                //System.out.printf("Usuário: %s \n", user);
            //},
            //() -> System.out.println("Não foi informado um usuário")
        //);

        //optional.ifPresent(System.out::println);
    }
}
