import br.com.dio.calc.Operation;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scan = new Scanner(System.in);
        System.out.println("Informe o número da  operação que deseja realizar(1 - sum, 2 - subtraction)");
        var operationOption = scan.nextInt();
        while (operationOption >2 || operationOption <1) { 
            System.out.println("Escolha uma opção válida (1 - sum, 2 - subtraction)");
            operationOption = scan.nextInt(); 
        }
        var selectedOperation = Operation.values()[operationOption - 1];
        System.out.println("Informe os números que serão utilizados separados por vírgula (ex: 1,2,3,4)");
        var numbers = scan.next();
        var numberArray = Arrays.stream(numbers.split(","))
            .mapToLong(Long::parseLong)
            .toArray();

        var result  = selectedOperation.getOperationCallback().exec(numberArray);

        System.out.printf("O resultado da operação é %s \n", result);
    }
}
