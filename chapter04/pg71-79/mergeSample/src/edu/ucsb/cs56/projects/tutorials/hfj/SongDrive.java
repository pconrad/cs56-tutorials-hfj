package edu.ucsb.cs56.projects.tutorials.hfj;

/**
   Test Drive file that gives sample output to show that the Song class is implemented properly
   Edited by Eric Huang for project 01, Spring 2013
   
   @author Scott Bishop and Leif Dreizler
   @author Joseph Huang
   @version cs56, Choice Pts 0000209, Spring 2011
   @see Song
*/

public class SongDrive
{
    public static void main (String [] args) 
    {
		Song t2 = new Song();
		t2.setArtist("Travis");
		t2.setTitle("Sing");
		
		Song s3 = new Song();
		s3.setArtist("Sex Pistols");
		s3.setTitle("My Way");
		
		System.out.println("Song t2: "+t2.toString()+", Song s3: "+s3.toString());
		
		/*
		//two string method instead maybe??
		System.out.println("Song 1 Name: " + t2.getTitle());
		System.out.println("Artist: " + t2.getArtist());
		System.out.println();
		System.out.println("Song 2 Name: " + s3.getTitle());
		System.out.println("Artist: " + s3.getArtist());
		*/
		//t2.play();
    }
}
