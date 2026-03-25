import java.util.Scanner;
public class VerificarEdad {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int edad;
        
        //Entrada de datos
        System.out.println("Ingresa tu edad:");
        edad = sc.nextInt();

        //Validación y condiciòn
        if (edad < 0) {
            System.out.println("Error:Edad no válida. ");
        } else if (edad > 18) {
            System.out.println("Eres elegible para votar.");
        } else {
            System.out.println("No eres elegible para votar.");

      }
         sc.close();
    }
}
