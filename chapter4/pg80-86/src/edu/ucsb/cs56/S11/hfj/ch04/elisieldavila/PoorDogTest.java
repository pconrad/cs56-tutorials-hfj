package edu.ucsb.cs56.S11.hfj.ch04.elisieldavila;
//page 84_2

/**
 * Main for PoorDog class to show that you don't 
   have to initialize instance variables because 
   they alwyas have a default value as 0, NULL, false, etc.
 * @author Elisiel Davila
 * @version hfj04 for CS56, S11
 */

public class PoorDogTest{
    public static void main(String[] args){
	PoorDog one = new PoorDog();
	System.out.println("Dog size is " + one.getSize());
	System.out.println("Dog name is " + one.getName());
    }
}
