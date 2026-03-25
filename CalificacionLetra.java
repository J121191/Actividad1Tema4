import java.util.Scanner;
public class CalificacionLetra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int calificacion;
        char letra;

        // Entrada de datos
System.out.println("Ingrese la calificación numérica (0-100): ");
calificacion = sc.nextInt();

// Validaciòn
if (calificacion < 0 || calificacion > 100) {
    System.out.println("Error:Calificaciòn no válida.");
        } else  {

            // Evaluaciòn de rangos
        if (calificacion >= 90 ) {
            letra = 'A';
        } else if (calificacion >= 80 ) {
            letra = 'B';
            
        } else if (calificacion >= 70 ) {
            letra = 'C';
            
        } else if (calificacion >= 60 ) {
            letra = 'D';
            
        } else {
            letra = 'F';
        } 
        // Salida de datos
        System.out.println("La calificación en letra es: " + letra);
    }
        sc.close();

    }
}


      

    



