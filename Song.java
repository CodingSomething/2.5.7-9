public class Song {
  private int rating;
  private String title;
  private String author;
 
  /*** Constructor ****/
  public Song(String t, String a)
  {
	title = t;
	author = a;
  }
 
   /*** Accessor methods ***/
  public String getTitle() {
	return title;
  }
 
  public String getAuthor() {
	return author;
  }
 
  public int getRating() {
	return rating;
  }
 
  public String toString()  
  {
	String info = "\"" + title + "\", sung by " + author;
	if (rating != 0){
        info += ", rating is " + rating;
    }
	 
	return info;
  }
 
  public boolean equals(Song s)
  {
	if(this.title.equals(s.title) && this.author.equals(s.author)){
        return true;
    }
	return false;
 
  }
 
  /*** Mutator methods ***/
  public void setAuthor(String a) {
	author = a;
  }
	 
  public void setTitle(String t) {
	title = t;
  }
 
  public void adjustRating(int r)
  {
	if ((rating + r >= 0) && (rating + r <= 10))
  	rating += r;
 
	r = 10;
 
  } 
}
