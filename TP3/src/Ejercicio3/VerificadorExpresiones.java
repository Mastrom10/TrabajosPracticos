package Ejercicio3;

/**
 * Created by nmastromarino on 06/05/2016.
 */
public class VerificadorExpresiones {

    public boolean telefonoOK(String nroTel){
        return nroTel.matches("(\\d{2}[-. ]?)?(\\d{3}[-. ]?)?\\d{4}[-. ]?\\d{4}");
    }

    public boolean mailOK(String mail){
        return mail.matches("^(?:(?:[\\w`~!#$%^&*\\-=+;:{}'|,?/]+(?:(?:\\.(?:\"(?:\\\\?[\\w`~!#$%^&*\\-=+;:{}'|,?/\\.()<>\\[\\] @]|\\\\\"|\\\\\\\\)*\"|[\\w`~!#$%^&*\\-=+;:{}'|,?/]+))*\\.[\\w`~!#$%^&*\\-=+;:{}'|,?/]+)?)|(?:\"(?:\\\\?[\\w`~!#$%^&*\\-=+;:{}'|,?/\\.()<>\\[\\] @]|\\\\\"|\\\\\\\\)+\"))@(?:[a-zA-Z\\d\\-]+(?:\\.[a-zA-Z\\d\\-]+)*|\\[\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\])$");
}


    public boolean fechaOK(String fecha){
        return fecha.matches("(0[1-9]|[12][0-9]|3[01])([/])(0[1-9]|1[012])([/])(19|20)\\d\\d");
    }

}
