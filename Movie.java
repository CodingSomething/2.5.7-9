public class Movie {
  private int rating;
  private String title;
  private String author;
  private double duration;
 
  /*** Constructor ****/
  public Movie(String t, String a, double d)
  {
	title = t;
	author = a;
    duration = d;
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
  public double getDuration(){
    return duration;
  }
 
  public String toString()  
  {
	String info = "\"" + title + "\", written by " + author;
	if (rating != 0){
        info += ", rating is " + rating;
    }
	 
	return info;
  }
 
  public boolean equals(Movie m)
  {
	if(this.title.equals(m.title) && this.author.equals(m.author)){
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
  public void setDuration(double d){
    duration =d;
  }
 
  public void adjustRating(int r)
  {
	if ((rating + r >= 0) && (rating + r <= 10))
  	rating += r;
 
	r = 10;
 
  }

}
