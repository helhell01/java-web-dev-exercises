package org.launchcode.java.studios.restaurantMenu.planning;

import java.util.ArrayList;
import java.util.Date;
import org.launchcode.java.studios.restaurantMenu.planning.MenuItem;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> menuItems, Date lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
        lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);

    }

    public void printItems(ArrayList menuItems, int index) {

        if (index >= menuItems.size()) {
            System.out.println("***" + "\n");
            for (MenuItem anItem : this.menuItems) {
                System.out.println("item: " + anItem.toString() + "\n");
            }
            System.out.println("***");
        } else {
            MenuItem item = (MenuItem) menuItems.get(index);
            //test our determineNew method
//            System.out.println("item " + index + " pre determine: " + item.isNewItem());
//            item.determineNew();
//            System.out.println("item " + index + "post determine: " + item.isNewItem());

            System.out.println("item: " + item.toString() + "\n");


        }

    }



    //        Menu
//        properties-
//        - menuItems: ArrayList<MenuItem>
//        - lastUpdated: Date
//         methods-
//        - setLastUpdated: (), Date
//        - addMenuItem
//        - removeMenuItem
//        - equals menu item
//        - printMenu/menuItem

}
