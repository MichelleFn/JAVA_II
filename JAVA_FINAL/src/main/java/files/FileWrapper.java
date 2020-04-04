/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import basics.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author it21771-it21794
 */
public class FileWrapper {

    public static File createFile(String fileName) throws IOException {
        File file1 = new File("src/main/java/tests/" + fileName);
        file1.createNewFile();
        System.out.println("File created" + "\n");
        System.out.println(file1.getName());
        System.out.println(file1.getAbsolutePath());
        return file1;
    }

    public static void writeArtistToFile(File filename, ArrayList<Artist> Artists) {
        try {

            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(Artists); //writing arraylist of artists to file

            oos.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void writeReleasetoFile(File filename, ArrayList<Release> releases) {
        try {

            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(releases);
            oos.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void readFile(File fileName)  {
        
        try{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));

        Object obj = null;

        while ((obj = inputStream.readObject()) != null) {

            System.out.println(obj.toString());

        }
        inputStream.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
