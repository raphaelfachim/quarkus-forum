package fachim.raphael.api.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Question {

    @Id
    @GeneratedValue
    public Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    public User user;

    public String title;

    public String content;

    @OneToMany(mappedBy = "question")
    public Set<Answer> answers;

    public Question() {
    }
}
