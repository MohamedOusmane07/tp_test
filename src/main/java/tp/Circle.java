package tp;

import static java.lang.Math.floor;

public class Circle {


    private static final double PI = 3.14;

    public double area(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Le rayon ne peut pas être negatif");
        }else
        return (double) Math.floor(PI * radius * radius * 100) / 100.0;
        //return (double) Math.round(PI * radius * radius * 100) / 100;
    }

}
