package org.lessons.java;

import org.lessons.java.pojo.Aquila;
import org.lessons.java.pojo.Cane;
import org.lessons.java.pojo.Delfino;
import org.lessons.java.pojo.Passerotto;
import org.lessons.java.pojo.abs.Animale;
import org.lessons.java.pojo.inter.INuotante;
import org.lessons.java.pojo.inter.IVolante;

public class Main {
 public static void main(String[] args) {
	 Cane c= new Cane("Cane1");
	 Passerotto p=  new Passerotto("Passerotto1");
	 Aquila a= new Aquila ("Aquila1");
	 Delfino d= new Delfino ("Delfino1");
	 
	 
	 
	 
	 
	 	Animale [] animali = new Animale[4];
	 	animali[0]=c;
	 	animali[1]=p;
	 	animali[2]=a;
	 	animali[3]=d;
	 	
	 	
	 	
	 	
	 	for(int x =0; x<animali.length; x++) {
			Animale i = animali[x];
			
			System.out.println(i);
			i.getAnimalCall();
			i.getFood();
			i.sleep();
			System.out.println("\n-----------------------\n");
		}
	 	
	 	
	 	IVolante[] volanti = new IVolante[2];
	 	volanti[0]=a;
	 	volanti[1]=p;
	 	
	 	for (int x = 0; x < volanti.length; x++) {
			IVolante i = volanti[x];
			
			faiVolare(i);
	 	}
			
	 	
	 	INuotante[] nuotanti = new INuotante [2];
	 	nuotanti[0]=c;
	 	nuotanti[1]=d;
	 	
	 	for (int x = 0; x < nuotanti.length; x++) {
	 		INuotante i = nuotanti[x];
			
			faiNuotare(i);
	 	}
			
		}
	 	
	 	
 public static void faiVolare(IVolante i) {
		i.vola();
	}
 
 public static void faiNuotare(INuotante i) {
		i.nuota();
	}
	 	
}

