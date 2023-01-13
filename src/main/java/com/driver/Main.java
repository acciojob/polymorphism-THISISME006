package com.driver;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Product p = new Product();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        p.product(x,y);
        p.product(x,y,z);
        p.product(x1,y1);
    }
}
class Product{
    public int product(int x, int y) {

        return x;
    }
    public int product(int x, int y, int z) {

        return x;
    }
    public double product(double x, double y) {

        return x;
    }
}