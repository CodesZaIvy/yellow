package org.color;

public class ObjectsArray {
    public static void main(String[] args) {

        //Camera[] collection = new Camera[8];
        // Instead of declaring the array of camera objects called collection
         Camera camera1 = new Camera("DSLR (Digital Single-Lens Reflex");
         Camera camera2 = new Camera("Mirrorless Camera");
         Camera camera3 = new Camera("Point-and-Shoot Camera");
         Camera camera4 = new Camera("Action Camera");
         Camera camera5 = new Camera("Instant Camera");
         Camera camera6 = new Camera("360-Degree Camera");
         Camera camera7 = new Camera("SmartPhone Camera");
         Camera camera8 = new Camera("Film Camera");

         Camera[] collection = {camera1,camera2,camera3,camera4,camera5,camera6,camera7,camera8,};

        //hence I will not need the ones below
        /*
         collection[0] = camera1;
         collection[1] = camera2;
         collection[2] = camera3;
         collection[3] = camera4;
         collection[4] = camera5;
         collection[5] = camera6;
         collection[6] = camera7;
         collection[7] = camera8;
        */

        System.out.println(collection[0].name);
        System.out.println(collection[1].name);
        System.out.println(collection[2].name);
        System.out.println(collection[3].name);
        System.out.println(collection[4].name);
        System.out.println(collection[5].name);
        System.out.println(collection[6].name);
        System.out.println(collection[7].name);

    }


}
