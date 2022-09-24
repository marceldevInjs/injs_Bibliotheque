package com.InjsBibliotheque031.dao.mapper;

import java.util.Collection;

import com.InjsBibliotheque012.ihm.beanform.BeanFormItem;
import com.InjsBibliotheque020.crossing.dto.DtoItem;
import com.InjsBibliotheque030.dao.DaoItem;
import com.InjsBibliotheque030.dao.LivreDao;


public class LivreDaoMapper extends DaoMapperItem {

	@Override
	public DaoItem mappDaoFromDto(DtoItem dto) {
		LivreDao dao = new LivreDao();
//		LivreDto dto = (LivreDto)dtoItem;
//		dao.set
		
		return dao;
	}
	
//	AuthentDao dao=new AuthentDao();
//	AuthentDto dto=(AuthentDto)dtoItem;
//	dao.setLogin(dto.getLogin());
//	dao.setMotDePasse(dto.getMotDePasse());
//	return dao;

	@Override
	public BeanFormItem mappDtoFromDao(DaoItem dao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection mappDaoListFromDtoList(Collection coll) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection mappDtoListFromDaoList(Collection coll) {
		// TODO Auto-generated method stub
		return null;
	}

}
