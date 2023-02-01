package ms.trashbox.srp.mapper;

import java.util.List;

/*@Param <D> - DTO TYPE PARAMETER.
@Param <E> - ENTITY TYPE PARAMETER.*/

public interface EntityMapper <D, E> {
	
	E toEntity(D dto);
	D toDto(E entity);
	List<E> toEntity(List<D> dtoList);
	List<D> toDto(List<E> entityList);

}
