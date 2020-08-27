package shape3d;
import shape2d.*;
public class Cuboid extends Rectangle implements threed
{

double height;

public Cuboid(double length,double breadth,double height)
{
super(length,breadth);
this.height=height;
}

public double volume()
{
return(super.area() * height);
}
public double surfaceArea()
{
return(super.perimeter() + 2*height) ;
}
}


