package com.bridgelabz;

import java.util.Objects;

class Point{
    float x;
    float y;
}
class Line{
    Point p1;
    Point p2;
    float length;
    float calculateLength(){
        return (float) Math.sqrt((Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2)));
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;
        Line line = (Line) o;
        return Float.compare(line.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }
}


public class Line_Comparison {
    public static void main(String[] args) {
        //System.out.println("Welcome to Line Comparison Computation Program");
        //Line1
        Line line1 = new Line();
        line1.p1 = new Point();
        line1.p1.x = 10;
        line1.p1.y = 8;

        line1.p2 = new Point();
        line1.p2.x = 20;
        line1.p2.y = 4;

        //Line 2
        Line line2 = new Line();
        line2.p1 = new Point();
        line2.p1.x = 10;
        line2.p1.y = 8;

        line2.p2 = new Point();
        line2.p2.x = 20;
        line2.p2.y = 4;

        line1.length = line1.calculateLength();
        System.out.println("Length of the Line1 is : " + line1.length);

        line2.length = line2.calculateLength();
        System.out.println("Length of the Line2 is : " + line2.length);

        System.out.println(line1.equals(line2));
    }
}