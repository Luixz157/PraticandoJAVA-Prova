import java.util.Scanner;

public class Palindromo {
    public static void main(String[] argumentos) {
        Scanner scan = new Scanner(System.in);
        String PalavraInserida;
        String PalavraReversa = "";

        System.out.println("Escreva uam frase ou palavra para ver se é Polindromo: ");
        PalavraInserida = scan.nextLine();


        for(int i = (PalavraInserida.length() -1); i >= 0; i--) {
            PalavraReversa += PalavraInserida.charAt(i);
        }

        if(PalavraInserida.equals(PalavraReversa)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }
}
