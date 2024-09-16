package calculadora;

public class Main {
    public static void main(String[] argumentos) {
        CalculoArmazento calculadoPergunta = new CalculoArmazento();
        calculadoPergunta.Pergunta();

        Somar soma = new Somar();
        System.out.println("Somar: "+soma.resultado(calculadoPergunta.Num1, calculadoPergunta.Num2));

        Divisao dividi = new Divisao();
        System.out.println("Divisão: "+dividi.dividir(calculadoPergunta.Num1, calculadoPergunta.Num2));

    }
}
