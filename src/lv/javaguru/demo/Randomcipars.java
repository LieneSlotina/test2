package lv.javaguru.demo;

import java.util.Random;

public class Randomcipars {
    public static void main(String[] args) {
        Random generator = new Random();
        int randomint = generator.nextInt(101);
        System.out.println("My random nummber is; " +randomint);
    }
}