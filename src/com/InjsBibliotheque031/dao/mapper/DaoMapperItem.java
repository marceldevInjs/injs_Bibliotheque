package com.InjsBibliotheque031.dao.mapper;

import java.util.Collection;

import com.InjsBibliotheque012.ihm.beanform.BeanFormItem;
import com.InjsBibliotheque020.crossing.dto.DtoItem;
import com.InjsBibliotheque030.dao.DaoItem;



public abstract class DaoMapperItem {

public abstract DaoItem mappDaoFromDto(DtoItem dto);
	
	public abstract BeanFormItem mappDtoFromDao(DaoItem dao);
	
	public abstract Collection mappDaoListFromDtoList(Collection coll);
	
	public abstract Collection mappDtoListFromDaoList(Collection coll);

}
