import java.util.Scanner;



public class App {
    private final static Scanner scanner = new Scanner(System.in); 
    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) throws Exception {
        
        int option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastercer máquina com água");
            System.out.println("3 - Abastecer máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - sair");
            option = scanner.nextInt();

            switch (option) {
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 6 -> checkIfHasPetInMachine();
                case 5 -> verifyShampoo();
                case 4 -> verifyWater();
                case 3 -> setShampoo();
                case 2 -> setWater();
                case 1 -> petMachine.takeAShower();
                case 0 -> System.out.println("saindo");
                default -> System.out.println("Opção inválida");

                  
            
            }
        }while (option != 0);
    }

    private static void setWater(){
        System.out.println("Tentando colocar água na máquina");
        petMachine.addWater();
    }
    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na máquina");
        petMachine.addShampoo();
    }

    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet");
            name = scanner.nextLine();
        }
        System.out.println("Informe o nome do pet: ");
        name = scanner.next();
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + "foi colocado na máquina");
    }

    public static void checkIfHasPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }
    public static void verifyShampoo(){
                    var amout = petMachine.getShampoo();
                    System.out.println("A maquina está no momento com " + amout +" listros(s) de shampoo");        
    }
    public static void verifyWater(){
                    var amout = petMachine.getWater();
                    System.out.println("A maquina está no momento com " + amout +" listros(s) de água");        
    }
}
