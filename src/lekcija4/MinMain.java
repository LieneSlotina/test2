package lekcija4;

public class MinMain {
    public static void main(String[] args) {
        int[] masīvs = {13, 67, 35, 97, 28, 5};
        int min = masīvs[0];
        for (int i = 0; i < masīvs.length; i++) {
            if (masīvs[i] < min) {
                min = masīvs[i];
            }

        }System.out.println(min);
    }
}

