import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menu

        var salir = false;
        while (!salir){
            mostrarMenu();
            System.out.println();
            break;
        }
    }

    private static void mostrarMenu(){
        System.out.print("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Eliminar
                4. Salir
                """);
        System.out.println("Proporciona la opción? ");
    }
}