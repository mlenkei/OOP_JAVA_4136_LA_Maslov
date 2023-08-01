package dz_OOP5.task_1;

/**
 * Интерфейс, представляющий View (представление) в архитектуре MVP.
 */
public interface CalculiView {
    /**
     * Отображает результат вычисления на экране.
     *
     * @param result результат вычисления
     */
    void showResult(double result);

    /**
     * Получает первое число от пользователя.
     *
     * @return первое число
     */
    double getFirstNumber();

    /**
     * Получает второе число от пользователя.
     *
     * @return второе число
     */
    double getSecondNumber();

    /**
     * Получает выбранную операцию от пользователя.
     *
     * @return выбранная операция (+, -, *, /)
     */
    char getOperation();
}
