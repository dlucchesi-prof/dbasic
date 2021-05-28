package com.dlucchesi.dbasic.model;

import java.io.Serializable;

public interface BasicEntity extends Serializable {
    Long getId();

    Boolean getDeleted();

    Boolean getActive();

    String getSId();

    void setId(Long id);

    void setDeleted(Boolean deleted);

    void setActive(Boolean active);

    void setSId(String sId);
}
