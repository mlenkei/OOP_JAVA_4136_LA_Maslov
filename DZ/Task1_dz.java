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

package DZ;

import java.util.Scanner;

public class Task1_dz {
    public static void main(String[] args) {

        Cat cat_name = new Cat("Василий", 2);
        String cat_nameName = cat_name.getName();
        int cat_nameAge = cat_name.getAge();
        
        System.out.println("Кота зовут: " + cat_name.getName()); // Получение имени с помощью публичного метода getName()
        System.out.println("Возраст кота: " + cat_name.getAge());

        cat_name.setName("Пушок");
        cat_name.setAge(5);
        cat_name.sayMeow();
        cat_name.Greeting();
        
    }
}

class Cat {
    private String cat_name; // Приватное поле name
    private int age; // Приватное поле age

    public Cat(String cat_name, int age) {
        this.cat_name = cat_name;
        this.age = age;
    }

    public void Greeting() {
    }

    public String getName() { // Публичный метод getName() для доступа к приватному полю name
        return cat_name;
    }

    public Cat(){
    }

    public void sayMeow(){
        System.out.println("Мяу, меня зовут " + cat_name + "! Мне " + age + " года (лет)");
    }
     public String getName() {
       return cat_name;
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

    public void Greeting() {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for their first name
            System.out.print("Скажите как зовут кота: ");
            String firstName = scanner.nextLine();
            System.out.print("Уточните сколько ему лет: ");
            int age = scanner.nextInt();
        
        // Print a message that says hello to the user
            System.out.println("Мяу, меня зовут " + firstName + "! Мне " + age + " года (лет)");
        
        scanner.close();
    }
}
}


