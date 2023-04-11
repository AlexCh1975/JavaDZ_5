/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек 
 * может иметь несколько телефонов.
 */

import java.util.*;

public class program {
    public static void main(String[] args) {
        Map<String, List<String>> phonebook = new HashMap<>();
        int i = 0;
        while (i < 3){
            String encoding = System.getProperty("console.encoding", "cp866");
            Scanner sc = new Scanner(System.in, encoding);
            System.out.print("Введите фамилию и номера телефона: \n");
            String str = sc.nextLine();
        
            String[] arr = str.split(" ");
            String surName = arr[0];
            List<String> lst = new LinkedList<>();
            for (int j = 1; j < arr.length; j++) {
                lst.add(arr[j]);
                phonebook.put(surName, lst);
            }

            i++;
        }
        for (var el : phonebook.entrySet()) {
            System.out.println(el.getKey()+ ":" + " " + el.getValue());
        }
        
      
    }   
}
