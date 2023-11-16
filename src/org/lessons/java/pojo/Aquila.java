package org.lessons.java.pojo;

import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.IVolante;

public class Aquila extends Animale implements IVolante{
	
	public static String CALL = "Screeech";
	public static String FOOD = "Carne";

	public Aquila(String name) {
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
		System.out.println("L'aquila fa:" + CALL);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" sto volando");
	}
	

}
