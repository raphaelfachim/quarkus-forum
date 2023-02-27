package fachim.raphael.api.service.user;

import fachim.raphael.api.domain.User;
import fachim.raphael.api.infra.dto.user.NewUserDTO;
import fachim.raphael.api.infra.exception.EntityCreationException;
import fachim.raphael.api.infra.mapper.UserMapper;
import fachim.raphael.api.infra.repository.impl.UserRepository;
import fachim.raphael.api.infra.repository.interfaces.IUserRepository;
import fachim.raphael.api.infra.validation.UserValidator;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    IUserRepository userRepo;

    @Inject
    UserValidator userValidator;

    public List<User> findAll() {
        return (List<User>) userRepo.list();
    }

    public User create(NewUserDTO newUser) throws EntityCreationException {
        User user = UserMapper.NewUserDTOToUser(newUser);
        userValidator.validate(user);
        return userRepo.create(user);
    }
    public User findById(Long id) {
        return userRepo.findById(id);
    }

}
