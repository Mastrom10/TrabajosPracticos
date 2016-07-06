package Ejercicio6;

/**
 * Created by Nicolas on 05/07/2016.
 */
public class Teatro {

    public Ticket crearTicket(TipoLocalidad tl) {
        return new Ticket(tl);
    }

    public String MostrarPosiblesLocalidades() {
        StringBuilder sb = new StringBuilder();

        for (TipoLocalidad tl :
                TipoLocalidad.values()) {
            sb.append(tl.toString() + ": $" + tl.getMonto() + " | u$s" + tl.precioEnDolares() + " | " + tl.precioEnEuros() + " euros." + "\n");
        }
        return sb.toString();
    }
}
