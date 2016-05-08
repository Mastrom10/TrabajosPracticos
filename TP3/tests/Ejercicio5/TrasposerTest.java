package Ejercicio5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

import static org.junit.Assert.*;


/**
 * Created by Nicolas on 08/05/2016.
 */
public class TrasposerTest {
    Trasposer traponedor;

    @Before
    public void setUp() throws Exception {
        traponedor = new Trasposer();
    }

    @After
    public void tearDown() throws Exception {
        traponedor = null;
    }

    @Test
    public void transponerMatriz() throws Exception {
        File PathINfile = new File("resources/matrizOriginal.txt");
        String PathIN = PathINfile.getAbsolutePath();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PathIN));
            bufferedWriter.write("ABCD" + "\n" + "1234" + "\n" + "hijk" + "\n" + "6789");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File PathOUTfile = new File("resources/matrizTranspuestaManual.txt");
        String PathOUT = PathOUTfile.getAbsolutePath();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PathOUT));
            bufferedWriter.write("A1h6" + "\n" + "B2i7" + "\n" + "C3j8" + "\n" + "D4k9" + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File PathOUTfileGen = new File("resources/matrizTranspuestaGenerated.txt");
        String PathOUTGen = PathOUTfileGen.getAbsolutePath();
        traponedor.transponerMatriz(PathIN, PathOUTGen);

        byte[] f1 = Files.readAllBytes(PathOUTfile.toPath());
        byte[] f2 = Files.readAllBytes(PathOUTfileGen.toPath());
        Assert.assertTrue(Arrays.equals(f1, f2));
    }

}