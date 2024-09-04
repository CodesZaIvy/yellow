package org.color;

import java.util.Random;
//Local variable
/*public class DiceRoller {
    DiceRoller(){
        //creating an instance
        Random random = new Random();
        int number = 0;
        roll(random , number);
    }
    void roll(Random random,int number){
        number = random.nextInt(6)+1;
        System.out.println(number);

    }

}

 */
//Global Variable
public class DiceRoller {
    Random random ;
    int number;
    DiceRoller(){
        //creating an instance
        random = new Random();
        roll(random , number);
    }
    void roll(Random random,int number){
        number = random.nextInt(6)+1;
        System.out.println(number);

    }

}
