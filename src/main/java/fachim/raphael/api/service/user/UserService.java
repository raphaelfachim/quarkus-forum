package fachim.raphael.api.service.user;

import fachim.raphael.api.domain.User;
import fachim.raphael.api.infra.dto.user.NewUserDTO;
import fachim.raphael.api.infra.mapper.UserMapper;
import fachim.raphael.api.infra.repository.impl.UserRepository;
import fachim.raphael.api.infra.repository.interfaces.IUserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    IUserRepository userRepo;

    public List<User> findAll() {
        return (List<User>) this.userRepo.list();
    }

    public User create(NewUserDTO newUser) {
        return this.userRepo.create(UserMapper.NewUserDTOToUser(newUser));
    }

}
