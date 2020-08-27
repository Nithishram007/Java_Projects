class Point
{
double x;
double y;

Point()
{
x=0;
y=0;
}
Point(double x,double y)
{
this.x=x;
this.y=y;
}
Point(Point p)
{
x=p.x;
y=p.y;
}

double find_distance(double a,double b)
{
return Math.sqrt(Math.pow(x-a , 2) + Math.pow(y-b,2));
}

double find_distance(Point p)
{
return Math.sqrt(Math.pow(x-p.x , 2) + Math.pow(y-p.y,2));
}

void display()
{
System.out.println("("+x+","+y+")");
}
}


