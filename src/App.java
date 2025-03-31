
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        MetodoBurbuja metodoBurbuja= new MetodoBurbuja();
        MetodoInsercion metodoInsercion=new MetodoInsercion();
        MetodoSeleccion metodoSeleccion=new MetodoSeleccion();
        MetodoBurbujaMejorado metodoBurbujaMejorado=new MetodoBurbujaMejorado();
        int[] arreglo = { 10 ,9, 21, 5 ,15, 2, -1, 0  };

        boolean aux= false;
        boolean pasosBool= false;
        String estado;
        System.out.println("Seleccione el método de ordenamiento:");
        System.out.println("1.Burbuja");
        System.out.println("2.Selección");
        System.out.println("3.Inserción");
        System.out.println("4. Burbuja Mejorado");
        System.out.println("5.Salir del programa");
        int opcion;
        do {
            System.out.println("Introduzca la opcion que deseas:");
            opcion = leer.nextInt();
            if (opcion>0 && opcion<=5) {
                aux=true;
            }else {
                aux=false;
                System.out.println("Opcion no valida: Intentalo otra vez: ");
            }
        }while(aux==false);

        do {
            aux=false;
            System.out.println("¿Desea ver los pasos? (true/false):");
            String pasos = leer.next();
            pasos=pasos.toLowerCase();
            if (pasos.equals("true") || pasos.equals("false")) {
                pasosBool=Boolean.parseBoolean(pasos);
                aux=true;
            }else{
                System.out.println("Opcion no valida: Intentalo otra vez: ");

            }
        }while(aux==false);

        do {
            aux=false;
            System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?:");
            estado = leer.next();
            if (estado.equalsIgnoreCase("A") || estado.equalsIgnoreCase("D")) {
                aux=true;
            }else{
                System.out.println("Opcion no valida: Intentalo otra vez con los valores de ordenamiento ");

            }
        }while(aux==false);

        switch (opcion) {
            case 1:
                metodoBurbuja.ordenar(arreglo,estado,pasosBool);
                metodoBurbuja.imprimirArreglo(arreglo);
                break;
                case 2:
                    metodoInsercion.ordenarInser(arreglo,pasosBool,estado);
                    metodoInsercion.imprimirArreglo(arreglo);
                    break;
                    case 3:
                        metodoSeleccion.ordenarSelececion(arreglo,pasosBool,estado);
                        metodoSeleccion.imprimirArreglo(arreglo);
                        break;
                        case 4:
                            metodoBurbujaMejorado.ordenar(arreglo,estado,pasosBool);
                            metodoBurbujaMejorado.imprimirArreglo(arreglo);
                            break;

        }

















    }



}