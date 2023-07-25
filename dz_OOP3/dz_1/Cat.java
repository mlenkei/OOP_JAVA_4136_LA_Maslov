package dz_OOP3.dz_1;

/**
 * Класс Cat.
 * 
 */
public class Cat {
    private String name; // Приватное поле "имя"
    private int age; // Приватное поле "возраст"
    private Owner owner; // Приватное поле "Хозяин"
    private int many;

    /**
     * Конструктор класса Cat.
     *
     * @param name имя Cat
     * @param age  возраст Cat
     * @param many стоимость Cat
     */
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cat(int many) {
        this.many = many;
    }
    /**
     * Получает имя кота.
     *
     * @return имя кота
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя кота.
     *
     * @param name имя кота
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает возраст кота.
     *
     * @return возраст кота
     */
    public int getAge() {
        return age;
    }

    /**
     * Устанавливает возраст кота.
     *
     * @param age возраст кота
     */
    public void setAge(int age) {
        this.age = age;
    }
        /**
     * Получает стоимость кота.
     *
     * @return стоимость кота
     */
    public int getMany() {
        return many;
    }
        /**
     * Устанавливает стоимость кота.
     *
     * @param many востоимость кота
     */
    public void setMany(int many) {
        this.many = many;
    }

    /**
     * Получает владельца кота.
     *
     * @return владелец кота
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Устанавливает владельца кота.
     *
     * @param owner владелец кота
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Выводит приветствие на консоль.
     * Если у кота есть владелец, приветствие будет включать имя владельца.
     */
    public void greet() {
        if (owner != null) {
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец - " + owner.getName() + ". Стоимость кота: " + 5 + " тысяч рублей");
        } else {
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет).");
        }
    }
}
