package model;

public class Box {
    public double width;
    public double height;
    public double depth;

    public double vol(double width, double height, double depth) {
        return width * height * depth;
    }
}
