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

    public User() {
    }
}
