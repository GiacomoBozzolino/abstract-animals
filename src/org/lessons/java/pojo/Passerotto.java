package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.IVolante;

public class Passerotto extends Animale implements IVolante{
	
	public static String CALL = "Cip-Cip";
	public static String FOOD = "insetti";

	public Passerotto(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getFood() {
		// TODO Auto-generated method stub
		System.out.println("Il passerotto mangia:" + FOOD);
	}

	@Override
	public void getAnimalCall() {
		// TODO Auto-generated method stub
		System.out.println("Il passerotto fa:" + CALL);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void vola() {
		System.out.println("sto volando!");
	}

	@Override
	public void faiVolare() {
		// TODO Auto-generated method stub
		vola();
	}

}
