package com.bridgelabz;
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
}


public class Line_Comparison {
    public static void main(String[] args) {
        //System.out.println("Welcome to Line Comparison Computation Program");
        Line line1 = new Line();
        line1.p1 = new Point();
        line1.p1.x = 10;
        line1.p1.y = 8;

        line1.p2 = new Point();
        line1.p2.x = 20;
        line1.p2.y = 4;

        float length = line1.calculateLength();
        System.out.println("Length of the Line is : " +length);
    }
}