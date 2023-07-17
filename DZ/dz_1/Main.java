package DZ.dz_1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 3);
        Owner owner = new Owner("Иван");
        
        cat.setOwner(owner);
        cat.greet();
        
        // Изменение имени кота
        cat.setName("Барсик");
        cat.greet();
    }
}

