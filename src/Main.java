import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static String getmenu(){
        return"Menu:\n" +
            "\t1. Agregar nivel(Solo preprimaria, primaria, Secundaria y Basicos)\n" +
            "\t2. Agregar grado(Para preprimaria: kinder y preparatoria, primaria: 1-6, Secundaria 1-4 Basicos 4 y 5)\n" +
            "\t3. Agregar Estudiante\n" +
            "\t4. Ver grados en un Nivel\n" +
            "\t5. Ver asignaciones en un grado\n" +
            "\t6. salir\n";}
    public static void main (String[] args){
        boolean wantsToContiniue = true;
        do {
            //Imprime el menu
            System.out.print(getmenu());
            //Input
            System.out.print("Ingrese una opcion: ");
            Scanner input= new Scanner(System.in);
            int opcion= input.nextInt();
            switch (opcion){
                case 1 :
                    System.out.print("Ingrese el nombre del Nivel:");
                    Scanner opcion1= new Scanner(System.in);
                    String nombre =opcion1.nextLine();
                     Nivel nuevoNivel=new Nivel(nombre);

                    break;
                case 2:
                    System.out.print("Ingrese el nombre del Nivel:");
                    Scanner opcion2= new Scanner(System.in);
                    String nombrenivel= opcion2.nextLine();
                    break;
                case 3:
                case 4:
                case 6:
                wantsToContiniue= false;
                break;
            }

        }while(wantsToContiniue==true);

    }
}

