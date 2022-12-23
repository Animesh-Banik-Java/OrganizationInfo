package com.organization.info.mapper;

import java.util.List;

public interface EntityMapper<E,D> {
	
	E toEntity(D toDTO);
	
	D toDTO(E entity);
	
	List<D> toDTOList(List<E> entityList);
	
	List<E> toEntityList(List<D> dtoList);

}
