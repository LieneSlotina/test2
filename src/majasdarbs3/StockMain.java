package majasdarbs3;

public class StockMain {


    public static void main (String [] args){
        Stock uznemums = new Stock("Blusas", 75);

  //      uznemums.maxValue= uznemums.currentValue; - šitā to neliek šeit. Tam ir jābūt konstruktorā
        //    uznemums.minValue= uznemums.currentValue;


        uznemums.printInformation();

        uznemums.updatePrice(56);
        uznemums.updatePrice(13);
        uznemums.updatePrice(86);
        uznemums.updatePrice(89);

        uznemums.printInformation();
    }


}
