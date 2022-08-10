package main.java.com.practice.javaPracticeExample.abstrac;

public abstract class Shape {
    public String objectName = " ";

    public Shape(String objectName) {
        this.objectName = objectName;
    }

    abstract public double area();

    abstract public void draw();
}

class Rectengle extends Shape {
    int length, width;

    public Rectengle(int length, int width, String objectName) {
        super(objectName);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return (double) (length * length);
    }

    @Override
    public void draw() {
        System.out.println("rectengle is drown");
    }}

    class Circle extends Shape {
        double pi = 3.14;
        int radius;

        Circle(int radius, String objectName) {
            super(objectName);
            this.radius = radius;
        }

        @Override
        public double area() {
            return (double) ((pi * radius * radius) / 2);
        }

        @Override
        public void draw() {
            System.out.println("circle is drawn : ");
        }
    }


