package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        cube cube1 = new cube();
        cube1.makeCube();
        cube1.makePoint();
        cube1.PointCheck();
    }
}