package com.coaching.volaille.volailleARendre;

import java.util.Date;

import com.coaching.volaille.Volaille;

public abstract class VolailleARendre extends Volaille {
	protected final Date dateAccueil;

	public VolailleARendre(int poids) {
		super(poids);
		this.dateAccueil = new Date();
	}

	public Date getDateAccueil() {
		return dateAccueil;
	}

}
