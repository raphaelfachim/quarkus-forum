package fachim.raphael.api.infra.dto.question;

public class NewQuestionDTO {

    public Long userId;
    public String title;
    public String content;

    public NewQuestionDTO() {
    }

    public NewQuestionDTO(Long userId, String title, String content) {
        this.userId = userId;
        this.title = title;
        this.content = content;
    }
}
