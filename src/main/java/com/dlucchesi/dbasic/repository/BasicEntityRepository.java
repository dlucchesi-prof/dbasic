package com.dlucchesi.dbasic.repository;

import com.dlucchesi.dbasic.model.imp.BasicEntityImp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasicEntityRepository extends JpaRepository<Long, BasicEntityImp> {

    public List<BasicEntityImp> getActiveStatus(Boolean active);

    public List<BasicEntityImp> getByDeleteStatus(Boolean deleted);
}
