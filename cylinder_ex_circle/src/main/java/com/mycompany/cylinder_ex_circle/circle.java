package com.mycompany.cylinder_ex_circle;
public class circle {
    double radis;
    String color;
    public circle() {}
    public circle(double radis)
    {
        this.radis = radis;
    }
    public circle(double radis, String color)
    {
        this.radis = radis;
        this.color = color;
    }
    public void setRadis(double radis) {
        this.radis = radis;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getRadis() {
        return radis;
    }

    public String getColor() {
        return color;
    }
    public String toString()
    {
      return "Circle[radius=" + getRadis() + " color=" + getColor() + "]";
    }
    public double getArea()//pi*r*r
    {
      return Math.PI*getRadis()*getRadis();
    }
}

