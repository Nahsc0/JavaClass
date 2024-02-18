public class Main {
    public static void main(String[] args) {
        String str = "Hello, Jafaru!";
        int length = str.length();
        System.out.println("Length of the string: " + length);

        String str1 = "Hello, World!";
        String slicedString = str1.substring(3); // Slice starting from index 7
        System.out.println("Sliced string: " + slicedString);

        String str2 = "How is the class going bro?";
        StringBuilder sb = new StringBuilder(str2);
        sb.setCharAt(7, 'E'); // Replace character at index 7 with 'E'
        System.out.println("Modified string: " + sb.toString());

        //Data Types
        int age = 45;
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


    }
}

