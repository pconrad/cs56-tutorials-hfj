package edu.ucsb.cs56.S11.hfj.ch04.huangx5j;
/**
 * Electric Guitar Class
 * @author Joseph Huang
 * @version hfj04 for CS56, S11
 */
public class ElectricGuitar{
 
    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;

    /**
     * Returns the brand
     * @return brand 
     */
    public String getBrand(){
	return brand;
    }

    /**
     * Sets the brand
     * @param aBrand 
     */
    public void setBrand(String aBrand){
	brand = aBrand;
    }

    /**
     * Returns the number of pickups
     * @return numOfPickups
     */
    public int getNumOfPickups(){
	return numOfPickups;
    }

    /**
     * Sets the number of pickups
     * @param num
     */
    public void setNumOfPickups(int num){
	numOfPickups = num;
    }

    /**
     * RockStarUsesIt
     * @return rockStarUsesIt 
     */
    public boolean getRockStarUsesIt(){
	return rockStarUsesIt;
    }

    /**
     * Sets rockstarusesit
     * @param yesOrNo
     */
    public void setRockStarUsesIt(boolean yesOrNo) {
	rockStarUsesIt = yesOrNo;
    }
}