package com.tlb.agendadortarefas.business.mapper;

import com.tlb.agendadortarefas.business.dto.TarefasDTO;
import com.tlb.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
