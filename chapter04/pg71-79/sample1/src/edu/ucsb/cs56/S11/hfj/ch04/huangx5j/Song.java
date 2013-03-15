package edu.ucsb.cs56.S11.hfj.ch04.huangx5j;
/**
 * Playable Song with title and artist
 * @author Joseph Huang
 * @version hfj04 for CS56, S11
 */
public class Song{
    //instance variables
    private String title;
    private String artist;

    /**
     * Does not play sounds
     */
    void play() {
	//soundPlayer.playSound(title);
    }

    /**
     * Default Constructor with no args
     */
    public Song(){ }

    /**
     * Constructor for Song class
     * @param theTitle the title of the song
     * @param theArtist the artist of the song
     */
    public Song(String theTitle, String theArtist){
	title = theTitle;
	artist = theArtist;
    }

    /**
     * Set artist
     * @param theArtist sets the artist
     */
    public void setArtist(String theArtist){
	artist = theArtist;
    }

    /**
     * Set title
     * @param theTitle sets the title
     */
    public void setTitle(String theTitle){
	title=theTitle;
    }

    /**
     * Convert Song to String
     * @return a string format of this Song
     */
    public String toString(){
	return "(title: "+title+", artist: "+artist+")";
    }

}