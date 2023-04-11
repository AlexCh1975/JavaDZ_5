/*
 * Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности
 */

package task_002;

import java.util.*;

public class program {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] array = {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
        "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
        "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
        "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов",};
       
        for (String item: array) {
            list.add(item);
        }
        sorted(list);
    }
    
    public static void sorted(ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<>();  
        Map<String, Integer> map = new HashMap<>();
        String[] temp = new String[2];
        for (String item: list){
            temp = item.split(" ");
            Arrays.toString(temp);
            newList.add(temp[0]);
        }
        for (String i: newList){
            if (map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }
        map.entrySet().removeIf(entry -> entry.getValue() <= 1);
        map.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(System.out::println);
    }
}
