import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;
        int n;
        int m;
        String nombre;
        int x;
        /*
        System.out.println("Ingrese i:");
        i = sc.nextInt();
        System.out.println("Ingrese n: ");
        n = sc.nextInt();

        System.out.println("Ingrese m");
        m = sc.nextInt();

        for (int a = n; a <= m; a = a + i) {
            System.out.println("a = " + a);

        }*/

        System.out.println("Ingrese su nombre: ");
        nombre = sc.next();
        System.out.println("Ingrese el numero a repetir: ");
        x = sc.nextInt();

        for(int b = x; b <= x; b = b + x){
            System.out.println("Nombre: " + b );
        }
    }
}