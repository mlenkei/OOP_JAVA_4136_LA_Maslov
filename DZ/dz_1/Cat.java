// Задача 1:
// Создайте класс "Кот" (Cat) со следующими свойствами:

// Приватное поле "имя" (name) типа String для
// хранения имени кота.
// Приватное поле "возраст" (age) типа int для хранения
// возраста кота.
// Публичные методы доступа (геттеры и сеттеры) для
// полей "имя" и "возраст".
// Публичный метод "приветствие" (greet), который 
// выводит на консоль приветствие вида
// "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
// Дополнительное задание:
// Создайте класс "Владелец" (Owner) со свойством "имя" 
// (name) типа String. Добавьте соответствующее поле 
// в классе "Кот" и методы доступа для него. 
// Измените метод "приветствие" класса "Кот",
// чтобы он выводил приветствие вида "Мяу! Меня зовут
// <имя>. Мне <возраст> года(лет). Мой владелец -
// <имя владельца>."

package DZ.dz_1;

import java.util.Scanner;

public class Cat {
    public static void main(String[] args) {

        Cat1 cat_name = new Cat1("Василий", 2, "Петров");
        String cat_nameName = cat_name.getName();
        int cat_nameAge = cat_name.getAge();
        String cat_nameOwner = cat_name.getOwner();
        
        System.out.println("Кота зовут: " + cat_name.getName()); // Получение имени с помощью публичного метода getName()
        System.out.println("Возраст кота: " + cat_name.getAge());
        System.out.println("Владелец: " + cat_name.getOwner());

        cat_name.setName("Пушок");
        cat_name.setAge(5);
        cat_name.setOwner("Петров_Кошечкин");
        System.out.println("Кота зовут: " + cat_name.getName()); 
        System.out.println("Возраст кота: " + cat_name.getAge());
        System.out.println("Владелец: " + cat_name.getOwner());
        cat_name.greet();
        
    }
}


class Cat1 {
    private String cat_name; // Приватное поле name
    private int age; // Приватное поле age
    private String owner_name;

    public Cat1(String cat_name, int age, String owner_name) {
        this.cat_name = cat_name;
        this.age = age;
        this.owner_name = owner_name;
    }

    public String getName() { // Публичный метод getName() для доступа к приватному полю name
        return cat_name;
    }

    public String getOwner() { // Публичный метод getName() для доступа к приватному полю name
        return owner_name;
    }    

    public Cat1(){
    }

    public void greet() {
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user for their first name
                System.out.print("Скажите как зовут кота: ");
                String new_Name = scanner.nextLine();
                System.out.print("Уточните владельца: ");
                String new_Owner = scanner.nextLine(); 
                System.out.print("Уточните сколько ему лет: ");
                int new_age = scanner.nextInt();

            System.out.println("Мяу, меня зовут " + new_Name + "! Мне " + new_age + " года (лет)" + ", Мой владелец: " + new_Owner);
        }
        }
    


    public void setName(String cat_name) {
       this.cat_name = cat_name;
    }

    public int getAge() {
       return age;
    }

    public void setAge(int age) {
       this.age = age;
    }
    public void setOwner(String owner_name) {
       this.owner_name = owner_name;
    }
        
}


