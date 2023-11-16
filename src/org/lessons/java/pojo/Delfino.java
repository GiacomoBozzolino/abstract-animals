package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.INuotante;

public class Delfino extends Animale implements INuotante {
	
	public static String CALL = "Eek-eek";
	public static String FOOD = "pesce";

	public Delfino(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getFood() {
		// TODO Auto-generated method stub
		System.out.println("Il delfino mangia:" + FOOD);
		
	}

	@Override
	public void getAnimalCall() {
		// TODO Auto-generated method stub
		System.out.println("Il delfino fa:" + CALL);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public void nuota() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " sto nuotando");
	}

}
