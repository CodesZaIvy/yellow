package org.color;

public class Arrays2D {
    public static void main(String[] args) {
       int[][] lotteryCard = {{19,8,9},
                                {60,8,7},
                                    {6,4,8}
       };

       //or

       int [][] loterryCard2 = new int[4][5];
       loterryCard2[0][0] = 19;
        loterryCard2[0][1] = 8;
        loterryCard2[0][2] = 9;
        loterryCard2[1][0] = 60;
        loterryCard2[1][1] = 8;
        loterryCard2[1][2] = 7;
        loterryCard2[2][0] = 6;
        loterryCard2[2][1] = 4;
        loterryCard2[2][2] = 8;

        // [row]|[column]
        System.out.println(lotteryCard[0][0]);

        // print hexagonal numbers
        System.out.println("---------------");

            for(int i = 0; i<3; i++){
                System.out.println(lotteryCard[i][i]);

        }
            // print all the numbers
        System.out.println("------------");
            for (int i=0; i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.println(lotteryCard[i][j]);
    }
}




    }



}
