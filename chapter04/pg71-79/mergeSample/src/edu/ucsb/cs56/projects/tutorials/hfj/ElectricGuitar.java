package edu.ucsb.cs56.projects.tutorials.hfj;

/**
   An ElectricGuitar where you can specify the brand, number of pickups, and whether a rock star uses that particular Electric Guitar
   Edited by Eric Huang for project 01, Spring 2013
   
   @author Scott Bishop and Leif Dreizler
   @author Joseph Huang
   @version cs56, Choice Pts 0000209, Spring 2011
*/


public class ElectricGuitar 
{
    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;
    
    /**
       get the brand
       @return brand
    */
    public String getBrand() 
    {
		return brand;
    }
    
    /**
       set the brand
       @param newBrand the new brand
    */
    public void setBrand(String newBrand)
    {
		brand = newBrand;
    }
    
    /**
       get the numOfPickups
       @return numOfPickups
    */
    public int getNumOfPickups() 
    {
		return numOfPickups;
    }
    
    /**
       set the numOfPickups
       @param newNumOfPickups the new numOfPickups
    */
    public void setNumOfPickups(int newNumOfPickups)
    {
		numOfPickups = newNumOfPickups;
    }
    
    /**
       get the value of rockStarUsesIt
       @return rockStarUsesIt
    */
    public boolean getRockStarUsesIt()
    {
		return rockStarUsesIt;
    }
    
    /**
       set the value of rockStarUsesIt
       @param ifUsed the new value of rockStarUses it
    */
    public void setRockStarUsesIt(boolean ifUsed) 
    {
		rockStarUsesIt = ifUsed;
    }
}
