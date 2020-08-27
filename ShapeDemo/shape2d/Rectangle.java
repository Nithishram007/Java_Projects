package shape2d;


public class Rectangle implements twod
{
double length;
double breadth;
public Rectangle()
{
}
public Rectangle(double length,double breadth)
{
this.length=length;
this.breadth=breadth;
}

public double area()
{
return(length*breadth);
}
public double perimeter()
{
return(2*(length+breadth));
}
}


