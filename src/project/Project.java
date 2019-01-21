package project;

import java.util.Random;

public class Project {

    public static void main(String[] args) {

        System.out.print(args[0] + " ");
        System.out.print(args[1] + " ");
        System.out.println(args[2]);

        Random r = new Random();
        System.out.println("Random number: " + r.nextInt(1000));
    }
}


