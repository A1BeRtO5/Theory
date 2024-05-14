package InputOut;

import java.io.*;

public class Out {
    public static void main(String[] args) {
        File file = new File("/home/gg/Desktop/out1.txt");

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
                writer.write("lalalala");
                writer.write("looooo");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
