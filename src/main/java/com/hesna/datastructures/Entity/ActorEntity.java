package com.hesna.datastructures.Entity;

import com.hesna.datastructures.base.generics.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "actor")
public class ActorEntity extends AbstractEntity {

    @Id
    @GeneratedValue
    @Column(name ="actor_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
}
