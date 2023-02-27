package fachim.raphael.api.infra.dto.user;

public class UserOutputDTO {
    public String user;
    public String mail;
    public Boolean active;

    public UserOutputDTO() {
    }

    public UserOutputDTO(String user, String mail, Boolean active) {
        this.user = user;
        this.mail = mail;
        this.active = active;
    }
}
