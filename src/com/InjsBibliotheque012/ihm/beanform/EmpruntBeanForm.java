package com.InjsBibliotheque012.ihm.beanform;

import java.util.Date;


public class EmpruntBeanForm extends BeanFormItem{
	private AdherentBeanForm adherent;
	private LivreBeanForm livre;
	private Date dateEmprunt;
	private Date dateLimitePrevueRetour;
	private Date dateRetour;
	
	public AdherentBeanForm getAdherent() {
		return adherent;
	}
	public void setAdherent(AdherentBeanForm adherent) {
		this.adherent = adherent;
	}
	public LivreBeanForm getLivre() {
		return livre;
	}
	public void setLivre(LivreBeanForm livre) {
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
