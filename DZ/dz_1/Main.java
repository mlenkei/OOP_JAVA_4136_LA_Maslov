package DZ.dz_1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Шарик", 2);
        Owner owner = new Owner("Инокентий");
        
        cat.setOwner(owner);
        cat.greet();
        
        /**
         * Изменение имени кота
         */
        cat.setName("Васька");
        cat.greet();  // Публичный метод "приветствие" (greet)
    }
}

