package edu.ucsb.cs56.projects.tutorials.hfj;

/**
   A Song which has a title and an artist with getters and setters
   Edited by Eric Huang for project 01, Spring 2013
   
   @author Scott Bishop and Leif Dreizler
   @author Joseph Huang
   @version cs56, Choice Pts 0000209, Spring 2011
*/

public class Song
{
    private String title;
    private String artist;
    
    /*
      void play() 
      {
		soundPlayer.playSound(title);
      }
    */
    
    /**
     * @return name of the artist
     */
    public String getArtist() 
    {
		return artist;
    }
    
    /**
     * @return title of the song
     */
    public String getTitle () 
    {
		return title;
    }
    
    /**
     * @param newArtist name of the new artist
     */
    public void setArtist(String newArtist)
    {
		artist = newArtist;
    }
    
    /**
     * @param newTitle new title of the song
     */
    public void setTitle(String newTitle)
    {
		title = newTitle;
    }  
    
	/**
     * Convert Song to String
     * @return a string format of this Song
     */
    public String toString()
    {
		return "(title: "+title+", artist: "+artist+")";
    }
}
