import java.util.Scanner;
public class ConvertidorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double celsius, resultado;
        int opcion;

        // Entrada de datos
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        celsius = sc.nextDouble();

        // Menù
        System.out.println("/nElija una opción:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        opcion = sc.nextInt();
        // Switch
        switch (opcion) {
            case 1:
                resultado = (celsius * 9/5) + 32;
                System.out.println(celsius + " Temperatura en Fahrenheit: " + resultado);
                break;
            case 2:
                resultado = celsius + 273.15;
                System.out.println("Temperatura en Kelvin: " + resultado);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        sc.close();

    
}

}
