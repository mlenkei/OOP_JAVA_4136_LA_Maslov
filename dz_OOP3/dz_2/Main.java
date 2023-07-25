package dz_OOP3.dz_2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.add("Пушок");
        list.add("Васька");
        list.add("Рыжик");

        list.add(1, "Матроскин");
        list.add(3, "Котофей");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

    }
}
