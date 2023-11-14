public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  private static String owner = "joe";
  private static int numEntries;
  private static int numBooks;
  private static int numMovies;
  private static int numSongs;
  private String date;
 
  public void addBook(Book b)
  {
    if (book == null){
	    book = b;
      numEntries++;
      numBooks++;
      date = Time.retTime();
    }
    else{
      System.out.println("There is already a book in this library.");
    }
  }
  public void addMovie(Movie m){
    if (movie == null){
      movie = m;
      numEntries++;
      numMovies++;
      date = Time.retTime();
    }
    else{
      System.out.println("There is already a movie in this library.");
    }
  }
  public void addSong(Song s){
    if (song == null){
      song = s;
      numEntries++;
      numSongs++;
      date = Time.retTime();
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
  public static String getOwner(){
    return owner;
  }
}