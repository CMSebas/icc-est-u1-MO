import java.util.Arrays;

public class MetodoBurbuja {


    public void ordenar(int[] arreglo, String ascendente,boolean pasos) {
        int cont=0;
        System.out.println("Metodo Burbuja");
        System.out.print("Arreglo original:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                cont++;
                // System.out.println("i=" + i + " j=" + j);
               if(pasos){
                   if (ascendente.equalsIgnoreCase("A")) {
                       System.out.println("Comparacion "+(cont)+":"+arreglo[i]+">"+arreglo[j]);
                       if (arreglo[i] > arreglo[j]) {
                           int aux = arreglo[j];
                           arreglo[j] = arreglo[i];
                           arreglo[i] = aux;
                           System.out.println("Intercambio: "+arreglo[i]+"-"+arreglo[j]);
                       }else {
                           System.out.println("No hay cambio");
                       }
                       System.out.print("Estado Actual:");
                       for ( int l = 0; l < arreglo.length; l++) {
                           System.out.print(arreglo[l] + " ");
                       }
                       System.out.println();
                       System.out.println();
                   } else {
                       System.out.println("Comparacion "+(cont)+":"+arreglo[i]+">"+arreglo[j]);
                       if (arreglo[i] < arreglo[j]) {
                           int aux = arreglo[j];
                           arreglo[j] = arreglo[i];
                           arreglo[i] = aux;
                           System.out.println("Intercambio: "+arreglo[i]+"-"+arreglo[j]);
                       }else {
                           System.out.println("No hay cambio");
                       }
                       System.out.print("Estado Actual:");
                       for ( int l = 0; l < arreglo.length; l++) {
                           System.out.print(arreglo[l] + " ");
                       }
                       System.out.println();
                       System.out.println();

                   }
               }else{
                   if (ascendente.equalsIgnoreCase("D")) {
                       if (arreglo[i] < arreglo[j]) {
                           int aux = arreglo[j];
                           arreglo[j] = arreglo[i];
                           arreglo[i] = aux;
                       }
                   } else {
                       if (arreglo[i] > arreglo[j]) {
                           int aux = arreglo[j];
                           arreglo[j] = arreglo[i];
                           arreglo[i] = aux;
                       }
                   }
               }
            }
        }

    }

    public void imprimirArreglo(int[] arreglo) {
        System.out.println("--------------Fin del metodo----------");
        System.out.print("Arreglo ordenado:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();


    }



}
