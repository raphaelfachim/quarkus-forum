package fachim.raphael.api.infra.dto.user;

import fachim.raphael.api.infra.dto.question.QuestionOutputDTO;

import java.util.List;

public class UserOutputDTO {
    public String user;
    public String mail;
    public Boolean active;

    public List<QuestionOutputDTO> questions;

    public UserOutputDTO() {
    }

    public UserOutputDTO(String user, String mail, Boolean active, List<QuestionOutputDTO> questions) {
        this.user = user;
        this.mail = mail;
        this.active = active;
        this.questions = questions;
    }
}
