package ejercicio9;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 11/05/2016.
 */
public class FileMergerTest {
    @Test
    public void mergeArchivosXClaves() throws Exception {
        File PathIN1 = new File("resources/ej9Listado1.txt");
        String PathIN11 = PathIN1.getAbsolutePath();

        File PathIN2 = new File("resources/ej9Listado2.txt");
        String PathIN22 = PathIN2.getAbsolutePath();

        File PathOUT = new File("resources/ej9ListadoMerged.txt");
        String PathOUT1 = PathOUT.getAbsolutePath();

        FileMerger fm = new FileMerger();
        fm.mergeArchivosXClaves(PathIN11, PathIN22, PathOUT1);

        int i = 0;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(PathOUT1).getPath()));
            while (bf.readLine() != null) {
                i++;
            }
            bf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(4, i);
    }

}