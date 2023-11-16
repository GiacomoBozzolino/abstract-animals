package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.INuotante;

public class Cane extends Animale implements INuotante{
	
	public static String CALL = "Bau";
	public static String FOOD = "crocchette";

	public Cane(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getFood() {
		// TODO Auto-generated method stub
		System.out.println("L'aquila mangia:" + FOOD);
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
	
	public void nuota() {
		System.out.println("sto nuotando!");
	}

	@Override
	public void faiNuotare() {
		// TODO Auto-generated method stub
		nuota();
	}

}
