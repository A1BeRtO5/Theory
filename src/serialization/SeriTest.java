package serialization;

import java.io.*;

public class SeriTest {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("/home/gg/Desktop/data.txt"));
            String s1 = "lalala";
            oos.writeObject(s1); // записали
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/gg/Desktop/data.txt"));
            String s2 = (String) ois.readObject(); //прочитали
            System.out.println(s2);                //вивели в консоль
        } catch (Exception e){
            throw new RuntimeException(e);

        }
        //читання готового файлу.
        File file = new File("/home/gg/Desktop/conspekt.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader reader = new BufferedReader(isr);
        String line;
        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(line);
        }
    }
}
