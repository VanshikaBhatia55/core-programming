package core_programming.java_methods.level3_problems;

public class BonusCalculator {
    private static final int NUM_EMPLOYEES = 10;
    private static final double LONG_SERVICE_BONUS = 0.05; // 5% for >5 years
    private static final double SHORT_SERVICE_BONUS = 0.02; // 2% for ≤5 years

    // Method to generate initial employee data (salary and years of service)
    public static double[][] generateEmployeeData() {
        double[][] employeeData = new double[NUM_EMPLOYEES][2];

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            // Generate random 5-digit salary (10000-99999)
            employeeData[i][0] = 10000 + (int)(Math.random() * 90000);

            // Generate random years of service (1-10)
            employeeData[i][1] = 1 + (int)(Math.random() * 10);
        }

        return employeeData;
    }

    // Method to calculate new salaries and bonuses
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] results = new double[NUM_EMPLOYEES][2]; // [newSalary, bonus]

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double currentSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];

            // Calculate bonus based on years of service
            double bonusRate = (yearsOfService > 5) ? LONG_SERVICE_BONUS : SHORT_SERVICE_BONUS;
            double bonus = currentSalary * bonusRate;

            // Store new salary and bonus
            results[i][0] = currentSalary + bonus; // New salary
            results[i][1] = bonus; // Bonus amount
        }

        return results;
    }

    // Method to calculate totals
    public static double[] calculateTotals(double[][] employeeData, double[][] results) {
        double[] totals = new double[3]; // [totalOldSalary, totalNewSalary, totalBonus]

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            totals[0] += employeeData[i][0]; // Sum of old salaries
            totals[1] += results[i][0];      // Sum of new salaries
            totals[2] += results[i][1];      // Sum of bonuses
        }

        return totals;
    }

    // Method to display results in tabular format
    public static void displayResults(double[][] employeeData, double[][] results) {
        // Print header
        System.out.println("\nZara Employee Bonus Report");
        System.out.println("=".repeat(75));
        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n",
                "Employee", "Years", "Old Salary", "Bonus", "New Salary");
        System.out.println("-".repeat(75));

        // Print employee data
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("%-10d %-15.0f ₹%-14.2f ₹%-14.2f ₹%-14.2f%n",
                    (i + 1),
                    employeeData[i][1],    // Years of service
                    employeeData[i][0],    // Old salary
                    results[i][1],         // Bonus
                    results[i][0]);        // New salary
        }

        // Calculate and display totals
        double[] totals = calculateTotals(employeeData, results);

        System.out.println("-".repeat(75));
        System.out.printf("%-26s ₹%-14.2f ₹%-14.2f ₹%-14.2f%n",
                "Totals:",
                totals[0],    // Total old salary
                totals[2],    // Total bonus
                totals[1]);   // Total new salary
        System.out.println("=".repeat(75));

        // Display summary statistics
        System.out.printf("%nCompany Statistics:%n");
        System.out.printf("Total Annual Salary Budget: ₹%.2f%n", totals[0]);
        System.out.printf("Total Bonus Payout: ₹%.2f%n", totals[2]);
        System.out.printf("New Annual Salary Budget: ₹%.2f%n", totals[1]);
        System.out.printf("Percentage Increase in Budget: %.2f%%%n",
                (totals[1] - totals[0]) / totals[0] * 100);
    }

    public static void main(String[] args) {
        // Generate initial employee data
        double[][] employeeData = generateEmployeeData();

        // Calculate bonuses and new salaries
        double[][] results = calculateBonusAndNewSalary(employeeData);

        // Display results
        displayResults(employeeData, results);
    }
}
