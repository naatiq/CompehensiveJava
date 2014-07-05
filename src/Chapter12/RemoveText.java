package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * Created by naatiqullahmohammed on 01/07/14.
 */
public class RemoveText {
    File inFile;

    public RemoveText(File file) {
        this.inFile = file;
    }

    public void remove(String s) throws IOException {

        Scanner scanner = new Scanner(inFile);

        File temp = new File("temp.txt");
        //temp.createNewFile();
        PrintWriter writer = new PrintWriter(temp);
        String line = scanner.nextLine();
        while (line != null) {
            String replacement = line.replaceAll("John" , "");
            writer.println(replacement);
            if(scanner.hasNext())
                line = scanner.nextLine();
            else break;
        }
        writer.close();
        scanner.close();

        scanner = new Scanner(temp);
        writer = new PrintWriter(inFile);
        line = scanner.nextLine();
        while (line != null) {
            writer.println(line);
            if(scanner.hasNext())
                line = scanner.nextLine();
            else break;
        }
        writer.close();
        scanner.close();

        temp.delete();
    }

    public static void main(String[] args) {
        String fileName = "/Users/naatiqullahmohammed/Documents/workspace/Java/CompehensiveJava/src/Chapter12/john.txt";
        RemoveText r = new RemoveText(new File(fileName));
        try {
            r.remove("John");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
