import java.util.Random;

public class MegaSena {
    public static void main (String[] args){
        Random generate = new Random(); //e uma nova classe de objetos, que iremos trabalhar
        // ela cria numeros aleatórios para nos
        //primeira forma de criar números aleatorios sequenciais é utilizando o while

        int i = 0;
        while(i<6){
            int number = generate.nextInt(60);
            System.out.println(number);
            i = i + 1; //mas podemos colocar tambem i++
        }
        System.out.println("______________________________________________________");
        //outra maneira é utilizarmos o for

        for(i=0;i<6;i = i+1){
            int number1 = generate.nextInt(60);
            System.out.println(number1);
        }
    }

}
