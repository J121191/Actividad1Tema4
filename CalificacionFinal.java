import java.util.Scanner;

          public class CalificacionFinal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         double parciales,proyecto,examenFinal,promedio;

        //entrada de datos
        System.out.println("Ingrese la calificación de los parciales:");
         parciales = sc.nextDouble();

        System.out.println("Ingrese la calificación del proyecto:");
         proyecto = sc.nextDouble();

            System.out.println("Ingrese la calificación del examen final:");
        examenFinal = sc.nextDouble();

                 //validaciòn 

    if (parciales < 0 || parciales > 100 || proyecto < 0 || proyecto > 100 ||
         examenFinal < 0 || examenFinal > 100) {
            
        } else {
            //cálculo del promedio
             promedio = (parciales * 0.40) + (proyecto * 0.30) + (examenFinal * 0.30);
//Resultado
            System.out.println("La calificación final es: " + promedio);
        }
       sc.close();
    }
}
