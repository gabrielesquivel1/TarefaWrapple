
import java.util.Scanner;

/**
 * @author GEsquivel$
 * Created on 19/08/2023$
 */
public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número : ");
        int num = scan.nextInt();
        System.out.println("Você digitou : " + num);

        Integer numInteger = num; // conversão Automática

        System.out.println("Valor convertido : " + numInteger);

        Double numDouble = (double) num;
        System.out.println("Conversão para Double : " + numDouble);
    }
}

