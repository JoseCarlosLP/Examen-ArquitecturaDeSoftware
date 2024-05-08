package dto;

public class UserDto {
    private String email;
    private String password;
    UserDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public String getEmail() {return email;}
    public String getPassword() {return password;}

}
