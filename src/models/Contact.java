/*
package models;

import lombok.*;
import  models.Imagine;
import services.Visitor;

import javax.persistence.Entity;
import java.util.Date;

@Value
@NoArgsConstructor(force = true)
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper = true)
@Entity
public final class Contact extends Account {
    private String phoneNumber;

    private Date lastSeen;

    @Builder
    Contact(int id,
            String name,
            Date joinDate,
            Imagine profilePicture,
            String phoneNumber,
            Date lastSeen) {
        super(id, name, joinDate, profilePicture);
        this.phoneNumber = phoneNumber;
        this.lastSeen = lastSeen;
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visitContact(this);
    }
}*/