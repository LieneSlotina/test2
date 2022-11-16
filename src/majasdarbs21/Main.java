package majasdarbs21;

public class Main {
    public static void main (String[] args){
        Cilveks persona1 = new Cilveks();
        persona1.setName("Kaspars");
        persona1.setAge(57);
        persona1.setWeight(85);
        persona1.setHungry(true);
        System.out.println("Cilvēka vārds ir " + persona1.getName());
        System.out.println("Cilvēka vecums ir " + persona1.getAge());
        System.out.println("Cilvēka svars ir " + persona1.getWeight());
        System.out.println("Vai cilvēks ir badā? "+ persona1.isHungry());


    }
}
