package princ;

import java.util.Scanner;

import objetos.Carro;

public class Atv01{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println("Digite o nome do primeiro carro");
        carro1.setNome(scan.nextLine());
        System.out.println("Digite o ano do primeiro carro");
        carro1.setAno(scan.nextInt());
        scan.nextLine();
        System.out.println("Digite o modelo do primeiro carro");
        carro1.setModelo(scan.nextLine());

        System.out.printf("Carro 1: %s, é do ano: %d, e o seu modelo: %s ",carro1.getAno(), carro1.getAno(), carro1.getModelo());
        System.out.println();
        System.out.println("Digite o nome do segundo carro");
        carro2.setNome(scan.nextLine());
        System.out.println("Digite o ano do segundo carro");
        carro2.setAno(scan.nextInt());
        scan.nextLine();
        System.out.println("Digite o modelo do segundo carro");
        carro2.setModelo(scan.nextLine());

        System.out.printf("Carro 2: %s, é do ano: %d, e o seu modelo: %s ",carro2.getAno(), carro2.getAno(), carro2.getModelo());
    }
}