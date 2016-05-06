package Ejercicio2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Profe fede on 04/05/2016.
 * Ejercicio 2 - Prolog en Java
 */
public class Prolog {

    private Map<String, String> padres = new HashMap<>();

    private Map<String, String> madres = new HashMap<>();

    public Prolog() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(new File(this.getClass().getClassLoader().getResource("hechos.txt").getPath())));
        bf.lines().forEach(line -> {
            String parts[] = line.split("\\(");
            if(parts.length != 2)
            {
                throw new IllegalArgumentException("Error durante la carga del dato: " + line);
            }
            if("padre".equals(parts[0]))
            {
                cargar(padres, parts[1].substring(0, parts[1].length() - 1));
            }
            if("madre".equals(parts[0]))
            {
                cargar(madres, parts[1].substring(0, parts[1].length() - 1));
            }
        });
    }

    private void cargar(Map<String, String> superior, String tupla) {
        String kv[] = tupla.split(",");
        superior.put(kv[1].trim(), kv[0].trim());
    }

    public boolean esHermano(String primerHijo, String segundoHijo)
    {
        return padres.get(primerHijo).equals(padres.get(segundoHijo)) ||
                madres.get(primerHijo).equals(madres.get(segundoHijo));
    }

    public boolean esAbuelo(String nieto, String abuelo)
    {
        return esPadre(padres, padres.get(nieto), abuelo) ||
                esPadre(madres, madres.get(nieto), abuelo) ||
                esPadre(madres, padres.get(nieto), abuelo) ||
                esPadre(padres, madres.get(nieto), abuelo);
    }

    private boolean esPadre(Map<String, String> ancestros, String hijo, String padre)
    {
        return (ancestros.get(hijo) != null) && ancestros.get(hijo).equals(padre);
    }

}
