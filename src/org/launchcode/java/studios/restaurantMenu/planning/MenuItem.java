package org.launchcode.java.studios.restaurantMenu.planning;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    private Date updated;

    public MenuItem(String name, double price, String description, String category, boolean isNew, Date updated) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.updated = updated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void determineNew() {
        Date today = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, -30);
        Date today30 = cal.getTime();

        if (this.updated.after(today30)) {
            this.isNew = true;
        } else {
            this. isNew = false;
        }

    }

    @Override
    public String toString() {
        return "MenuItem" + "\n" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                ", updated=" + updated +
                '}';
    }

    //        MenuItem
//        properties-
//        - dateAdded: Date
//        - isNew: Boolean
//        - price: Currency
//        - description: String
//        - name: String
//        - category: String
//         methods-
//        - determineNew: (Date), Boolean
}
