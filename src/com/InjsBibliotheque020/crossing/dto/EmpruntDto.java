package com.InjsBibliotheque020.crossing.dto;

import java.util.Date;



public class EmpruntDto extends DtoItem {
	private AdherentDto adherent;
	private LivreDto livre;
	private Date dateEmprunt;
	private Date dateLimitePrevueRetour;
	private Date dateRetour;
	
	public AdherentDto getAdherent() {
		return adherent;
	}
	public void setAdherent(AdherentDto adherent) {
		this.adherent = adherent;
	}
	public LivreDto getLivre() {
		return livre;
	}
	public void setLivre(LivreDto livre) {
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
