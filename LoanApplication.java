public class LoanApplication {
    public static void main(String[] args) {
        // Sample applicant information
        int creditScore = 750;
        double annualIncome = 50000.0;
        boolean hasCollateral = true;

        // Check loan conditions
        boolean isLoanApproved = checkLoanConditions(creditScore, annualIncome, hasCollateral);

        // Display result
        if (isLoanApproved) {
            System.out.println("Congratulations! Your loan application is approved.");
        } else {
            System.out.println("Sorry, your loan application is not approved.");
        }
    }

    public static boolean checkLoanConditions(int creditScore, double annualIncome, boolean hasCollateral) {
        // Check if the applicant meets the loan conditions
        if (creditScore >= 700 && annualIncome >= 50000.0 && hasCollateral) {
            return true; // Loan conditions met
        } else {
            return false; // Loan conditions not met
        }
    }
}
