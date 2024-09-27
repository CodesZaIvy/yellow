package org.color;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("Sunlit Souk - Patrick Patrikios.wav");
        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audiostream );

        String response = "";

        while(!response.equals("Q")){
            System.out.println("P = play,S = stop,R = reset, Q = quit");
            System.out.println("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();


            switch (response){
                //p for play
                case("P"): clip.start();
                    break;
                    //Stops the audio
                case ("S") : clip.stop();
                    break;
                    // Takes it back to the start
                case("R"): clip.setMicrosecondPosition(0);
                   break;
                case ("Q") : clip.close();
                   break;
                default : System.out.println("Not a valid response");

            }
        }

        System.out.println("Time to stop dancing !!!");

    }
}
