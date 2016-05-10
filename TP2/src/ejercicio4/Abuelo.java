package ejercicio4;

public class Abuelo {


    public static double main(String[] args) {
        double n1 = 0, n2 = 0, nn1 = 0, nn2 = 0, numero , ecuacion;
        double valor= 0;

        //recorro i con todas las combinaciones posibles de numeros y le asigno a numero el valor en i
        for (int i=1111; i<=9999;i++){
         numero=i;

            //recorro todas las posiciones de los numeros y por cada uno una condicion mod
            for (int j=0;j<4;j++){
             if (j==0){
                 nn2=numero%10;
             }
             else if (j==1) {
                 nn1=numero%10;
             }
             else if (j==2){
                 n2=numero%10;
             }
             else if (j==3){
                 n1=numero%10;
             }
                numero=numero%10;
            }

            //hago la ecuacion de (n1^n2) * (nn1^nn2) para resolver el problema
            ecuacion= Math.pow(n1,n2) * Math.pow(nn1,nn2);

            if (ecuacion ==1){
                valor=ecuacion;
            }
        }
        return valor;
    }
}