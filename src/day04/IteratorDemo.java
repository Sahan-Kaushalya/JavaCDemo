package day04;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<String> clothingItems = new ArrayList<>();
        clothingItems.add("T-Shirt");
        clothingItems.add("Jeans");
        clothingItems.add("Jacket");
        clothingItems.add("Shorts");

        Iterator<String> it = clothingItems.iterator();

        System.out.println("DRESSLAB Inventory Items:");

        while (it.hasNext()) {
            String item = it.next();

            System.out.println("- " + item);

            if (item.equals("Shorts")) {
                it.remove();
                System.out.println("(Shorts was removed from list)");

            }
        }
    }
}

