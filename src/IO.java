import java.util.Scanner;

public class IO {

    public Calculadora calculadora = new Calculadora();

    public double receberDados(String message){
        System.out.println(message);
        return new Scanner(System.in).nextDouble();
    }

    public static void exibirDados(double result){
        System.out.println(result);
    }
}
