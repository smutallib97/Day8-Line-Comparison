package com.bridgelabz;

import java.util.Scanner;

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
        //Line1
        Line line1 = new Line();
        line1.p1 = new Point();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Line1 P1 co-ordinates");
        line1.p1.x = sc.nextFloat();
        line1.p1.y = sc.nextFloat();

        line1.p2 = new Point();
        System.out.println("Enter Line1 P2 co-ordinates");
        line1.p2.x = sc.nextFloat();
        line1.p2.y = sc.nextFloat();

        line1.length = line1.calculateLength();
        System.out.println("Length of the Line1 is : " + line1.length);
        //Line 2
        Line line2 = new Line();
        line2.p1 = new Point();
        System.out.println("Enter Line2 P1 co-ordinates");
        line2.p1.x = sc.nextFloat();
        line2.p1.y = sc.nextFloat();

        line2.p2 = new Point();
        System.out.println("Enter Line2 P2 co-ordinates");
        line2.p2.x = sc.nextFloat();
        line2.p2.y = sc.nextFloat();

        line2.length = line2.calculateLength();
        System.out.println("Length of the Line2 is : " + line2.length);

        if(line1.length == line2.length){
            System.out.println("Both lines are Equal");
        } else if (line1.length >= line2.length) {
            System.out.println("Line 1 is greater than Line2");
        } else {
            System.out.println("Line2 is greater than Line1");
        }

    }
}