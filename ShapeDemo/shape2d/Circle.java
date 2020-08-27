package shape2d;

public class Circle implements twod
{
double radius;
public Circle()
{
}
public Circle(double radius)
{
this.radius=radius;
}

public double area()
{
return(Math.PI *radius*radius);
}
public double perimeter()
{
return(2*Math.PI*radius);
}
}


