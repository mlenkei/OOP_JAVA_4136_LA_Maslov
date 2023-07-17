// Задача 2:
// Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства
// ширина (width) и высота (height). Класс должен обладать следующими методами:

// Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
// Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
// Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
// Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
// Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
package DZ.dz_2;

public class Rectangle {
    private double  width, height;

    // 1. конструктор без параметров

    public Rectangle() {
        this.width = 0;
        this.height =0;
    }
    // 2. Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
// 3. Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
    public double getHeight() {
      return height;
    }
    public void setHeight(double height) {
      this.height = height;
    }
// 4. Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
    public double calculateArea() {
      return width * height;
    }
// 5. Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
    public double calculatePerimeter() {
      return 2 * (width + height);
}
    public void setWidth(int i) {
    }
    public String getWidth() {
        return null;
    }
}
