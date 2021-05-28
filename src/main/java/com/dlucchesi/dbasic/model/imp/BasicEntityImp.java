package com.dlucchesi.dbasic.model.imp;

import com.dlucchesi.dbasic.model.BasicEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public class BasicEntityImp implements BasicEntity {

    @Id
    @Column(nullable = false, unique = true, name = "id")
    private Long    id;
    private Boolean deleted;
    private Boolean active;
    @Column(nullable = false, unique = true, name = "sid")
    private String  sId;
}
