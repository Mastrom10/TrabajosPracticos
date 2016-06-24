package Ejercicio7;

/**
 * Created by nmastromarino on 11/05/2016.
 */
public class VerificadorTriangulos {
    public enum Posibilidades {
        NOENCAJA ("No Encajan"),
        ENCAJASINGIRAR ("Encajan Sin Girar"),
        ENCAJAGIRANDO ("Encaja Girandolos");
        public final String Mensaje;
        Posibilidades(String elMensaje){
            this.Mensaje = elMensaje;
        }
    }

    public Posibilidades ComprarTriangulos(Triangulo tr1, Triangulo tr2){

        if (tr1.Alto >= tr2.Alto && tr1.Ancho >= tr2.Ancho){
            return Posibilidades.ENCAJASINGIRAR;
        } else if (tr1.Alto >= tr2.Ancho && tr1.Ancho >= tr2.Alto) {
            return Posibilidades.ENCAJAGIRANDO;
        } else {
            return Posibilidades.NOENCAJA;
        }

    }

}
