package Ejercicio1.DAO;

import Ejercicio1.Entidades.Ingrediente;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 10/05/2016.
 */
public class IngredientesDAOTest {
    @Test
    public void altaIngrediente() throws Exception {
        Ingrediente i = new Ingrediente("Papa", "Verduras");
        boolean b = IngredientesDAO.altaIngrediente(i);
        Assert.assertTrue(b);

    }

    @Test
    public void borrarIngrediente() throws Exception {
        altaIngrediente();
        Ingrediente i = new Ingrediente("Papa", "Verduras");
        boolean b = IngredientesDAO.borrarIngrediente(i);
        Assert.assertTrue(b);
    }

}