import java.util.Scanner;
public class DescuentoProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio, descuento = 0, precioFinal;

        // Entrada de datos
        System.out.println("Ingrese el precio del producto: ");
        precio = sc.nextDouble();

        // Validación
        if (precio < 0) {
            System.out.println("Error:Precio no válido.");
        } else {
            // Evaluación de rangos para el descuento
            if (precio <= 100) {
                descuento = 0 ;

            } else if (precio <= 200) {
                descuento = 0.10;
            } else if (precio <= 500) {
                descuento = 0.20;

            } else {
                descuento = 0.25;
               
            }

            // Cálculo del precio final
            precioFinal = precio - descuento;

            // Resultados
            System.out.println("El descuento aplicado es: " + (descuento * 100) + "%");
            System.out.println("El precio final: $ " + precioFinal);
        }
        sc.close();
    }
    
}
