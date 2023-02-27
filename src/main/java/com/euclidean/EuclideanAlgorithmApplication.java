package com.euclidean;


public class EuclideanAlgorithmApplication {

    public static void main(String[] args) {

        int a = 1989;
        int b = 867;

        while(a != b) {
            if(a>b) {
                a -= b;
            } else {
                b -= a;
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println();
            }
        }
        System.out.println("NWD = " + a);
    }

}
