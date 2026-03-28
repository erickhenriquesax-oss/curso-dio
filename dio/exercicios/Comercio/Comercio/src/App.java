
import domain.Attendant;
import domain.Manager;
import domain.Sale;
import domain.Seller;
import domain.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    static int salesQuantity = 0;
    static Scanner scan = new Scanner(System.in);
    static List<Sale> sales = new ArrayList<>();
    static Attendant attendant = new Attendant("ana@app.com", "Ana", "ana123", false);

    public static void main(String[] args) {
        // mudar para novo usuário para testes:
        // printUser(new Attendant());
        // printUser(new Seller());
        printUser(new Manager());

    }

    public static void printUser(User user){
       
        switch (user){
            case Manager manager -> {
                manager.setName("João");
                manager.setEmail( "joao@app.com");
                manager.setPassword("teste123");
                requestLogin();
                String attempEmail ="";
                String attempPassword = "";
                do {
                    System.out.println("Digite seu email:");
                    attempEmail = scan.next();
                    System.out.println("Digite sua senha:");
                    attempPassword = scan.next();

                    if(!attempEmail.equals(manager.getEmail()) || !attempPassword.equals(manager.getPassword())) {
                        System.out.println("Usuário ou senha incorretos. Tente novamente.\n");
                    }

                }while(!attempEmail.equals(manager.getEmail()) || !attempPassword.equals(manager.getPassword()));

                System.out.println("Login realizado com sucesso!");
                int decision = 0;
                do {
                    decision = menuManager();
                    switch (decision) {
                        case 1 -> generateFinancialReport();
                        case 2 -> salesInquiries();
                        case 3 -> changeData(manager);
                        case 4 -> changePassword(manager);
                        case 0 -> System.out.println("Saindo...");
                        default -> System.out.println("Opção inválida");
                    }
                } while (decision != 0);
            }
            case Seller seller -> {
                seller.setName("Lucas");
                seller.setEmail( "lucas@app.com");
                seller.setPassword("lucas123");
                requestLogin();
                String attempEmail ="";
                String attempPassword = "";
                do {
                    System.out.println("Digite seu email:");
                    attempEmail = scan.next();
                    System.out.println("Digite sua senha:");
                    attempPassword = scan.next();

                    if(!attempEmail.equals(seller.getEmail()) || !attempPassword.equals(seller.getPassword())) {
                        System.out.println("Usuário ou senha incorretos. Tente novamente.\n");
                    }

                }while(!attempEmail.equals(seller.getEmail()) || !attempPassword.equals(seller.getPassword()));

                System.out.println("Login realizado com sucesso!");

                int decision = 0;
                do {
                    decision = menuSeller();
                    switch (decision) {
                        case 1 -> makeSale(seller);
                        case 2 -> salesInquiries();
                        case 3 -> changeData(seller);
                        case 0 -> System.out.println("Saindo...");
                        default -> System.out.println("Opção inválida");
                    }
                } while (decision != 0);
            }

            case Attendant attendant -> {
                attendant.setName("Ana");
                attendant.setEmail("ana@app.com");
                attendant.setPassword("ana123");
                requestLogin();
                String attempEmail ="";
                String attempPassword = "";
                do {
                    System.out.println("Digite seu email:");
                    attempEmail = scan.next();
                    System.out.println("Digite sua senha:");
                    attempPassword = scan.next();

                    if(!attempEmail.equals(attendant.getEmail()) || !attempPassword.equals(attendant.getPassword())) {
                        System.out.println("Usuário ou senha incorretos. Tente novamente.\n");
                    }

                }while(!attempEmail.equals(attendant.getEmail()) || !attempPassword.equals(attendant.getPassword()));

                System.out.println("Login realizado com sucesso!");

                int option = 0;
                do {
                    option = menuAttendant();
                    switch (option) {
                        case 1 -> {
                            System.out.println("Digite o valor a colocar em caixa:");
                            double value = scan.nextDouble();
                            attendant.putMoneyInTheBox(value);
                            System.out.println("Valor adicionado ao caixa.");
                        }
                        case 2 -> changeData(attendant);
                        case 3 -> changePassword(attendant);
                        case 0 -> System.out.println("Saindo...");
                        default -> System.out.println("Opção inválida");
                    }
                } while(option != 0);
            }
        }
    }

    public static void generateFinancialReport(){
        System.out.printf("Em caixa há: %.2f%n", attendant.getCashValue());
    }

    public static int menuManager(){
        System.out.println("1 - Relatório Financeiro");
        System.out.println("2 - Consultar Vendas");
        System.out.println("3 - Alterar Dados");
        System.out.println("4 - Alterar senha");
        System.out.println("0 - Sair");
        int decision = scan.nextInt();

        return decision;
    }

    public static int menuSeller(){
        System.out.println("1 - Registrar Venda");
        System.out.println("2 - Consultar Vendas");
        System.out.println("3 - Alterar Dados");
        System.out.println("4 - Alterar senha");
        System.out.println("0 - Sair");
        int decision = scan.nextInt();

        return decision;
    }

    public static int menuAttendant(){
        System.out.println("1 - Adicionar valor ao caixa");
        System.out.println("2 - Alterar dados");
        System.out.println("3 - Alterar senha");
        System.out.println("4 - Alterar Senha");
        System.out.println("0 - Sair");
        int decision = scan.nextInt();

        return decision;
    }

    public static void requestLogin(){
        System.out.println("Faça login para acessar o sistema.");
    }

    public static void salesInquiries(){
        if(!sales.isEmpty()){
            System.out.println("Consultando vendas...");
            for (Sale sale : sales) {
                System.out.printf("Quantidade vendida: %d, valor unitário: %.2f, valor final: %.2f%n",
                        sale.getAmount(), sale.getUnitValue(), sale.getTotalValue());
            }
        } else {
            System.out.println("Nenhuma venda registrada");
        }
    }

    public static void makeSale(Seller seller){
        Sale sale = new Sale();
        System.out.println("Digite a quantidade de produtos vendidos:");
        sale.setAmount(scan.nextInt());
        System.out.println("Digite o valor unitário da venda:");
        sale.setUnitValue(scan.nextDouble());

        sale.setSeller(seller);
        sales.add(sale);
        salesQuantity++;
        seller.incrementSalesQuantity();

        System.out.printf("Venda registrada: %d unidades, total R$ %.2f%n", sale.getAmount(), sale.getTotalValue());
    }
    public static void changeData(User user){
        System.out.println("Digite seu novo nome:");
        String newName = scan.next();
        user.setName(newName);
        System.out.println("Nome atualizado com sucesso!");
        System.out.println("Digite seu novo email:");
        String newEmail = scan.next();
        user.setEmail(newEmail);
        System.out.println("Email atualizado com sucesso!");
    }
    public static void changePassword(User user){
        System.out.println("Digite sua senha atual:");
        String currentPassword = scan.next();
        if (currentPassword.equals(user.getPassword())) {
            System.out.println("Digite sua nova senha:");
            String newPassword = scan.next();
            user.setPassword(newPassword);
            System.out.println("Senha atualizada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta.");
        }
    }
}