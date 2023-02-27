package fachim.raphael.api.infra.mapper;

import fachim.raphael.api.domain.User;
import fachim.raphael.api.infra.dto.user.NewUserDTO;
import fachim.raphael.api.infra.dto.user.UserOutputDTO;

import java.util.Collection;
import java.util.stream.Collectors;

public class UserMapper {

    public static User NewUserDTOToUser(NewUserDTO newUserDTO) {
        return new User(newUserDTO.userName, newUserDTO.email);
    }

    public static Collection<User> NewUserDTOToUser(Collection<NewUserDTO> newUserDTO) {
       return newUserDTO.stream().map(dto -> NewUserDTOToUser(dto)).collect(Collectors.toSet());
    }

    public static UserOutputDTO UserToUserOutputDTO(User user) {
        return new UserOutputDTO(user.userName, user.mail, user.active);
    }

    public static Collection<UserOutputDTO> UserToUserOutputDTO(Collection<User> user) {
        return user.stream().map(usr -> UserToUserOutputDTO(usr)).collect(Collectors.toSet());
    }
}
