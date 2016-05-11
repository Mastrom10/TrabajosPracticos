package ejercicio5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by nmastromarino on 11/05/2016.
 */
public class funcionesVariasTest {
    @Test
    public void PrimosOK() throws Exception {



        File path1a = new File("resources/primosOK.txt");
        String path1aIN = path1a.getAbsolutePath();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path1aIN));
            bufferedWriter.write("951" + "\n" + "7" + "\n" + "13" + "\n" + "487" + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File path1b = new File("resources/primos.txt");

        byte[] f1 = Files.readAllBytes(path1a.toPath());
        byte[] f2 = Files.readAllBytes(path1b.toPath());
        Assert.assertTrue(Arrays.equals(f1, f2));


    }

    @Test
    public void Divisores3000OK() throws Exception {


        File path2a = new File("resources/Divisores3000OK.txt");
        String path2aIN = path2a.getAbsolutePath();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path2aIN));
            bufferedWriter.write("6" + "\n" + "4" + "\n" + "150" + "\n" + "300" + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File path2b = new File("resources/Divisores3000.txt");

        byte[] f3 = Files.readAllBytes(path2a.toPath());
        byte[] f4 = Files.readAllBytes(path2b.toPath());
        Assert.assertTrue(Arrays.equals(f3, f4));
    }


    @Test
    public void PromediosOK() throws Exception {

        File path3a = new File("resources/PromediosOK.txt");
        String path3aIN = path3a.getAbsolutePath();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path3aIN));
            bufferedWriter.write("Promedio de numeros Pares: 244.75" + "\n" + "Promedio de numeros Impares: 364.5" + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File path3b = new File("resources/Promedios.txt");

        byte[] f5 = Files.readAllBytes(path3a.toPath());
        byte[] f6 = Files.readAllBytes(path3b.toPath());
        Assert.assertTrue(Arrays.equals(f5, f6));

    }

    @Before
    public void setUp() throws Exception {
        funcionesVarias fv = new funcionesVarias();
        ArrayList<Integer> lInts = new ArrayList<>();
        lInts.add(654);
        lInts.add(951);
        lInts.add(64);
        lInts.add(6);
        lInts.add(4);
        lInts.add(7);
        lInts.add(654);
        lInts.add(13);
        lInts.add(150);
        lInts.add(300);
        lInts.add(487);
        lInts.add(126);
        fv.Separador(lInts);
    }
}