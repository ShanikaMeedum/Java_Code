package com.mycompany.circleobj;
public class Circle implements Shape,Perimeter
{
    private double radius;
    
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double ClacArea()
    {
        return(Math.PI*radius*radius);
    }
    public double ClacPerimeter()
    {
        return (2*Math.PI*radius);
    }
}
