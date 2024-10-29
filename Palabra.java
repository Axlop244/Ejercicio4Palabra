import java.util.Scanner;
public class Palabra{
    public static void main(String[] args){
    
    var palabra1 = new Scanner(System.in);
    var palabra0 = new Scanner(System.in);
    var palabra3 = new Scanner(System.in);
    System.out.print("Introduzca palabra 1: ");
    var palabra = palabra1.nextLine();

    System.out.print("Introduzca palabra 2: ");
    var letra = palabra0.nextLine();

    System.out.print("Introduzca palabra 3: ");
    var digito = palabra3.nextLine();

    System.out.println(palabra);
    System.out.println(letra);
    System.out.println(digito);

    palabra1.close();
    palabra0.close();
    palabra3.close();

    }
}