import java.util.Scanner;

public class User {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu nome por favor");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + " bem vindo(a) a calculadora. Vamos iniciar nossas contas");
        System.out.println("Possuimos quatro operações lógicas \nSoma, Subtração, Multiplicação, Produto");
        System.out.println("Ao digitar a informação a seguir insira \na operação seguida dos números");
        System.out.println("Os nomes das operações devem ser escritos como;\n 1) soma;\n 2) subtracao;\n 3) produto;\n 4) divisao.");


        Boolean cond = true;
        while (cond.equals(true)) {
            System.out.println("Insira a operaçao e os números abaixo:");
            String operacao = scanner.nextLine();
            String[] opera = operacao.split(" ");

            double x = Double.parseDouble(opera[1]);
            double y = Double.parseDouble(opera[2]);

            if (y == 0.0) {
                System.out.println("Não é possivel fazer a divisão pelo número 0");
            } else {
                if (opera[0].equals("soma") || opera[0].equals("1")) {
                    soma(x, y);
                } else if (opera[0].equals("subtracao") || opera[0].equals("2")) {
                    subtracao(x, y);
                } else if (opera[0].equals("produto") || opera[0].equals("3")) {
                    produto(x, y);
                } else if (opera[0].equals("divisao") || opera[0].equals("4")) {
                    divisao(x, y);
                } else {
                    System.out.println("insira ima operção lógica dentre as que foram passadas");
                }

            }
            System.out.println("Deseja executar mais contas?\n 1) Sim;\n 2) Não");
            String resposta = scanner.nextLine();
            if (resposta.equals("2") || resposta.equals("Não")){
                cond = false;
            }
        }
    }



    static void soma(double x, double y){
        double valor = x + y;
        System.out.println("O valor da soma é: " +  valor);
    }
    static void subtracao(double x, double y){
        double valor =x - y;
        System.out.println("O valor da subtracao é: " +  valor);
    }
    static void produto(double x, double y){
        double valor = x * y;
        System.out.println("O valor do produto é: " +  valor);
    }
    static void divisao(double x, double y){
        double valor = x / y;
        System.out.println("O valor da divisao é: " +  valor);
    }
}
