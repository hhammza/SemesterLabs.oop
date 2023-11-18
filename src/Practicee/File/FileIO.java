package Practicee.File;

import javax.annotation.processing.FilerException;
import java.io.*;

public class FileIO {
    public static void main(String[] args)  {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));
            bw.write("Writing to a file.\n");
            bw.write("Another line.");
            String[] name = {"Elle", "Lara", "Dany"};
            for(String n : name){
                bw.write("\n"+n);
            }
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        try{
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
