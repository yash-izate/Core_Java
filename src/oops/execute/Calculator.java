package oops.execute;

import oops.practice.Circle;
import oops.practice.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(9.75);
        Rectangle rect = new Rectangle(7.13f, 9.33f);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        float rectArea = rect.length * rect.breadth;

        System.out.printf("""
                
                Area of Circle = %10.2f
                Area of Rectangle = %7.2f
                """, cirArea, rectArea);
    }
}