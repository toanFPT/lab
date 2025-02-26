
package Week_1;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author thais
 */
public class TestWeek1 {

     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             while (true) {
                 System.out.println("1. Solve Superlative Equation (ax + b = 0)");
                 System.out.println("2. Solve Quadratic Equation (ax^2 + bx + c = 0)");
                 System.out.println("3. Exit");
                 System.out.print("Choose an option: ");
                 
                 int choice = scanner.nextInt();
                 if (choice == 3) break;
                 
                 if (choice == 1) {
                     System.out.print("Enter coefficient A: ");
                     float a = scanner.nextFloat();
                     System.out.print("Enter coefficient B: ");
                     float b = scanner.nextFloat();
                     
                     EquationSolver solver = new EquationSolver(a, b);
                     List<Float> result = solver.calculateEquation();
                     if (result == null) System.out.println("No solution.");
                     else if (result.isEmpty()) System.out.println("Infinitely many solutions.");
                     else System.out.println("Solution: x = " + result.get(0));
                     
                     displayNumberProperties(a, b);
                 }
                 else if (choice == 2) {
                     System.out.print("Enter coefficient A: ");
                     float a = scanner.nextFloat();
                     System.out.print("Enter coefficient B: ");
                     float b = scanner.nextFloat();
                     System.out.print("Enter coefficient C: ");
                     float c = scanner.nextFloat();
                     
                     EquationSolver solver = new EquationSolver(a, b, c);
                     List<Float> result = solver.calculateQuadraticEquation();
                     if (result == null) System.out.println("No solution.");
                     else if (result.isEmpty()) System.out.println("Infinitely many solutions.");
                     else System.out.println("Solutions: x1 = " + result.get(0) + ", x2 = " + result.get(1));
                     
                     displayNumberProperties(a, b, c);
                 }
             }}
    }
    
    private static void displayNumberProperties(float... numbers) {
        for (float num : numbers) {
            System.out.println("Number: " + num + " | Odd: " + EquationSolver.isOdd(num) + " | Perfect Square: " + EquationSolver.isPerfectSquare(num));
        }
    }
    }
    