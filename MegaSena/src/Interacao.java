import java.util.Scanner;

public class Interacao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // O objeto Scanner pern=mite interacoes com a linha de comando.
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Bem vindo novamente " + nome);
    }
}
