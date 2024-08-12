import java.util.Scanner;

public class Sistema {

    private IO io;

    public Sistema() {
        io = new IO();
    }

    public void menu(){
        Calculadora calculadora = new Calculadora();

        int opcao = scanner("Digite a opção desejada: " +
                "\n 1 - soma" +
                "\n 2 - subtração" +
                "\n 3 - multiplicação" +
                "\n 4 - divisão").nextInt();
        double a = io.receberDados("Digite o primeiro valor: ");
        double b = io.receberDados("Digite o segundo valor: ");

        if(opcao == 1){
            //soma
            double result = calculadora.soma(a, b);
            io.exibirDados(result);
        } else if(opcao == 2){
            //subtração
            double result = calculadora.subtracao(a, b);
            io.exibirDados(result);
        } else if(opcao == 3){
            //multiplicação
            double result = calculadora.multiplicacao(a, b);
            io.exibirDados(result);
        } else if(opcao == 4){
            //divisão
            double result = calculadora.divisao(a, b);
            io.exibirDados(result);
        }
    }

    public void executar(){
        menu();
    }

    public static Scanner scanner (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
