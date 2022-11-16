package majasdarbs22;

public class Main {
    public static void main(String[] args){
        Books grāmata1 = new Books("Sals Rakeli", 2020, "Zeme mostas", true, "9789934859854");
        Books grāmata2 = new Books ("Henriks Fekseuss", 2015, "Varas spēle", false, "9789934053436");

        System.out.println("Izcila grāmata, ko ir vērts izlasīt ir " + grāmata2.getBookName()+", ko sarakstījis autors "+ grāmata2.getAuthor()+".");
        System.out.println("Grāmata izdota "+grāmata2.getYear()+ ". gadā, uz tās ISBN ir "+ grāmata2.getISBN()+ ".");

        System.out.println("Vēl laba grāmata, ko ir vērts izlasīt, lai uzzinātu notiekošos procesus, ir " + grāmata1.getBookName()+", ko sarakstījis autors "+ grāmata1.getAuthor()+ ".");
        System.out.println("Grāmata izdota "+grāmata1.getYear()+ ". gadā, uz tās ISBN ir "+ grāmata1.getISBN()+ ".");
    }
}
