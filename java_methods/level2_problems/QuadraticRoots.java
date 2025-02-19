package core_programming.java_methods.level2_problems;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter coefficients a : ");
        int a = input.nextInt();
        System.out.print("Enter coefficients b : ");
        int b = input.nextInt();
        System.out.print("Enter coefficients c : ");
        int c = input.nextInt();

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero for a quadratic equation.");
            return; // Exit the program
        }

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.printf("Roots are real and different: %.2f and %.2f%n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("Root is real and repeated: %.2f%n", roots[0]);
        } else {
            System.out.println("Roots are complex.");
        }

    }

    public static int findDiscriminant(int a , int b , int c){
         return (int)(Math.pow(b,2) - 4 * a * c);
    }

    public static double[] findRoots(int a, int b, int c){
        int discriminant = findDiscriminant(a,b,c);
        double root1 , root2;
        if(discriminant > 0){
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2};
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            return new double[]{root1};
        }else{
            return new double[0];
        }
    }

}
