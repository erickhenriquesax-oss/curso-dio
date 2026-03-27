package metodos.test;

import metodos.dominio.Calculadora;

public class CalculadoraTest01{
    public static void main(String[] args) {
        
    
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros(); 
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(2, 6);
        System.out.println("Finalizando calculadora teste");
        calc.somaVarArgs(2,5,3,7,98,4,3,43,65,1);//array mais fácil pra métodos de um objeto
        
    }
}