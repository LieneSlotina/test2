package lekcija4;

public class SumMain {
    public static void main(String[] args){
        int[] numbers={10, 20, 30, 40};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println ("Apstrādāju skaitli ["+i+"] "+ numbers[i]);
            sum=sum+numbers[i];
            System.out.println("Summa "+sum);


        }System.out.println("Summa "+sum);
    }
}
