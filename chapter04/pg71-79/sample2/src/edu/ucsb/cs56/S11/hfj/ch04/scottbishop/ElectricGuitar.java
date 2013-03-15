package edu.ucsb.cs56.S11.hfj.ch04.scottbishop;

/**
   An ElectricGuitar where you can specify the brand, number of pickups, and whether a rock star uses that particular Electric Guitar
   
   @author Scott Bishop and Leif Dreizler
   @version cs56, Choice Pts 0000209, Spring 2011
*/


public class ElectricGuitar {
    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;
    
    /**
       get the brand
       @return brand
    */
    public String getBrand() {
	return brand;
    }
    
    /**
       set the brand
       @param r the new brand
    */
    public void setBrand(String newBrand){
	brand = newBrand;
    }
    
    /**
       get the NumOfPickups
       @return NumOfPickups
    */
    public int getNumOfPickups() {
	return numOfPickups;
    }
    
    /**
       set the NumOfPickups
       @param r the new NumOfPickups
    */
    public void setNumOfPickups(int newNumOfPickups){
	numOfPickups = newNumOfPickups;
    }
    
    /**
       get the value of rockStarUsesIt
       @return rockStarUsesIt
    */
    public boolean getRockStarUsesIt(){
	return rockStarUsesIt;
    }
    
    /**
       set the value of rockStarUsesIt
       @param r the new value of rockStarUses it
    */
    public void setRockStarUsesIt(boolean shred) {
	rockStarUsesIt = shred;
    }
}