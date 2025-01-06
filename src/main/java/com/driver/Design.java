package com.driver;

import java.util.Scanner;

public class Design {
    private String name;
    private String category;
    private String designerUsername;
    private double rating;

    public Design(String name, String category, String designerUsername) {
        this.name = name;
        this.category = category;
        this.designerUsername = designerUsername;
        this.rating = 0.0; // Default rating
    }

    public static Design createDesignFromUserInput(String name, String category, String designerUsername, double rating) {
        Design design = new Design(name, category, designerUsername);
        design.setRating(rating);
        return design;
    }

    public void setRating(double rating) {

        this.rating = rating;
    }

    public double getRating() {
    	//your code goes here
        return rating;
    }

    public String getKey() {
        return name + "_" + category + "_" + designerUsername;
    }

    public void displayDesignDetails() {
        System.out.println("Primary Key: " + getKey());
        System.out.println("Design Rating: " + rating);
    }

    public double performMathOperation() {
        return 2 * rating;
    }

    public static void main(String[] args) {
    	//your code goes here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter design name: ");
        String name = scanner.next();
        System.out.println("Enter design category: ");
        String category = scanner.next();
        System.out.println("Enter designer's username: ");
        String designer = scanner.next();
        System.out.println("Enter design rating: ");
        Double rating = scanner.nextDouble();

        createDesignFromUserInput(name,category,designer,rating);
    }
}
