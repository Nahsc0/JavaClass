import java.util.Date;

public class nasco {
    public static void main(String[] args) {
        int age = 27;
        age = 45;
        
        //Generating a Primitive Type Data

        byte maikudi= 30;
        long viewCounts = 4_123_456_789L;
        float price = 9.22F;
        boolean eligibleForLoan = false;
        char letter = 'A';
        System.out.println(age);
        System.out.println(maikudi);
        System.out.println(viewCounts);
        System.out.println(price);
        System.out.println(eligibleForLoan);
        System.out.println(letter);

        System.out.println("Age: " + age + ", Maikudi: " + maikudi + ", View Counts: " + viewCounts + ", Price: " + price + ", Eligible for Loan: " + eligibleForLoan + ", Letter: " + letter);


        // Generating a Non-Premitive type (Reference) Datasets 
        //sout + tab = system.out.println()

        Date now = new Date();
        System.out.println(now);

        byte x = 1;
        byte y = x;
        x = 2;

        System.out.println(x);
        System.out.println(y);


       // System.out.println(age, maikudi, viewCounts, price, eligibleForLoan, letter);
    }
}
