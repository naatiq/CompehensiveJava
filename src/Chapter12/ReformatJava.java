package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by naatiqullahmohammed on 01/07/14.
 */
public class ReformatJava {
    public static void main(String[] args) {
        String path = args[0];
        File inFile = new File(path);
        try {
            format(inFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void format(File file) throws FileNotFoundException {
        File temp =  new File("temp");
        Scanner scanner = new Scanner(file);
        PrintWriter writer = new PrintWriter(temp);
        String line1 = scanner.nextLine();
        String line2 = null;
        while(scanner.hasNext()) {
            line2 = scanner.nextLine();
            if(line2.replace(" ","").equals("{")) writer.print(line1 + "\t" + "{");
            else if(line1.replace(" ","").equals("{")) writer.println("");
            else writer.println(line1);
            line1 = line2;
        }
        writer.println(line2);

        writer.close();
        scanner.close();

        scanner = new Scanner(temp);
        writer = new PrintWriter(file);
        while(scanner.hasNext()) {
            writer.println(scanner.nextLine());
        }
        writer.close();
        scanner.close();
        temp.deleteOnExit();
    }

}
