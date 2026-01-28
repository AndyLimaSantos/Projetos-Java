public class MeuPrimeiroPrograma {

    public static void main(String[] args){
        //temos algumas nomenclaturas a seguir aqui, temos:

        //public: garante que o metodo possa ser chamado pela máquina virtual JVM de qualquer lugar.

        //static: permite que o metodo seja invocado sem instanciar a classe permitindo que JVM inicie o programa
        //sem criar objetos previos.

        //void: indica que o metodo não retorna nenhum valor ou dado para quem o chamou, ele apenas executa as açoes
        //de quem o cham.

        //main(): Funcao principal do programa, por ela que o computador vai iniciar a codagem.

        //String[]: é um dos argumentos que a main recebe, nesse tipo ele esta em formato de lista
        //por isso colocamos os [] após o tipo de dado, indicando que no prompt de comando podemos inserir varios
        //valores apos chamarmos o programa compilado.

        //O main recebe argumentos para que sejam passados no uso do terminal,
        //esses parâmetros são armazenados como strig do tipo lista e isso é
        //mostrardo com uso dos [] que são identificados acima.

        System.out.println("Ola Mundo, sou o primeiro programa do Anderson.");
        //texto(args[0], args[1]);

        // ao final de cada linha devemos inserir o ; indicando o final;



    }
    //podemos criar uma nova função utilizandos de palavras reservadas pelo java
    //static void nomeDaFuncao(){} -> utilizamos desse metodo com as palavras
    // reservadas para criar novas funcoes

    static void soma(int x, int y){
        System.out.println(x + y);
    } //cada bloco é definido por {}

    static void texto(String texto1, String texto2){
        System.out.println("você inseriu o texto $texto1 e $texto2");
    }

}
