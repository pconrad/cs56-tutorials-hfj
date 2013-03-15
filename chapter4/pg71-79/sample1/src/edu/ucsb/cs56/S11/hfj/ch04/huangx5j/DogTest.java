package edu.ucsb.cs56.S11.hfj.ch04.huangx5j;

/**
 * Main for Dog Class
 * @author Joseph Huang
 * @version hfj04 for CS56, S11
 */

public class DogTest {

    /**
     * Main
     */
    public static void main (String[] args) {
	Dog one = new Dog();
	one.setSize(100);
	Dog two = new Dog();
	two.setSize(5);
	Dog three = new Dog();
	three.setSize(25);

	Dog d = new Dog();
	
	one.bark();
	two.bark();
	three.bark();

	d.bark(3);
    }
}