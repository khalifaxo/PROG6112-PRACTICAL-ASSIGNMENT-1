/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seriesmodel;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;

public class SeriesManagerApp {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SeriesManager.preloadSeries();

        while (true) {
            printMenu();
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = 0;
            }

            switch (choice) {
                case 1 -> SeriesManager.captureSeries();
                case 2 -> SeriesManager.searchSeries();
                case 3 -> SeriesManager.updateSeries();
                case 4 -> SeriesManager.deleteSeries();
                case 5 -> SeriesManager.printReport();
                case 6 -> SeriesManager.searchByName();             
                case 7 -> SeriesManager.listByAgeRestriction();     
                case 8 -> SeriesManager.showTotalSeries();          
                case 9 -> {
                    System.out.println("\nExiting application... Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n====================================");
        System.out.println("Please select one of the following menu items:");
        System.out.println("(1) Capture a new series");
        System.out.println("(2) Search for a series by ID");
        System.out.println("(3) Update series age restriction");
        System.out.println("(4) Delete a series");
        System.out.println("(5) Print series report - 2025");
        System.out.println("(6) Search for a series by Name");     
        System.out.println("(7) List all series by Age Restriction"); 
        System.out.println("(8) Show total number of series");     
        System.out.println("(9) Exit Application");
        System.out.println("====================================");
        System.out.print("Enter your choice: ");
    }
}
