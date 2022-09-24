package com.InjsBibliotheque012.ihm.beanform;

public abstract class BeanFormItem {
	protected String verb;

	/**
	 * 
	 * @param aVerb
	 */
	public void setVerb(String aVerb) {
		this.verb = aVerb;
	}

	/**
	 * 
	 * @return
	 */
	public String getVerb() {
		return this.verb;
	}
}
