class PointMain
{
public static void main(String arg[])
{
Point p1,p2,p3;
p1 = new Point(3.25,7.89);
p2 = new Point(5.37,18.12);
p3 = new Point(p2);
p1.display();
p2.display();
p3.display();
System.out.println(p1.find_distance(7.9,16.25));
System.out.println(p1.find_distance(p3));
}
}
