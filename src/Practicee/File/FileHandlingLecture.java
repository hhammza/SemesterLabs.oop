package Practicee.File;

import java.io.*;
    public class FileHandlingLecture {
        public static void main(String[] args) {
        File file = new File("data.txt");

        //check if it's a file
        System.out.println(file.isFile());

        // if it exists
        System.out.println(file.exists());

        // get absolute path
        System.out.println(file.getAbsolutePath());

        // get relative path
        System.out.println(file.getPath());

        // create a file
        try {
             file.createNewFile();
        } catch (IOException e) {
             throw new RuntimeException(e);
        }

        System.out.println(file.exists());

        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("file generated");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }  else {
            System.out.println("already exists");
        }

        File srcFile = new File("src");

        System.out.println(srcFile.exists());
        System.out.println(srcFile.isDirectory());
        System.out.println(srcFile.isFile());


        // returns an array of Files[] in which it stores all files in given directory
        File[] sFiles = srcFile.listFiles();
        for(File f : sFiles){
            System.out.print(f.getName()+"\t");
        }
        System.out.println();

        System.out.println(srcFile.mkdir());
        System.out.println(srcFile.mkdirs());

            File df = new File("data.txt");
            writeToFile(df,"ka samna koi bolta ee nai hai");
            System.out.println(readFromFile(df));

        }
        public static void writeToFile(File df,String text){
            try {

                FileWriter fw = new FileWriter(df,true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(text);
                bw.newLine();
                bw.close();
                fw.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static String[] readFromFile(File df){
            String temp[] = new String[10];
            try{
                FileReader fr = new FileReader(df);
                BufferedReader br = new BufferedReader(fr);
                while (br.readLine() != null) {
                    int i = 0;
                    temp[i] = br.readLine();
                    i++;
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return temp;
        }

    /*
    important points:
    csv = comma separated values : excel
    read,write data
     */
    }
