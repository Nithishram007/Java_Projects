package shape2d;

public class Square implements twod
{
double side;
public Square()
{
}
public Square(double side)
{
this.side=side;
}

public double area()
{
return(side*side);
}
public double perimeter()
{
return(4*side);
}
}


