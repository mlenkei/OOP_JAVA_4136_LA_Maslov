// Задача 1 : Напишите обобщенный метод printElement, который принимает один
// параметр типа T и выводит его на консоль.
// В этом примере мы объявляем обобщенный метод printElement, который принимает
// один параметр типа T. Мы просто выводим этот элемент на консоль с помощью 
// метода System.out.println().


public class Metod_pEl_T {

    static <T> void printElement(T element) {
        System.out.println("Параметр element: " + element);
        System.out.println("Тип element: " + element.getClass().getSimpleName());
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 11;
        printElement(n);

        double m = 58.95;
        printElement(m);

        String str = "Матроскин хороший))";
        printElement(str);

    }
}