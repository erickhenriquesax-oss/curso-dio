package metodos.Atv.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import metodos.Atv.objetos.Funcionario;

public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Funcionario> func = new ArrayList<>();
        int opcao=0;
        System.out.println("Bem vindo!");
        int quantFunc = 0;
        double somaSalarios = 0;
        do{
            System.out.println("Deseja cadastrar um novo funcionario? (1 = sim | 0 = não): ");
            opcao=scan.nextInt();
            scan.nextLine();
            
            if (opcao == 1) {
                
                System.out.println("Digite o nome do funcionario");
                String nomeFunc = scan.nextLine();
                System.out.println("Digite a idade do funcionario");
                int idadeFunc = scan.nextInt();
                scan.nextLine();
                System.out.println("Digite o salario do funcionario");
                double salarioFunc = scan.nextDouble();
                scan.nextLine();
                somaSalarios +=salarioFunc;
                Funcionario f = new Funcionario(nomeFunc, idadeFunc, salarioFunc);
                func.add(f);
                quantFunc ++;
                

            }
            else{
                System.out.println("Finalizando operação");
            }
        }while(opcao==1);

        System.out.println("\n Funcionários Cadastrados: ");

        for (Funcionario funcionario : func) {
            funcionario.imprimirDados();
            System.out.println();
        }
        double mediaSalarios = somaSalarios / quantFunc;

        System.out.println("A media salarial dos funcionários cadastrados é de: "+mediaSalarios);
        scan.close();
    }


     
        
}   

