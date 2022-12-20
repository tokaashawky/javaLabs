package com.mycompany.cylinder_ex_circle;
public class cylinder extends circle {
   double height;
    public cylinder() {}

    public cylinder(double height)
    {
        this.height = height;
    }
    public cylinder(double height, double radis)
    {
        super(radis);
        this.height = height; 
    }
    public cylinder(double height, double radis,String color)
    {
        super(radis,color);
        this.height = height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public String toString()
    {
      return "cylinder[radius=" + radis + " color=" + color + " height="+height+"]";
    }
    public double getvolume()//pi*r*r*h
    {
      return Math.PI*super.getRadis()*super.getRadis()*getHeight();
    }
}
