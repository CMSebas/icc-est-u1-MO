public class MetodoSeleccion {

    public void ordenarSelececion(int[] arreglo,boolean pasos,String orden) {
        int n = arreglo.length;
        int contComparacion=1;
        System.out.println("Metodo Seleccion");
        System.out.print("Arreglo original:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
        // 10, 9, 21, 5, 15, 2, -1, 0
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (pasos) {
                    System.out.println("Comparación " + contComparacion + ": " + arreglo[j] + " < " + arreglo[i]);                }
                if (orden.equalsIgnoreCase("A")){
                    if (arreglo[maxIdx] > arreglo[j]) {
                        maxIdx = j;
                    }
                }else{
                    if (arreglo[maxIdx] < arreglo[j]) {
                        maxIdx = j;
                    }
                }
                if (pasos) {
                    if (maxIdx != i) {
                        System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[maxIdx]);
                    } else {
                        System.out.println("(No hay intercambio)");
                    }

                    System.out.print("Estado actual -> ");
                    imprimirArreglo(arreglo);
                    System.out.println();
                }
                contComparacion++;
            }



            int aux = arreglo[i];
            arreglo[i] = arreglo[maxIdx];
            arreglo[maxIdx] = aux;
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
