package shape3d;
import shape2d.*;


public class Cube extends Square implements threed
{
double side;
public Cube(double side)
{
super(side);
this.side=side;
}

public double volume()
{
return(super.area() * side);
}
public double surfaceArea()
{
return(super.perimeter() * 2*side);
}

}


