import java.util.Arrays;

public class MetodoBurbujaMejorado {
    int num=0;
    int intercambio=0;


    public void ordenar(int[] arreglo, String ascendente,boolean pasos) {
        int cont=0;
        System.out.println("Metodo Burbuja Mejorado");
        System.out.print("Arreglo original:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                cont++;
                // System.out.println("i=" + i + " j=" + j);
                if(pasos){
                    if (ascendente.equalsIgnoreCase("A")) {
                        System.out.println("Comparacion "+(cont)+":"+arreglo[i]+">"+arreglo[j]);
                        if (arreglo[i] > arreglo[j]) {
                            cont++;
                            int aux = arreglo[i];
                            arreglo[i] = arreglo[j];
                            arreglo[j] = aux;
                            System.out.println("Intercambio: "+arreglo[i]+"-"+arreglo[j]);
                            intercambio++;
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
                            cont++;
                            int aux = arreglo[i];
                            arreglo[i] = arreglo[j];
                            arreglo[j] = aux;
                            System.out.println("Intercambio: "+arreglo[i]+"-"+arreglo[j]);
                            intercambio++;
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
                            cont++;
                            int aux = arreglo[i];
                            arreglo[i] = arreglo[j];
                            arreglo[j] = aux;
                            intercambio++;
                        }
                    } else {
                        if (arreglo[i] > arreglo[j]) {
                            cont++;
                            int aux = arreglo[i];
                            arreglo[i] = arreglo[j];
                            arreglo[j] = aux;
                            intercambio++;
                        }
                    }
                }
            }
        }
        num=cont;

    }

    public void imprimirArreglo(int[] arreglo) {
        System.out.println("--------------Fin del metodo----------");
        System.out.print("Arreglo ordenado:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
        System.out.println("Comparaciones totales: "+num);
        System.out.println("Intercambios totales: "+num);


    }



}
