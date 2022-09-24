package com.InjsBibliotheque012.ihm.beanform;

public class LivreBeanForm extends BeanFormItem{
	private String isbn;
	private String titre;
	private String editeur;
	private String formatLivre;
	private String anneeEdition;
	private String section;
	private String codeBarre;
	private String auteur;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public String getFormatLivre() {
		return formatLivre;
	}
	public void setFormatLivre(String formatLivre) {
		this.formatLivre = formatLivre;
	}
	public String getAnneeEdition() {
		return anneeEdition;
	}
	public void setAnneeEdition(String anneeEdition) {
		this.anneeEdition = anneeEdition;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getCodeBarre() {
		return codeBarre;
	}
	public void setCodeBarre(String codeBarre) {
		this.codeBarre = codeBarre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
}
