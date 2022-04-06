package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        // create array list
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        products.add("Bison Sweater");
        products.add("Bison Tee");
        products.add("Bison Hoodie");
        products.add("Bison Bumper Sticker");
        prices.add(55.99);
        prices.add(14.99);
        prices.add(23.99);
        prices.add(4.99);

        // add loop
        ArrayList<String> purchases = new ArrayList<>();


        String input = "";

        while (input != 5)
        {
            System.out.println("What would you like to do?");

            System.out.println("1. buy sweater, 2. buy tee, 3.buy hoodie, 4. buy stickers, 5.finish");
            Scanner key = new Scanner(System.in);
            input = key.nextLine();
            if (input.equals(1));
        }
        System.out.println("done");






    }}