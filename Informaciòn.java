import java.util.Scanner;
public class Informaciòn {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    // Menù
    System.out.println("/nElija un tema:");
    System.out.println("1. Taylor Swift");
    System.out.println("2. La cabaña");
    System.out.println("3.Doctor House");
    System.out.println("4.Karol G");
    System.out.println("5.Bad Bunny");
    System.out.println("Opcion: ");
    opcion = sc.nextInt();
    // Switch
    switch (opcion) {

        case 1:
            System.out.println("Taylor Swift es una cantante y compositora estadounidense, conocida por sus éxitos en la música pop y country. Nació el 13 de diciembre de 1989 en Reading, Pennsylvania. Taylor ha ganado numerosos premios, incluyendo varios Grammy, y es reconocida por su habilidad para escribir canciones que conectan con sus fans. Algunas de sus canciones más populares incluyen 'Love Story', 'You Belong with Me' y 'Shake It Off'.");
            break;
        case 2:
            System.out.println("La cabaña es una novela escrita por William P. Young que fue publicada en 2007. La historia sigue a un hombre llamado Mackenzie Allen Phillips, quien enfrenta una profunda crisis personal después de la desaparición de su hija menor durante unas vacaciones familiares. La novela explora temas como la fe, el perdón y la redención a través de la experiencia de Mackenzie en una cabaña misteriosa donde se encuentra con figuras que representan a Dios, Jesús y el Espíritu Santo.");
            break;
        case 3:
            System.out.println("Doctor House es una serie de televisión estadounidense creada por David Shore que se emitió desde 2004 hasta 2012. La serie sigue al Dr. Gregory House, un médico brillante pero antisocial que lidera un equipo de diagnóstico en un hospital ficticio. House es conocido por su enfoque poco convencional para resolver casos médicos complejos, así como por su personalidad sarcástica y adictiva al Vicodin. La serie recibió críticas positivas y ganó varios premios, incluyendo dos Globos de Oro.");
            break;
        case 4:
            System.out.println("Karol G es una cantante colombiana de reguetón y música urbana. Nació el 14 de febrero de 1991 en Medellín, Colombia. Karol G ha ganado popularidad internacional con éxitos como 'Tusa', 'Bichota' y 'Ay Dios Mío!'. Su estilo musical combina elementos del reguetón con influencias del pop y la música latina, lo que le ha permitido conquistar a una amplia audiencia en todo el mundo.");
            break;
        case 5:
            System.out.println("Bad Bunny es un cantante puertorriqueño de trap y reguetón. Nació el 10 de marzo de 1994 en San Juan,  Puerto Rico.");
            break;

            default:
                System.out.println("Opción no válida.");

}
                sc.close();
}
                }





