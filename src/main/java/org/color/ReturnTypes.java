package org.color;

public class ReturnTypes {
    public static void main(String[] args) {
        int x = 4;
        int r = 6;
        // declare method twice
        int y = add(x,r);
        System.out.println(add(x,r));
    }
    static int add (int x, int r){
        //  return type is how you tell Java what kind of result you expect back from the method.
        return x + r;
    }

}
