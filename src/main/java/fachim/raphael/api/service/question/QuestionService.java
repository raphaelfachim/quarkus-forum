package fachim.raphael.api.service.question;

import fachim.raphael.api.domain.Question;
import fachim.raphael.api.domain.User;
import fachim.raphael.api.infra.dto.question.NewQuestionDTO;
import fachim.raphael.api.infra.dto.question.QuestionOutputDTO;
import fachim.raphael.api.infra.exception.EntityNotFoundException;
import fachim.raphael.api.infra.mapper.QuestionMapper;
import fachim.raphael.api.infra.repository.impl.QuestionRepository;
import fachim.raphael.api.infra.repository.impl.UserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class QuestionService {

    @Inject
    UserRepository userRepo;

    @Inject
    QuestionRepository questionRepo;

    public QuestionOutputDTO create(NewQuestionDTO newQuestionDTO) throws EntityNotFoundException {
        User user = userRepo.findById(newQuestionDTO.userId);
        if(user == null) throw new EntityNotFoundException("Usuário não encontrado!");
        Question question = QuestionMapper.NewQuestionDTOToQuestion(newQuestionDTO);
        question.user = user;
        questionRepo.create(question);
        return QuestionMapper.QuestionToQuestionOutputDTO(question);
    }

}
