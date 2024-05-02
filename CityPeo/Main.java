package CityPeo;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        City frankfurt = new City("Frankfurt");
        frankfurt.addInhabitant("Hoang", "08-06-2003", "Single");
        frankfurt.addInhabitant("Phi", "07-03-2003", "Single");
        frankfurt.addInhabitant("Huy Bao", "31-12-2003", "Single");

        int unmarriedCount = 0;
        for (Inhabitant inhabitant : frankfurt.getAllInhabitants()) {
            if (inhabitant.getMaritalStatus().equals("Single")) {
                unmarriedCount++;
            }
        }
        System.out.println("Toal unmmarried habitant in FF: " + unmarriedCount);

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = scr.nextLine();
        
        Inhabitant hoang = frankfurt.searchInhabitant("Hoang");
        if (hoang != null) {
            System.out.println("Found: " + hoang.getName());
            System.out.println("Date of Birth: " + hoang.getDateOfBirth());
            System.out.println("Marry?: " + hoang.getMaritalStatus());
        } else {
            System.out.println("inhabitant not found.");
        }
    }
}