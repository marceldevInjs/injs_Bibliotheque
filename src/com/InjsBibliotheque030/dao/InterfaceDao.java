package com.InjsBibliotheque030.dao;

import java.util.Collection;
import java.util.Hashtable;



public interface InterfaceDao {
	/**
	 * 
	 * @return
	 */
	public boolean insert();
	public boolean insert(DaoItem entity);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public boolean update(int id);
	public boolean update(DaoItem entity);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public DaoItem searchById(int id);

	/**
	 * 
	 * @param name
	 * @return
	 */
	public Collection<DaoItem> searchByName(String name);

	/**
	 * 
	 * @param filter
	 * @return
	 */
	public Collection<DaoItem> find(Hashtable filter);
}
