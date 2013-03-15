package edu.ucsb.cs56.S11.hfj.ch04.scottbishop;

/**
   Test Drive file that gives sample output to show that the Song class is implemented properly
   
   @author Scott Bishop and Leif Dreizler
   @version cs56, Choice Pts 0000209, Spring 2011
   @see Song
*/

public class SongTestDrive{
    public static void main (String [] args) {
	Song t2 = new Song();
	t2.setArtist("Travis");
	t2.setTitle("Sing");
	Song s3 = new Song();
	s3.setArtist("Sex Pistols");
	s3.setTitle("My Way");
	
		
	//two string method instead maybe??
	System.out.println("Song 1 Name: " + t2.getTitle());
	System.out.println("Artist: " + t2.getArtist());
	System.out.println();
	System.out.println("Song 2 Name: " + s3.getTitle());
	System.out.println("Artist: " + s3.getArtist());
	
	//t2.play();
    }
}