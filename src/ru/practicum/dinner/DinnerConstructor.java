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
        if (!dinnerMenu.containsKey(dishType)) {
            ArrayList<String> nameDishList = new ArrayList<>();
            nameDishList.add(dishName);
            dinnerMenu.put(dishType, nameDishList);
        } else {
            ArrayList<String> nameDishList = dinnerMenu.get(dishType);
            if (nameDishList.contains(dishName)) {
                System.out.println("Такое блюдо уже есть в списке.");
            } else {
                nameDishList.add(dishName);
            }
        }
    }

    void genCombo(ArrayList<String> DishComboList, int numberOfCombos) {
        String nameDish;
        ArrayList<String> nameDishType;

        for (int i = 1; i <= numberOfCombos; i++) {
            ArrayList<String> comboLunch = new ArrayList<>();
            System.out.println("Комбо " + (i));
            for (String dishType : DishComboList) {
                nameDishType = dinnerMenu.get(dishType);
                nameDish = nameDishType.get(random.nextInt(nameDishType.size()));
                comboLunch.add(nameDish);
            }
            System.out.println(comboLunch);
        }
    }

    boolean checkTypeDish(String typeDish) {
        return dinnerMenu.containsKey(typeDish);
    }
}
