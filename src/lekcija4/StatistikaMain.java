package lekcija4;

public class StatistikaMain {
    public static void main(String[] args) {
            Statistika statistica=new Statistika();

        int[] masīvs = {13, 67, 35, 97, 28, 5};
        int sum=0;
        statistica.min=masīvs[0];
        statistica.max=masīvs[0];


        for (int i = 0; i < masīvs.length; i++) {
            if (masīvs[i] < statistica.min) {
                statistica.min = masīvs[i];
            }
            if (masīvs[i] > statistica.max) {
                statistica.max = masīvs[i];
            }
            sum = sum + masīvs[i];
        }

        statistica.avg=sum/masīvs.length;


        System.out.println("Min" +statistica.min);
        System.out.println("Max" +statistica.max);
        System.out.println("Avg" +statistica.avg);
        }
    }



