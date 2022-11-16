package lv.javaguru.demo;
import java.util.Random;

public class RandomSumma {
        public static void main(String[] args) {
            Random generator = new Random();
            int mainigsCipars1 = generator.nextInt(101);
            int mainigsCipars2 = generator.nextInt(101);
            int result = mainigsCipars1 + mainigsCipars2;
            System.out.println(mainigsCipars1);
            System.out.println(mainigsCipars2);
            System.out.println("My random number is: " + result);
        }

    }


