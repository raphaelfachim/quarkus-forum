package fachim.raphael.api.infra.dto.question;

public class QuestionOutputDTO {
    public Long userId;
    public String title;
    public String content;

    public QuestionOutputDTO() {
    }

    public QuestionOutputDTO(Long userId, String title, String content) {
        this.userId = userId;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "QuestionOutputDTO{" +
                "userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
