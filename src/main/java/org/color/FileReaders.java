package org.color;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders {
    public static void main(String[] args) {
         try {
             FileReader fl = new FileReader("/home/pc/Desktop/art.txt");
         int data = fl.read();
         while (data != -1) {
             System.out.println((char) data);
             data = fl.read();
         }
         fl.close();

         }catch (FileNotFoundException r){
             r.printStackTrace();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

    }
    }

