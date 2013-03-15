package edu.ucsb.cs56.S11.hfj.ch04.scottbishop;

/**
   A Song which has a title and an artist with getters and setters
   
   @author Scott Bishop and Leif Dreizler
   @version cs56, Choice Pts 0000209, Spring 2011
*/

public class Song{
    private String title;
    private String artist;
    
    /*
      void play() {
      soundPlayer.playSound(title);
      
      }
    */
    public String getArtist() {
	return artist;
    }
    
    public String getTitle () {
	return title;
    }
    
    public void setArtist(String newArtist){
	artist = newArtist;
    }
    
    public void setTitle(String newTitle){
	title = newTitle;
    }   
}