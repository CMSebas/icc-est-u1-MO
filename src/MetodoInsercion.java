public class MetodoInsercion {

    public void ordenarInser(int[] arreglo, boolean pasos,String asd) {
        System.out.println("Metodo de Insercion");
        System.out.print("Arreglo original:");
        imprimirArreglo(arreglo);
        int tam = arreglo.length;
        int contComparaciones = 1;
        int j=0;
        int aux=0;
        boolean centinela = false;
        System.out.println();
        for (int i = 1; i < arreglo.length; i++) {
            j=i;
            aux=arreglo[i];
            if (pasos) {
                System.out.println("Comparación " + contComparaciones + ": " + aux + " < " + arreglo[j - 1]);
            }


            if(asd.equalsIgnoreCase("A")){
                while ((j>0)&&(arreglo[j-1]>aux)) {


                    arreglo[j] = arreglo[j-1];
                    j--;
                    centinela = false;


                }
            }else{
                while ((j>0)&&(arreglo[j-1]<aux)) {


                    arreglo[j] = arreglo[j-1];
                    j--;
                    centinela = false;


                }
            }


            arreglo[j] = aux;

            if (pasos) {
                if (centinela) {
                    System.out.println("Intercambio: " + aux + " <-> " + arreglo[j + 1]);
                } else {
                    System.out.println("(No hay intercambio)");
                }
                System.out.print("Estado actual -> ");
                imprimirArreglo(arreglo);
                System.out.println();
            }
            contComparaciones++;


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
