package dz_OOP5.task_1;

/**
 * Класс, представляющий основной запуск программы и связывание Model, View и Presenter.
 */

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр представления для ввода и вывода
        CalculiInputView inputView = new ConsoleCalculiView();
        CalculiOutputView outputView = new ConsoleCalculiView();

        // Создаем экземпляр модели данных
        CalculiModel model = new CalculatorModel();

        // Создаем презентер, передавая ему экземпляры представления и модели данных
        CalculiRepresent presenter = new CalculiRepresentImpl(inputView, outputView, model);

        // Запускаем выполнение расчета
        presenter.calculate();
    }
}