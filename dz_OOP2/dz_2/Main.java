package dz_OOP2.dz_1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Пушок", 1, "Трехцветный"))
                .addAnimal(new Ram("Бараш", 2, "Пушистая"))
                .addAnimal(new Horse("Ветерок", 3, 120))
                .addAnimal(new Cow ("Буренка", 4, 30 ))
                .addAnimal(new Goat("Кеша", 20, 35));

        for (The_brute animal : zoo.getAnimal()){
            System.out.println(animal);
            System.out.println(animal.say());
        }

        System.out.println("__________________________ISpeakable");

        for (ISpeakable speak : zoo.getISpeakable()){
            System.out.println(speak.say());
        }

        System.out.println("__________________________IRunable");

        for (IRunable runner : zoo.getIRunable()){
            System.out.println(String.format("%s, скорость: %s", String.valueOf(runner), runner.speedOfRun()));
        }

        System.out.println("__________________________ISwimable");

        for (ISwimable swimmer : zoo.getISwimable()){
            System.out.println(String.format("%s, скорость: %s", String.valueOf(swimmer), swimmer.speedOfSwim()));
        }

        System.out.println("__________________________IJumping");

        for (IJumping fly : zoo.getIFlyable()){
            System.out.println(String.format("%s, скорость: %s", String.valueOf(fly), fly.speedOfFly()));
        }
    }
    public static void main2(String[] args) {

        Gomo gomo = new Gomo();
        gomo.addPeople(new Owner("Петров", 27, 3))
                .addPeople(new Owner2("Иванов", 63, 2));
        
        for (People people : gomo.getPeople()){
            System.out.println(people);
            System.out.println(people.say());
        }
        System.out.println("__________________________ICapital");

        for (ICapital runner : gomo.getICapital()){
        System.out.println(String.format("%s, Количество скота: %s", String.valueOf(runner), runner.capitalOfCapital()));
        }

        IMyValue value;
        

        value = (n) -> {
            if ( n == 5) {
                System.out.println("У хозяина пять животных");
            }
            return n / 2;
        };


        System.out.println(value.getValue(6));
    
    }
}