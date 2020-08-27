import shape2d.*;
import shape3d.*;
import java.util.*;
class Test
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter side");
double side=sc.nextDouble();
Square s=new Square(side);

System.out.println("Enter Length & Breadth");
double length=sc.nextDouble();
double breadth=sc.nextDouble();
Rectangle r=new Rectangle(length,breadth);

System.out.println("Enter radius");
double radius=sc.nextDouble();
Circle c=new Circle(radius);

Cube cu=new Cube(side);

System.out.println("Enter height");
double height=sc.nextDouble();
Cuboid cub=new Cuboid(length,breadth,height);

Sphere sp=new Sphere(radius);

System.out.println("Square");
System.out.println(s.area());
System.out.println(s.perimeter());
System.out.println("Rectangle");
System.out.println(r.area());
System.out.println(r.perimeter());
System.out.println("Circle");
System.out.println(c.area());
System.out.println(c.perimeter());
System.out.println("Cube");
System.out.println(cu.volume());
System.out.println(cu.surfaceArea());
System.out.println("Cuboid");
System.out.println(cub.volume());
System.out.println(cub.surfaceArea());
System.out.println("Sphere");
System.out.println(sp.volume());
System.out.println(sp.surfaceArea());
}
}

