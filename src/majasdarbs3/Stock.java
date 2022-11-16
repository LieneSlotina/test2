package majasdarbs3;

public class Stock {
    private String companyName;
    private int currentValue;
    private int minValue;
    private int maxValue;

    public Stock(String companyName, int currentValue) {
        this.companyName = companyName;
        this.currentValue = currentValue;
        this.minValue=currentValue;
        this.maxValue=currentValue;

    }

    public void updatePrice(int currentValue){
        this.currentValue= currentValue;
        if (currentValue>maxValue){
            this.maxValue = currentValue;
        }else if (currentValue< minValue){
            this.minValue = currentValue;
        }

    }

    public void printInformation(){
        System.out.println("Uzņēmums - "+ companyName+ ", Current Price = " + currentValue+ ", Min price = "+ minValue+ ", Max Price = "+ maxValue);

    }
}
