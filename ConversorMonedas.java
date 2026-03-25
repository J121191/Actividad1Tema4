import java.util.Scanner;
public class ConversorMonedas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pesos,resultado =0;
        int opcion;
        // Entrada de datos
        System.out.print("Ingrese la cantidad en pesos mexicanos: ");
        pesos = sc.nextDouble();
        // Menù
        System.out.println("/nElija la moneda a convertir:");
        System.out.println("1. Convertir a dólares");
        System.out.println("2. Convertir a euros");
        System.out.println("3. Convertir a THB");
        System.out.println("4. Convertir a JPY");
        System.out.println("5. Convertir a KRW");
        System.out.println("6. Convertir a AUD");
        System.out.println("7. Convertir a PEN");
        System.out.println("8. Convertir a CAD");
        System.out.println("9. Convertir a VES");
        System.out.println("10. Convertir a ARS");
        System.out.println("Opcion: ");
        opcion = sc.nextInt();
        // Switch
        switch (opcion) {
            case 1:
                resultado = pesos * 0.058; // USD
                System.out.println("Equivalente en USD: " + resultado);
                break;
            case 2:
                resultado = pesos * 0.054; // EUR
                System.out.println("Equivalente en EUR: " + resultado);
                break;
            case 3:
                resultado = pesos * 2.10; // THB
                System.out.println("Equivalente en THB: " + resultado);
                break;
            case 4:
                resultado = pesos * 8.50; // JPY
                System.out.println("Equivalente en JPY: " + resultado);
                break;
            case 5:
                resultado = pesos * 77.0; // KRW
                System.out.println("Equivalente en KRW: " + resultado);
                break;
            case 6:
                resultado = pesos * 0.88; // AUD
                System.out.println("Equivalente en AUD: " + resultado);
                break;
            case 7:
                resultado = pesos * 0.22; // PEN
                System.out.println("Equivalente en PEN: " + resultado);
                break;
            case 8:
                resultado = pesos * 0.079; // CAD
                System.out.println("Equivalente en CAD: " + resultado);
                break;
            case 9:
                resultado = pesos * 2.10; // VES
                System.out.println("Equivalente en VES: " + resultado);
                break;
            case 10:
                resultado = pesos * 50.0; // ARS
                System.out.println("Equivalente en ARS: " + resultado);
                break;    

            default:
                System.out.println("Opción no válida.");
        }


        sc.close();
    }
}