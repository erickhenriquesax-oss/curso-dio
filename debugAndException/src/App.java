import java.sql.Date;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.dio.dao.UserDAO;
import br.com.dio.model.MenuOption;
import br.com.dio.model.UserModel;

public class App {
    private final static UserDAO userDAO = new UserDAO();
    private final static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
         
         System.out.println("Bem vindo ao cadastro de usuários, selecione a opção desejada: ");
         System.out.println("1 - Cadastrar");
         System.out.println("2 - Atualizar");
         System.out.println("3 - Excluir");
         System.out.println("4 - Buscar por identificador");
         System.out.println("5 - Listar");
         System.out.println("6 - Sair");
         var userOption = scan.nextInt();

         while(true){
            var selectedOption = MenuOption.values()[userOption - 1];
            switch(selectedOption){
                case SAVE -> {
                    UserModel user = requestUserInfo();
                    userDAO.save(user);
                    System.out.println("Usuário salvo com sucesso!");
                }
                // Adicione outros cases aqui
            }
         }
        
    }

    private static UserModel requestUserInfo(){
        System.out.println("Digite o nome do usuário: ");
        var name = scan.next();
        System.out.println("Digite o email do usuário: ");
        var email = scan.next();
        System.out.println("Digite a data de nascimento do usuário (dd/MM/yyyy): ");
        var birthDate = scan.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(birthDate, formatter);
        OffsetDateTime birthday = localDate.atStartOfDay().atOffset(ZoneOffset.UTC);
        return new UserModel(0L, name, email, birthday);
    }
}
