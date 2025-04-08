package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> dinnerMenu;

    DinnerConstructor() {
        dinnerMenu = new HashMap<>();
    }

    void updateMenu(String dishType, String dishName) {
        if (dinnerMenu.containsKey(dishType)) {
            ArrayList<String> nameDishList = dinnerMenu.get(dishType);
            nameDishList.add(dishName);
        } else {
            ArrayList<String> nameDishList = new ArrayList<>();
            nameDishList.add(dishName);
            dinnerMenu.put(dishType, nameDishList);
        }
    }
}
