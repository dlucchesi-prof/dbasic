package com.dlucchesi.dbasic.service.imp;

import com.dlucchesi.dbasic.app.DBasicProperties;
import com.dlucchesi.dbasic.model.imp.BasicEntityImp;
import com.dlucchesi.dbasic.repository.BasicEntityPageRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("basicentityservice")
public abstract class BasicEntityServiceImp<R extends BasicEntityPageRepository, T extends BasicEntityImp> {

    private R    entityRepository;

    public Optional<T> getEntity(Long id){
        return getEntity(DBasicProperties.getLoadDeleted(),id);
    }

    public Optional<T> getEntity(Boolean includeDeleted, Long id){
        return (Optional<T>) entityRepository.findById(id).filter(e -> includeDeleted.equals(e.getDeleted()));
    }

    public abstract T buildNew();

}
