package org.color;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("/home/pc/Desktop/poem.txt");
            writer.write("Roses are Red \njuggy juggy  \n hum hum hum");
            writer.append("\n (A poem by yee)");
            writer.close();


        }catch(IOException i){
            i.printStackTrace();

        }
    }
}