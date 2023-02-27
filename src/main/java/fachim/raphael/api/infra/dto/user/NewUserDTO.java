package fachim.raphael.api.infra.dto.user;

public class NewUserDTO {
    public String userName;
    public String email;

    public NewUserDTO() {
    }

    public NewUserDTO(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
}
