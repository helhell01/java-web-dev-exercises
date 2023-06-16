package org.launchcode.java.studios.restaurantMenu.planning;

import org.launchcode.java.studios.restaurantMenu.planning.MenuItem;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main (String[] args) {

        MenuItem newItem1 = new MenuItem("yummy", 4.99, "description of yummy item", "entree", true, new Date());
        MenuItem newItem2 = new MenuItem("yummy", 4.99, "description of yummy item", "entree", false, new Date());
        MenuItem newItem3 = new MenuItem("yummy", 4.99, "description of yummy item", "entree", true, new Date());

        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu newMenu = new Menu(startingMenu, new Date());

        newMenu.addMenuItem(newItem1);
        newMenu.addMenuItem(newItem2);
        newMenu.addMenuItem(newItem3);

        newMenu.printItems(startingMenu, 0);

        newMenu.printItems(startingMenu, 1);

       // newMenu.removeMenuItem(newItem2);

        newMenu.printItems(startingMenu, 3);
        newMenu.printItems(startingMenu, 2);

        newItem2.determineNew();
        newItem3.determineNew();


        newMenu.addMenuItem(newItem2);
        newMenu.printItems(startingMenu, 3);

    }

}

