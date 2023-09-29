package org.artyomka.HackerRank.thirty_days_of_code;

import java.util.Scanner;

public class D2_Operators {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        double meal_cost = scanner.nextDouble();
        // Check if meal price != 0
        if (meal_cost != 0) {
            int tip_percentage = scanner.nextInt();
            int tax_percentage = scanner.nextInt();
            totalCostCalculator(meal_cost,tip_percentage,tax_percentage);
        } else {
            System.out.println("No price for the meal.");
        }
    }

    // Method for calculating total meal price
    public static void totalCostCalculator(double meal_cost, int tip_percentage, int tax_percentage) {
        //                   Meal                    Tip                                     Tax
        double totalCost = meal_cost + ((meal_cost / 100) * tip_percentage) + ((meal_cost / 100) * tax_percentage);
        System.out.println(Math.round(totalCost));
    }
}
