package lekcija3;

public class Detector {
    public static void main (String[] args){
        int decibeli=70;

        if (decibeli<39){
            System.out.println("Faint");
        }else if ((decibeli>=40) && (decibeli<=69)){
            System.out.println("Moderate");
        }else if ((decibeli>=70)&&(decibeli<=99)){
            System.out.println("Very loud");
        }else if ((decibeli>=100)&&(decibeli<=129)){
            System.out.println("Extremely loud");
        }else {
            System.out.println("Painful");
        }

    }

}
