package fachim.raphael.api.infra.mapper;

import fachim.raphael.api.domain.Question;
import fachim.raphael.api.infra.dto.question.NewQuestionDTO;
import fachim.raphael.api.infra.dto.question.QuestionOutputDTO;

public class QuestionMapper {

    public static Question NewQuestionDTOToQuestion(NewQuestionDTO newQuestionDTO){
        return new Question(newQuestionDTO.title, newQuestionDTO.content);
    }

    public static QuestionOutputDTO QuestionToQuestionOutputDTO(Question question) {
        return new QuestionOutputDTO(question.user.id, question.title, question.content);
    }

}
