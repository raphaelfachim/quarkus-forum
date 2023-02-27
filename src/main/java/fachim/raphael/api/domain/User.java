package fachim.raphael.api.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue
    public Long id;

    @Column(name = "username")
    @NotNull(message = "Informe um nome de usuário!")
    @Size(min = 4, message = "O nome de usuário deve possuir ao menos 4 letras")
    public String userName;

    @NotNull(message = "Informe um endereço de email!")
    @Email(message = "O email informado é inválido!")
    public String mail;

    @OneToMany(mappedBy = "user")
    public Set<Question> questions = new HashSet<>();

    public Boolean active = Boolean.TRUE;

    public User() {
    }

    public User(String userName, String mail) {
        this.userName = userName;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", mail='" + mail + '\'' +
                ", active=" + active +
                '}';
    }
}
