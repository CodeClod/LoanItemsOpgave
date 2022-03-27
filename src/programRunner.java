import java.util.ArrayList;
import java.util.Scanner;

public class programRunner {
    Scanner in = new Scanner(System.in);
    private ArrayList<LoanItem> loanedItems = new ArrayList<>();

    void inputLoanItems() {
        int numLoanedItems = in.nextInt();
        in.nextLine();
        String tempType;
        String tempTitle;
        for (int i = 0; i < numLoanedItems; i++) {
            System.out.println("ITEM NO. " + (i + 1));
            System.out.println("Type (b or v): ");
            tempType = in.nextLine();
            System.out.println("Title: ");
            tempTitle = in.nextLine();
            switch (tempType){
                case "b","Book" -> loanedItems.add(i, new Book(tempTitle));
                case "v","Video" -> loanedItems.add(i, new Video(tempTitle));
            }
        }
    }
    void printLoanedItems(){
        System.out.println("LIST OF LOAN ITEMS: ");
        System.out.println("-------------------");
        System.out.printf("%-5S%-8S%S ","id", "type", "title");
        System.out.println();
        for (int i = 0; i < loanedItems.size(); i++) {
            System.out.printf("%-5d%-8s%s\n",(i + 1),loanedItems.get(i).getClass().getSimpleName(),loanedItems.get(i).getTitle());
        }
    }

    void go() {
        System.out.println("How many items do you want to loan?");
        inputLoanItems();
        printLoanedItems();
    }

    public static void main(String[] args) {
        new programRunner().go();
    }
}