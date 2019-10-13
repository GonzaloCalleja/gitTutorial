package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("PHONE AGENDA");
        System.out.print("Number of contacts: ");
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            System.out.print("Contact name & number: ");
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }

        System.out.println("Name people you want to search for: ");

        while (in.hasNext()) {
            String s = in.next();
            if (phoneBook.get(s) != null) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
