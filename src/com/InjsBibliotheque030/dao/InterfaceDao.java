package com.InjsBibliotheque030.dao;

import java.util.Collection;
import java.util.Hashtable;



public interface InterfaceDao {
	/**
	 * 
	 * @return
	 */
	public boolean insert();
	public boolean insert(EntityDao entity);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public boolean update(int id);
	public boolean update(EntityDao entity);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public EntityDao searchById(int id);

	/**
	 * 
	 * @param name
	 * @return
	 */
	public Collection<EntityDao> searchByName(String name);

	/**
	 * 
	 * @param filter
	 * @return
	 */
	public Collection<EntityDao> find(Hashtable filter);
}
