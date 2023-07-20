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

        System.out.println("__________________________IFlyable");

        for (IFlyable fly : zoo.getIFlyable()){
            System.out.println(String.format("%s, скорость: %s", String.valueOf(fly), fly.speedOfFly()));
        }

    }
}