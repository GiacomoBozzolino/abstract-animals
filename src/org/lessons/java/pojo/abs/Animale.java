package org.lessons.java.pojo.abs;

public abstract class  Animale {
	
	private String name;
	
	public Animale(String name) {
		// TODO Auto-generated constructor stub
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void sleep() { 
		System.out.println("Quando dorme fa: Zzz");
	}
	
	public abstract void getFood();
	
	public abstract void getAnimalCall();
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName();
	}
	
}
