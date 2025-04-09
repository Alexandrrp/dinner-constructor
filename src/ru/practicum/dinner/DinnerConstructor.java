package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;

import static ru.practicum.dinner.Main.random;

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

    void genCombo(ArrayList<String> DishComboList, int numberOfCombos) {
        String namePosition;
        ArrayList<String> nameCategory;

        for (int i = 1; i <= numberOfCombos; i++) {
            ArrayList<String> comboLunch = new ArrayList<>();
            System.out.println("Комбо " + (i));
            for (String dishType : DishComboList) {
                nameCategory = dinnerMenu.get(dishType);
                namePosition = nameCategory.get(random.nextInt(nameCategory.size()));
                comboLunch.add(namePosition);
            }
            System.out.println(comboLunch);
        }
    }

    boolean checkTypeCategory(String typeCategory) {
        return dinnerMenu.containsKey(typeCategory);
    }
}
