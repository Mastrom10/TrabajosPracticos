package ejercicio1;
//Recibir un array de enteros y devolver un array con los dos numeros mas altos de la secuencia
import java.util.ArrayList;

public class Arreglo {

    public ArrayList<Integer> dosMasAltos(ArrayList<Integer> listaNumeros) {
        ArrayList<Integer> resultado = new ArrayList<>();
        resultado.add(0);
        resultado.add(0);
        for (Integer num : listaNumeros
                ) {
            if (num > resultado.get(0)) {
                resultado.add(1, resultado.get(0));
                resultado.add(0, num);
            }
        }

        return resultado;
    }
}
        /*Scanner t= new Scanner(System.in);
        int valor= 0; //inicializo sector del arreglo en 0
        int[] arreglo = new int[10]; //declaro un vector de 10 posiciones
        int numeroMayor1, numeroMayor2;

        for (int i=0; i<arreglo.length; i++){
            System.out.println("Agregar valor " + (i+1));
            valor=t.nextInt();
            arreglo[i]=valor;
        }//fin de ciclo for que carga contenido en el arreglo

        //parto de los dos primeros valores
        if(arreglo[0] > arreglo[1]){
            numeroMayor1=arreglo[0];
            numeroMayor2=arreglo[1];
        }
        else{
            numeroMayor1=arreglo[1];
            numeroMayor2=arreglo[0];
        }
        for (int i=2; i<arreglo.length; i++){
            if (arreglo[i]>numeroMayor1){
                numeroMayor2=numeroMayor1;
                numeroMayor1=arreglo[i];
            }
            else if (arreglo[i]>numeroMayor2){
                numeroMayor2=arreglo[i];
            }
        }
        System.out.println("El numero mayor 1 es " + (numeroMayor1));
        System.out.println("El numero mayor 2 es " + (numeroMayor2));
    }//fin de metodo main
}//fin de clase Arreglo
        */