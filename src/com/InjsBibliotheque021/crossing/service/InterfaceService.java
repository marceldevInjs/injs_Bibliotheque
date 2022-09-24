package com.InjsBibliotheque021.crossing.service;

import java.util.Collection;
import java.util.Hashtable;

import com.InjsBibliotheque020.crossing.dto.DtoItem;



public interface InterfaceService {
	public boolean connect(DtoItem dtoItem);
	/**
	 * 
	 * @param itemId
	 * @return
	 */
	public DtoItem createItem(int itemId);
	/**
	 * 
	 * @param item
	 * @return
	 */
	public boolean update(DtoItem dtoItem);
	/**
	 * 
	 * @param filter
	 * @return
	 */
	public Collection find(Hashtable filter);	
	/**
	 * 
	 * @param itemId
	 * @return
	 */
	public DtoItem get(int itemId);
	/**
	 * 
	 * @param itemId
	 * @return
	 */
	public DtoItem remove(int itemId);
}
