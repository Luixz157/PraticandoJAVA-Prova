package calculadora;

import java.util.Scanner;

public class CalculoArmazento {
    double Num1;
    double Num2;
    
    public void Pergunta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o Primeiro valor? ");
        Num1 = scan.nextFloat();
        System.out.println("Qual o Segundo valor? ");
        Num2 = scan.nextFloat();
        if (Num2 == 0) {
            System.out.println("Digite um Valor valido sem ser 0");
            Num2 = scan.nextFloat();
        } 
    }
    


}
