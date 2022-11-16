package lekcija4;

public class StatisticsOriginal {
    private int minValue;
    private int maxValue;
    private int avgValue;

   /* public StatisticsOriginal() {
        this.minValue = number[i];
        this.maxValue = maxValue;
        this.avgValue = avgValue;
    }*/
    public static void main(String[] args) {
        StatisticsOriginal statistika=new StatisticsOriginal();

    int[] number = {13, 67, 35, 97, 28, 5};
    int sum=0;
    statistika.minValue=number[0];
    statistika.maxValue=number[0];



    public void min(int vertiba){

        for (int i=0; i<number.length; i++){
            if (number[i]<this.minValue) {

                this.minValue = number[i];
                System.out.println(this.minValue);
            }
        }


    }
    public static void Max(){

    }
    public static void Avg(){

    }

}
