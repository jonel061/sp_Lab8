/*package models;
import  services.*;
import models.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.experimental.NonFinal;
import services.Visitor;
import model.Identifiable;
import models.Imagine;
import services.Visitable;
import services.Visitor;

import javax.persistence.*;
import java.util.Date;

@Value
@AllArgsConstructor // force generation of all args ctor used by derived classes
@NoArgsConstructor(force = true)  // force generation def ctor, required for derived classes
@NonFinal // not a final class
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Account implements Identifiable<Integer>, Visitable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    private String name;

    private Date joinDate;

    @OneToOne(targetEntity = ProxyPicture.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "picture_url")
    private Picture profilePicture;

    public void add(Account a) {
        throw new UnsupportedOperationException();
    }

    public void remove(Account a) {
        throw new UnsupportedOperationException();
    }

    public Account get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Integer id() {
        return getId();
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visitAccount(this);
    }
}

 */