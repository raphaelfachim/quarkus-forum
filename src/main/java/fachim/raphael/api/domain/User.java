package fachim.raphael.api.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue
    public Long id;

    @Column(name = "username")
    public String userName;

    public String mail;

    @OneToMany(mappedBy = "user")
    public Set<Question> questions;

    public Boolean active = Boolean.TRUE;

    public User() {
    }

    public User(String userName, String mail) {
        this.userName = userName;
        this.mail = mail;
    }
}
