
import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0;
        System.out.println("Hola Mundo");
        System.out.print("Ingrese Un Numero: ");
        a = input.nextInt();
        System.out.println("");
        if (a <= 99) {
            System.out.println("Dos Cifras");
        } else {
            System.out.println(" >> " + a + " << ");
        }
    }

}
