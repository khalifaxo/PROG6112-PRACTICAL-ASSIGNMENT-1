/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seriesmodel;

/**
 *
 * @author RC_Student_lab
 */
import java.util.ArrayList;
import java.util.Scanner;

public class SeriesManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<SeriesModel> seriesList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("LATEST SERIES - 2025");
        System.out.println("...............................");
        System.out.print("Enter 1 to launch menu or any other key to exit: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            preloadSeries(); // load some default series for testing/demo
            showMenu();
        } else {
            System.out.println("Exiting program. Goodbye!");
        }
    }

    public static void showMenu() {
        int option;

        do {
            System.out.println("\nPlease select one of the following menu items:");
            System.out.println("1. Capture a new series");
            System.out.println("2. Search for a series");
            System.out.println("3. Update series age restriction");
            System.out.println("4. Delete a series");
            System.out.println("5. Print series report - 2025");
            System.out.println("6. Exit Application");
            System.out.print("Enter your choice: ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> captureSeries();
                case 2 -> searchSeries();
                case 3 -> updateAgeRestriction();
                case 4 -> deleteSeries();
                case 5 -> printReport();
                case 6 -> System.out.println("Thank you for using the system. Goodbye!");
                default -> System.out.println("Invalid option. Please try again.");
            }
        } while (option != 6);
    }

    public static void captureSeries() {
        System.out.println("\nCAPTURE A NEW SERIES");
        System.out.println("************************");

        System.out.print("Enter the series id: ");
        String id = scanner.nextLine();

        System.out.print("Enter the series name: ");
        String name = scanner.nextLine();

        // ✅ Validate Age Restriction
        int age;
        while (true) {
            System.out.print("Enter the series age restriction: ");
            String input = scanner.nextLine();
            try {
                age = Integer.parseInt(input);
                if (isValidAgeRestriction(age)) {
                    break;
                } else {
                    System.out.println("Invalid age restriction. Enter a number between 2 and 18.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers only.");
            }
        }

        // ✅ Validate Number of Episodes
        int episodes;
        while (true) {
            System.out.print("Enter the number of episodes for " + name + ": ");
            String input = scanner.nextLine();
            try {
                episodes = Integer.parseInt(input);
                if (episodes > 0) {
                    break;
                } else {
                    System.out.println("Number of episodes must be greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers only.");
            }
        }

        SeriesModel newSeries = new SeriesModel(id, name, age, episodes);
        seriesList.add(newSeries);

        System.out.println("Series processed successfully!!!");
    }

    public static void searchSeries() {
        System.out.print("Enter the Series ID to search: ");
        String id = scanner.nextLine();

        SeriesModel series = searchSeriesById(id);
        if (series != null) {
            System.out.println("Series Found:");
            System.out.println(series);
        } else {
            System.out.println("Series not found.");
        }
    }

    public static void updateAgeRestriction() {
        System.out.print("Enter the Series ID to update: ");
        String id = scanner.nextLine();

        System.out.print("Enter new age restriction: ");
        int newAge = Integer.parseInt(scanner.nextLine());

        if (updateSeriesAge(id, newAge)) {
            System.out.println("Age restriction updated successfully.");
        } else {
            System.out.println("Series not found.");
        }
    }

    public static void deleteSeries() {
        System.out.print("Enter the Series ID to delete: ");
        String id = scanner.nextLine();

        if (deleteSeriesById(id)) {
            System.out.println("Series deleted successfully.");
        } else {
            System.out.println("Series not found.");
        }
    }

    public static void printReport() {
        System.out.println("\n===== SERIES REPORT - 2025 =====");
        if (seriesList.isEmpty()) {
            System.out.println("No series available.");
        } else {
            for (SeriesModel series : seriesList) {
                System.out.println(series);
            }
        }
    }

    // ============================
    // Helper Methods for Testing
    // ============================

    public static SeriesModel searchSeriesById(String id) {
        for (SeriesModel s : seriesList) {
            if (s.SeriesId.equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }

    public static boolean updateSeriesAge(String id, int newAge) {
        for (SeriesModel s : seriesList) {
            if (s.SeriesId.equalsIgnoreCase(id)) {
                s.SeriesAge = newAge;
                return true;
            }
        }
        return false;
    }

    public static boolean deleteSeriesById(String id) {
        for (SeriesModel s : seriesList) {
            if (s.SeriesId.equalsIgnoreCase(id)) {
                seriesList.remove(s);
                return true;
            }
        }
        return false;
    }

    public static boolean isValidAgeRestriction(int age) {
        return age >= 2 && age <= 18;
    }

    public static void preloadSeries() {
        seriesList.clear();
        seriesList.add(new SeriesModel("101", "Extreme Sports", 12, 8));
        seriesList.add(new SeriesModel("102", "Cooking Master", 10, 6));
        seriesList.add(new SeriesModel("103", "Space Adventures", 14, 10));
    }

    static void updateSeries() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void searchByName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void listByAgeRestriction() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void showTotalSeries() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
