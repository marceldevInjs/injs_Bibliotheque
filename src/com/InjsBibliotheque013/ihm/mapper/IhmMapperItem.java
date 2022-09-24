package com.InjsBibliotheque013.ihm.mapper;

import java.util.Collection;

import com.InjsBibliotheque012.ihm.beanform.BeanFormItem;
import com.InjsBibliotheque020.crossing.dto.DtoItem;

public abstract class IhmMapperItem {

	public abstract DtoItem mappDtoFromBeanForm(BeanFormItem form);

	public abstract BeanFormItem mappDtoFromBeanForm(DtoItem dto);

	public abstract Collection mappDtoListFromBeanFormList(Collection coll);

	public abstract Collection mappBeanFormListFromDtoFormList(Collection coll);
}
