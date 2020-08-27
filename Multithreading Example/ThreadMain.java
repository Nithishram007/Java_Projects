// Factorial.java

class Factorial extends Thread
{
long f=1;
public void run()
{
for(int i=1;i<=5;i++)
f=f*i;
System.out.println("Factorial : "+f);
try { sleep(400); }catch(Exception e){}
}
}

// SumOfSeries.java

class SumOfSeries extends Thread
{
int s=0;
public void run()
{
for(int i=1;i<=5;i++)
s=s+i;
System.out.println("Sum : "+s);
try { sleep(500); }catch(Exception e){}
}
}

// MultiplicationTable.java

class MultiplicationTable extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(i+" * "+5+" = "+5*i);
try { sleep(300); }catch(Exception e){}
}
}
}

class ThreadMain
{
public static void main(String arg[])throws InterruptedException
{
Factorial f = new Factorial();
SumOfSeries s = new SumOfSeries();
MultiplicationTable m = new MultiplicationTable();

f.setName("Prabha");
s.setName("Rekha");
m.setName("Maha");
f.setPriority(Thread.MAX_PRIORITY);
f.setPriority(Thread.MIN_PRIORITY);
f.setPriority(Thread.NORM_PRIORITY);
f.start();
System.out.println("Name : "+f.getName()+" / Priority : "+f.getPriority()+"/ Alive : "+f.isAlive());
s.start();
System.out.println("Name  : "+s.getName()+"/ Priority : "+s.getPriority()+"/ Alive : "+s.isAlive());
m.start();
System.out.println("Name  : "+m.getName()+"/ Priority : "+m.getPriority()+"/ Alive : "+m.isAlive());
m.join();
}
}
