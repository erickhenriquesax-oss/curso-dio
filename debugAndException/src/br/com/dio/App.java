package br.com.dio;

import java.sql.Date;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import br.com.dio.dao.UserDAO;
import br.com.dio.exception.EmptyStoreException;
import br.com.dio.exception.UserNotFoundException;
import br.com.dio.model.MenuOption;
import br.com.dio.model.UserModel;

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
                    var user = dao.save(requestToSave());
                    System.out.println("Usuário salvo com sucesso: " + user);
                }
                case UPDATE -> {
                    try{
                    var user = dao.update(requestToUpdate());
                    System.out.println("Usuário atualizado com sucesso: " + user);
                    }catch(UserNotFoundException | EmptyStoreException ex){
                        System.out.println(ex.getMessage());
                    }
                }
                case DELETE -> {
                    try{
                        dao.delete(requestId());
                        System.out.println("Usuário excluído"); 
                    }catch(UserNotFoundException | EmptyStoreException ex){
                        System.out.println(ex.getMessage()); 
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

    private static UserModel requestToSave(){
        System.out.println("Digite o nome do usuário: ");
        var name = scan.next();
        System.out.println("Digite o email do usuário: ");
        var email = scan.next();
        System.out.println("Digite a data de nascimento do usuário (dd/MM/yyyy): ");
        var birthDate = scan.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthDate, formatter);
        System.out.println("Usuário cadastrado com sucesso!");
        return new UserModel(0L,name, email, birthday);
        
    }

    
      private static UserModel requestToUpdate(){
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
        System.out.println("Usuário atualizado com sucesso!");
        return new UserModel(id,name, email, birthday);


    }
}
