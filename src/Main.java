import java.util.Scanner;
public class Main {
    private static String getmenu(){
        return"Menu:\n" +
            "\t1. Agregar nivel\n" +
            "\t2. Agregar grado\n" +
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
                System.out.print("Ingrese el nombre del Nivel: \n");
                String nombreNivel=input.nextLine();
                break;
                case 2:
                System.out.print("Ingrese el nombre del Nivel");
            }

        }while(wantsToContiniue==true);

    }
}

