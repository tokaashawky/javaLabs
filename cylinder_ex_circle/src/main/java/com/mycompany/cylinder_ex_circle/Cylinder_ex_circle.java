package com.mycompany.cylinder_ex_circle;
public class Cylinder_ex_circle {
    public static void main(String[] args) {
        circle c1=new circle(20,"blue");
        cylinder c2=new cylinder(5,20,"red");
        System.out.println(c1.toString()+"-->Area= "+c1.getArea());
        System.out.println(c2.toString()+"-->Volume= "+c2.getvolume());
    }
}
