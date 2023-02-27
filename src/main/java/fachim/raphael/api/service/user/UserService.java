package fachim.raphael.api.service.user;

import fachim.raphael.api.domain.User;
import fachim.raphael.api.infra.repository.impl.UserRepository;
import fachim.raphael.api.infra.repository.interfaces.IUserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UserService {

    private IUserRepository repo;
    public UserService(IUserRepository repo) {
        this.repo = repo;
    }

    public List<User> findAll() {
        return (List<User>) this.repo.list();
    }

}
