package fachim.raphael.api.infra.mapper;

import fachim.raphael.api.domain.Question;
import fachim.raphael.api.infra.dto.question.NewQuestionDTO;
import fachim.raphael.api.infra.dto.question.QuestionOutputDTO;

import java.util.Collection;
import java.util.stream.Collectors;

public class QuestionMapper {

    public static Question NewQuestionDTOToQuestion(NewQuestionDTO newQuestionDTO){
        return new Question(newQuestionDTO.title, newQuestionDTO.content);
    }

    public static Collection<Question> NewQuestionDTOToQuestion(Collection<NewQuestionDTO> newQuestionDTO) {
        return newQuestionDTO.stream().map(dto -> NewQuestionDTOToQuestion(dto)).collect(Collectors.toList());
    }

    public static QuestionOutputDTO QuestionToQuestionOutputDTO(Question question) {
        return new QuestionOutputDTO(question.user.id, question.title, question.content);
    }


    public static Collection<QuestionOutputDTO> QuestionToQuestionOutputDTO(Collection<Question> questions) {
        return questions.stream().map(question -> QuestionToQuestionOutputDTO(question)).collect(Collectors.toList());
    }
}
