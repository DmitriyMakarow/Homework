package homework6;

public class Triangle extends Figure {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double semiPerimetr = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimetr * (semiPerimetr - sideA) * (semiPerimetr - sideB) * (semiPerimetr - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}




