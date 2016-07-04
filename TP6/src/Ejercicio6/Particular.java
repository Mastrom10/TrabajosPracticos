package Ejercicio6;


/**
 * Created by nmastromarino on 04/07/2016.
 */
public class Particular extends Asistente {

    private Boolean enCABA;

    public Particular(String nombre, String apellido, String institucion,  Boolean enCABA) {
        this.setEnCABA(enCABA);
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setInstitucion(institucion);
    }

    public Boolean getEnCABA() {
        return enCABA;
    }

    public void setEnCABA(Boolean enCABA) {
        this.enCABA = enCABA;
    }

    @Override
    public Float CalcularDescuento() {
        return getEnCABA() ? new Float(0f) : new Float(0.1f);
    }


}
