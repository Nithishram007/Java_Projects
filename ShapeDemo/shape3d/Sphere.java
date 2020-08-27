package shape3d;
import shape2d.*;
public class Sphere extends Circle implements threed
{
double radius;
public Sphere(double radius)
{
super(radius);
this.radius=radius;
}

public double volume()
{
return(4 * super.area() * radius /3);
}
public double surfaceArea()
{
return(4 * super.area()) ;
}
}


