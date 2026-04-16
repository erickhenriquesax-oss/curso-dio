package br.com.dio;

import java.sql.Date;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import br.com.dio.dao.UserDAO;
import br.com.dio.exception.EmptyStoreException;
import br.com.dio.exception.UserNotFoundException;
import br.com.dio.exception.ValidatorException;
import br.com.dio.model.MenuOption;
import br.com.dio.model.UserModel;
import br.com.dio.Validator.*;

public class App {
    private final static UserDAO userDAO = new UserDAO();
    private final static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
            while(true){
            UserDAO dao = new UserDAO();
            System.out.println("Bem vindo ao cadastro de usuários, selecione a opção desejada: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Buscar por identificador");
            System.out.println("5 - Listar");
            System.out.println("6 - Sair");
            var userOption = scan.nextInt();
            var selectedOption = MenuOption.values()[userOption - 1];
            switch(selectedOption){
                case SAVE -> {
                    try{
                    var user = dao.save(requestToSave());
                    System.out.println("Usuário salvo com sucesso: " + user);
                    }catch(ValidatorException ex){
                        System.out.println("Erro de validação: " + ex.getMessage());
                        ex.printStackTrace();
                    }
                    finally{
                        System.out.println("================================");
                    }
                }
                case UPDATE -> {
                    try{
                    var user = dao.update(requestToUpdate());
                    System.out.println("Usuário atualizado com sucesso: " + user);
                    }catch(UserNotFoundException | EmptyStoreException ex){
                        System.out.println(ex.getMessage());
                    }catch(ValidatorException ex){
                        System.out.println("Erro de validação: " + ex.getMessage());
                        ex.printStackTrace();
                    }finally{
                        System.out.println("================================");
                    }
                }
                case DELETE -> {
                    try{
                        dao.delete(requestId());
                        System.out.println("Usuário excluído"); 
                    }catch(UserNotFoundException | EmptyStoreException ex){
                        System.out.println(ex.getMessage()); 
                    }finally{
                        System.out.println("================================");
                    }
                }
                case FIND_BY_ID -> {
                    try{
                        var id =  requestId();
                        var user = dao.findById(id);
                        System.out.println("Usuários encontrados com id " + id + ": ");
                        System.out.println(user);
                    }catch(UserNotFoundException ex){
                        System.out.println(ex.getMessage());
                    }catch(EmptyStoreException ex){
                        System.out.println(ex.getMessage());
                    }
                }
                case FIND_ALL -> {
                    var users = dao.findAll();
                    System.out.println("Usuários encontrados: ");
                    System.out.println("===============================");
                    users.forEach(System.out::println);
                    System.out.println("===============================");
                }
                case EXIT -> System.exit(0);
            }
         }
        
    }


    private static Long requestId(){
        System.out.println("Digite o identificador do usuário: ");
        return scan.nextLong();
    }

    private static UserModel requestToSave() throws ValidatorException{
        System.out.println("Digite o nome do usuário: ");
        var name = scan.next();
        System.out.println("Digite o email do usuário: ");
        var email = scan.next();
        System.out.println("Digite a data de nascimento do usuário (dd/MM/yyyy): ");
        var birthDate = scan.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthDate, formatter);
       
        return validateInputs(0, name, email, birthday);
        
    }
    
    private static UserModel validateInputs(final long id, final String name, final String email, final LocalDate birthday) throws ValidatorException {
        var user = new UserModel(id, name, email, birthday);
        
        UserValidator.verifyModel(user);
        return user;
    }

    
      private static UserModel requestToUpdate() throws ValidatorException{
        System.out.println("Digite o identificador do usuário: ");
        var id = scan.nextLong();
        System.out.println("Digite o nome do usuário: ");
        var name = scan.next();
        System.out.println("Digite o email do usuário: ");
        var email = scan.next();
        System.out.println("Digite a data de nascimento do usuário (dd/MM/yyyy): ");
        var birthDate = scan.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthDate, formatter);
        return validateInputs(id,name, email, birthday);


    }
}
