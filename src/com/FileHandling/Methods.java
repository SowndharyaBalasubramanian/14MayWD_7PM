package com.FileHandling;

import java.io.*;

public class Methods {
    public static void main(String[]args){
        File file = new File("Sample.txt");

        try {
            if(file.createNewFile()){
                System.out.println("File created successfully");
            }else
                System.out.println("file exists already");
        } catch (IOException e) {
            System.out.println(e);
        }


        //Write

//        try {
//            FileWriter fw = new FileWriter("Sample.txt");
//            fw.write("Hello Everyone");
//            fw.append("\nWelcome to Java class");
//            fw.close();
//
//            System.out.println("The content is written successfully");
//        }catch (IOException e) {
//            System.out.println(e);
//        }

        //read

//        try{
//            FileReader fr = new FileReader("Sample.txt");
//            int character;
//
//            while ((character = fr.read()) != -1){
//                System.out.println((char)character);
//            }
//
//            fr.close();
//            System.out.println("The content read successfully");
//        }catch (IOException e){
//            System.out.println(e);
//        }

//        if ((file.delete()))
//            System.out.println("File deleted");
//        else
//            System.out.println("no file exists");


        //Buffered Writer

//        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter("Sample.txt"));
//            bw.write("Good Evening");
//            bw.newLine();
//            bw.append("Everyone");
//            bw.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }


        //buffered reader

        try{
            BufferedReader br = new BufferedReader(new FileReader("Sample.txt"));
            String line;

            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println(e);
        }

    }
}
