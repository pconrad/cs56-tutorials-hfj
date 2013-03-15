package edu.ucsb.cs56.S11.hfj.ch04.huangx5j;
/**
 * Main for Song Class
 * @author Joseph Huang
 * @version hfj04 for CS56, S11
 */
public class SongTest{
    public static void main(String[] args){

	Song t2 = new Song();
	t2.setArtist("Travis");
	t2.setTitle("Sing");
	Song s3 = new Song();
	s3.setArtist("Sex Pistols");
	s3.setTitle("My Way");
	System.out.println("Song t2: "+t2.toString()+", Song s3: "+s3.toString());
    }
}