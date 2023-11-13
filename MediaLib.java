public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  private static int numEntries;
 
  public void addBook(Book b)
  {
    if (book == null){
	    book = b;
      numEntries++;
    }
    else{
      System.out.println("There is already a book in this library.");
    }
  }
  public void addMovie(Movie m){
    if (movie == null){
      movie = m;
      numEntries++;
    }
    else{
      System.out.println("There is already a movie in this library.");
    }
  }
  public void addSong(Song s){
    if (song == null){
      song = s;
      numEntries++;
    }
    else{
      System.out.println("There is already a song in this library.");
    }
  }
   
  public String toString()  
  {
	String info = "";
 
	
	if (book != null){
        info += "Book: " + book + "\n";
    }
  if (movie != null){
      info += "Movie: " + movie + "\n";
  }
  if (song != null){
    info += "Song: " + song + "\n";
  }
 
	return info;
  }
  public static int getNumEntries(){
      //System.out.println("Test: Owner is " + owner);
      return numEntries;
  }
}