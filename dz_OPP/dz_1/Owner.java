package dz_OPP.dz_1;

/*
 * Класс "Владелец" (Owner)
 */
public class Owner {

    private String name;

    /**
     * Конструктор класса Owner.
     *
     * @param name имя владельца
     */
    public Owner(String name) {
        this.name = name;
    }

    /**
     * Получает имя владельца.
     *
     * @return имя владельца
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя владельца.
     *
     * @param name имя владельца
     */
    public void setName(String name) {
        this.name = name;
    }
}
