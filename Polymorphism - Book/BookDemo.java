import java.util.*;
class BookDemo
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter Book Name : ");
String name = sc.nextLine();
System.out.println("Enter Book Id :");
int id = sc.nextInt();
System.out.println("Enter Book Author :");
sc.nextLine();
String author = sc.nextLine();
Book b = new Book(name,id,author);
do
{
System.out.println("Update  - 1");
System.out.println("Display - 2");
System.out.println("Exit    - 3");
n = sc.nextInt();
switch(n)
{
case 1 :
	System.out.println("Enter New_Name : ");
	sc.nextLine();
	String bkname = sc.nextLine();
	System.out.println("Enter New_Id :");
	int bkid = sc.nextInt();
	System.out.println("Enter New_Author :");
	sc.nextLine();
	String bkauthor = sc.nextLine();
	b.BKUpdateDetails(bkname,bkid,bkauthor);
	System.out.println("Updated Successfully!!");
	break;
case 2 : 
	b.BKDisplay();
	break;
case 3 :
	break;
default : 
	System.out.println("Invalid Choice");
} 
}while(n!=3);
}
}