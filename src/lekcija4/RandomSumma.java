package lekcija4;

import java.util.Random;

public class RandomSumma {
    public static void main(String[] args) {
        int sum=0;


        for(int i=0; i<3; i++){
            Random generator=new Random();
            int randomInt1=generator.nextInt(200);
           sum=sum+randomInt1;
            System.out.println(sum);
        }
    }
}
