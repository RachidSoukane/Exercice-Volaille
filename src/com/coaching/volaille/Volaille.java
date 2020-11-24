package com.coaching.volaille;

import com.coaching.volaille.volailleARendre.VolailleARendre;
import com.coaching.volaille.volailleAVendre.VolailleAVendre;

public abstract class Volaille implements Comparable<Volaille> {
    public static final int nombreAnimalMax=8;
    private static int nombreAnimal;
    private int id;
    private static int compteur;

    public Volaille(){
        this.id = ++compteur;
    }


    public int getId(){
        return this.id;
    }
    
    public static int getNombreAnimal() {
		return nombreAnimal;
	}

	public static void setNombreAnimal(int nombreAnimal) {
		Volaille.nombreAnimal = nombreAnimal;
	}   
    

    public abstract int getNombre();

    public abstract void setNombre(int a);
    
    public abstract String affiche();

    @Override
    public int compareTo(Volaille volaille) {
    	if(volaille instanceof VolailleARendre && this instanceof VolailleARendre) {
    		return ((VolailleARendre)this).getDateAccueil().compareTo(((VolailleARendre)volaille).getDateAccueil() );    		
    	}else if(volaille instanceof VolailleARendre) {
    		return -1;
    	}else {
    		return Integer.compare(((VolailleAVendre)this).getPoids(), ((VolailleAVendre)volaille).getPoids());
    	}  		
    	
    }

}

