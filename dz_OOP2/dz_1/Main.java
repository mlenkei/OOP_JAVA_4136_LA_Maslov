package dz_OOP2.dz_2;

public class Main {

        public static void main(String[] args) {
            Rectangle rectangle_1 = new Rectangle();
            rectangle_1.setWidth(5);
            rectangle_1.setHeight(8);
            double area_1 = rectangle_1.calculateArea();
            double perimeter_1 = rectangle_1.calculatePerimeter();
            System.out.println("Прямоугольник 1:");
            System.out.println("Ширина: " + rectangle_1.getWidth());
            System.out.println("Высота: " + rectangle_1.getHeight());
            System.out.println("Площадь: " + area_1);
            System.out.println("Периметр: " + perimeter_1);
    
            System.out.println();
    
            Rectangle rectangle_2 = new Rectangle(9, 3);
            double area_2 = rectangle_2.calculateArea();
            double perimeter_2 = rectangle_2.calculatePerimeter();
            System.out.println("Прямоугольник 2:");
            System.out.println("Ширина: " + rectangle_2.getWidth());
            System.out.println("Высота: " + rectangle_2.getHeight());
            System.out.println("Площадь: " + area_2);
            System.out.println("Периметр: " + perimeter_2);
        }
}
