package edu.ucsb.cs56.S11.hfj.ch04.huangx5j;
/**
 * Main for Electric Guitar
 * @author Joseph Huang
 * @version hgj04 for CS56, S11
 */
public class ElectricGuitarTest{

    /**
     * Main for two cases: true and false
     */
    public static void main(String[] args){

    // False unless other wise predetermined
	ElectricGuitar g = new ElectricGuitar();
	System.out.println("Brand: "+g.getBrand()+"\n"+"Pickups: "+
			   g.getNumOfPickups()+"\n"+"Rockstar: "+
			   g.getRockStarUsesIt());

    // True for the following values
	g.setBrand("Aria");
	g.setNumOfPickups(2);
	g.setRockStarUsesIt(true);
	System.out.println("\nBrand: "+g.getBrand()+"\n"+"Pickups: "+
			    g.getNumOfPickups()+"\n"+"Rockstar: "+
			    g.getRockStarUsesIt());
    }
}