package dz_OOP3.dz_1;

public class Main {
    public static void main(String[] args) {
        
            Cat cat = new Cat("Шарик", 2);
            Owner owner = new Owner("Инокентий");
            
            // Cat many = new Cat(5);

            cat.setOwner(owner);
            cat.greet();
            cat.setMany(5);
                
            /**
             * Изменение имени кота
             */
            cat.setName("Васька");
            cat.greet();  // Публичный метод "приветствие" (greet)
        
        
        
        ICapital value;


        value = (m, n) -> {
            if (1 > 0) {
                System.out.println("Считаем количество капитала за двух котов");
            }
            return m + n;
        };



        System.out.println("Стоимость обоих котов: " + value.getValue(5.0, 5.0) + " тысяч рублей");

    }
}