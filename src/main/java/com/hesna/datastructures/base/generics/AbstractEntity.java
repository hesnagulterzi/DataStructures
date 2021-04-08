package com.hesna.datastructures.base.generics;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    @CreatedDate
    @Column
    private Date cdate;

    @LastModifiedDate
    @Column
    private Date udate;

    @CreatedBy
    @Column
    private Long cuser;

    @LastModifiedBy
    @Column
    private Long uuser;

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public Date getUdate() {
        return udate;
    }

    public void setUdate(Date udate) {
        this.udate = udate;
    }

    public Long getCuser() {
        return cuser;
    }

    public void setCuser(Long cuser) {
        this.cuser = cuser;
    }

    public Long getUuser() {
        return uuser;
    }

    public void setUuser(Long uuser) {
        this.uuser = uuser;
    }
}
