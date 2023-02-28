package fachim.raphael.api.infra.mapper;

import fachim.raphael.api.domain.Question;
import fachim.raphael.api.domain.User;
import fachim.raphael.api.infra.dto.question.QuestionOutputDTO;
import fachim.raphael.api.infra.dto.user.NewUserDTO;
import fachim.raphael.api.infra.dto.user.UserOutputDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {

    public static User NewUserDTOToUser(NewUserDTO newUserDTO) {
        return new User(newUserDTO.userName, newUserDTO.email);
    }

    public static Collection<User> NewUserDTOToUser(Collection<NewUserDTO> newUserDTO) {
       return newUserDTO.stream().map(dto -> NewUserDTOToUser(dto)).collect(Collectors.toList());
    }

    public static UserOutputDTO UserToUserOutputDTO(User user) {
        return new UserOutputDTO(user.userName,
                user.mail,
                user.active,
                (List<QuestionOutputDTO>) QuestionMapper.QuestionToQuestionOutputDTO(new ArrayList<>(user.questions)));
    }

    public static Collection<UserOutputDTO> UserToUserOutputDTO(Collection<User> user) {
        return user.stream().map(usr -> UserToUserOutputDTO(usr)).collect(Collectors.toList());
    }
}
