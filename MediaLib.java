public class MediaLib
{
  private Book book;
  private static int numEntries;
 
  public void addBook(Book b)
  {
	book = b;
    numEntries++;
  }
   
  public String toString()  
  {
	String info = "";
 
	
	if (book != null){
        info += "Book: " + book + "\n";
    }
  	
 
	return info;
  }
  public static int getNumEntries(){
      //System.out.println("Test: Owner is " + owner);
      return numEntries;
  }
}