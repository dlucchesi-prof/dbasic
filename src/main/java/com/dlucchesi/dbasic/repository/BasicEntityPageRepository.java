package com.dlucchesi.dbasic.repository;

import com.dlucchesi.dbasic.model.imp.BasicEntityImp;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasicEntityPageRepository extends PagingAndSortingRepository<BasicEntityImp,Long> {

    List<BasicEntityImp> getActiveStatus(Boolean active);

    List<BasicEntityImp> getByDeleteStatus(Boolean deleted);
}
