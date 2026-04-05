package homework6;

abstract class Figure {

    public abstract double calculateArea(); // абстрактный метод для вычисления площади фигур
    public abstract double calculatePerimeter(); // абстрактный метод для вычисления периметра фигур

    public static void main(String[] args) {

        // создание массива из 5 фигур
        Figure[] figures = new Figure[5];

        figures[0] = new Circle(5);
        figures[1] = new Rectangle(4, 7);
        figures[2] = new Triangle(2, 3, 5);
        figures[3] = new Circle(3);
        figures[4] = new Rectangle(5, 8);

        // подсчет суммы периметров всех фигур в массиве
        double totalPerimetr = 0;
        System.out.println("Периметры всех фигур: ");
        for (Figure figure : figures) {
            double perimeter = figure.calculatePerimeter();
            System.out.printf(" %.2f%n", perimeter);
            totalPerimetr += perimeter;
        }
        System.out.println("\nСумма периметров всех фигур в массиве: ");
        System.out.printf("%.2f%n", totalPerimetr);
    }
}
