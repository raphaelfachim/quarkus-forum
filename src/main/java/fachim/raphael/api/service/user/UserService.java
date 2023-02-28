package fachim.raphael.api.service.user;

import fachim.raphael.api.domain.User;
import fachim.raphael.api.infra.dto.user.NewUserDTO;
import fachim.raphael.api.infra.dto.user.UserOutputDTO;
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

    public List<UserOutputDTO> findAll() {
        return (List<UserOutputDTO>) UserMapper.UserToUserOutputDTO(userRepo.list());
    }

    public UserOutputDTO create(NewUserDTO newUser) throws EntityCreationException {
        User user = UserMapper.NewUserDTOToUser(newUser);
        userValidator.validate(user);

        return UserMapper.UserToUserOutputDTO(userRepo.create(user));
    }
    public UserOutputDTO findById(Long id) {
        return UserMapper.UserToUserOutputDTO(userRepo.findById(id));
    }

}
