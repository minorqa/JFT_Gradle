package com.example.distance;

import com.example.distance.models.Point;
//import org.springframework.boot.SpringApplication;

public class DistanceApplication {

    public static void main(String[] args) {
        //SpringApplication.run(DistanceApplication.class, args);
        Point p1= new Point();
        Point p2 = new Point();
        double dist;

        setCoordinates(p1,0,100);
        setCoordinates(p2,10,20);
        dist = distance(p1,p2);
        displayDistanceMessage(p1,p2,dist);
        System.out.println("\nDistance calculated in 'Point' class: "+Point.distanceBetweenPoints(p1,p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x,2)+Math.pow(p1.y- p2.y,2));
    }

    public static void setCoordinates(Point p, double x, double y){
        p.x = x;
        p.y = y;
    }

    private static void displayDistanceMessage(Point p1, Point p2, double dist) {
        String message = "\nDistance between points (calculated via dedicated method in Distance Application)\n   p1(" + p1.x + "; "+ p1.y + ")  \n   p2(" +p2.x + "; " +p2.y +")  \nis: " +dist;
        System.out.println(message);
    }
}