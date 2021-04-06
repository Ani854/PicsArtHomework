package main;

import model.Box;

public class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.depth = 13.2;
        box1.height = 2;
        box1.width = 1.0;
        double vol1 = box1.vol(box1.depth, box1.height, box1.width);
        System.out.println(vol1);
    }
}
