class Book
{
String BKName;
int BKId;
String BKAuthor;

Book()
{
}
Book(String BKName,int BKId,String BKAuthor)
{
this.BKName = BKName;
this.BKId = BKId;
this.BKAuthor = BKAuthor;
}

void BKUpdateDetails(String name,int id,String author)
{
BKName = name;
BKId = id;
BKAuthor = author;
}

void BKDisplay()
{
System.out.println("Book Name   : "+BKName);
System.out.println("Book ID     : "+BKId);
System.out.println("Book Author : "+BKAuthor);
}

}