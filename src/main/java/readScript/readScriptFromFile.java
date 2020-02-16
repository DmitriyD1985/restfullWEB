package readScript;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class readScriptFromFile {
    String filePath = "";

    public String readScriptFromFile() throws FileNotFoundException {
        Scanner scnr = new Scanner(new File(filePath));
        int lineNumber = 1;
        StringBuilder strb = new StringBuilder();
        while(scnr.hasNextLine()){
            strb.append(scnr.nextLine());
            System.out.println("line " + lineNumber);
            lineNumber++;
        }
        return strb.toString();
    }
}
