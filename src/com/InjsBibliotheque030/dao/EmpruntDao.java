package com.InjsBibliotheque030.dao;

import java.util.Date;

public class EmpruntDao extends EntityDao{

	public EmpruntDao() {
		// TODO Auto-generated constructor stub
	}
	
	private AdherentDao adherent;
	private LivreDao livre;
	private Date dateEmprunt;
	private Date dateLimitePrevueRetour;
	private Date dateRetour;
	
	public AdherentDao getAdherent() {
		return adherent;
	}
	public void setAdherent(AdherentDao adherent) {
		this.adherent = adherent;
	}
	public LivreDao getLivre() {
		return livre;
	}
	public void setLivre(LivreDao livre) {
		this.livre = livre;
	}
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	public Date getDateLimitePrevueRetour() {
		return dateLimitePrevueRetour;
	}
	public void setDateLimitePrevueRetour(Date dateLimitePrevueRetour) {
		this.dateLimitePrevueRetour = dateLimitePrevueRetour;
	}
	public Date getDateRetour() {
		return dateRetour;
	}
	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}
	
	

}
