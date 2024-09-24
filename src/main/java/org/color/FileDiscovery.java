package org.color;

import java.io.File;

public class FileDiscovery {
    // used to represent and manipulate file and directory pathnames in a platform-independent manner.
    public static void main(String[] args) {
         File file = new File( "/home/pc/Desktop/Secret_File.txt");

         if(file.exists()) {
             System.out.println("That file exists");
             System.out.println(file.getPath());
             System.out.println(file.getAbsolutePath());
             System.out.println(file.isFile());
             file.delete();
         }else{
             System.out.println("File doesn't exist");
         }
    }
}
