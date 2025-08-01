package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class Directories {
    public static void main(String [] args) throws IOException {
       File folder = new File("My Folder/Folder1/Folder2");
       if(folder.mkdirs()){
           System.out.println("Success");
       }else{
           System.out.println("failure");
       }

       File file = new File(folder, "Example.txt");
       if(file.createNewFile()){
           System.out.println("File created success");
       }else{
           System.out.println("not created");
       }

        System.out.println(file.exists());
        System.out.println(folder.exists());
        System.out.println(file.getName());
        System.out.println(folder.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.length());
        System.out.println(file.lastModified());

        File newFile = new File(folder,"Exam.txt");
        System.out.println(file.renameTo(newFile));
        System.out.println(newFile.getName());

        File [] files = folder.listFiles();
        for(File f : files){
            System.out.println(f);
        }
    }
}
