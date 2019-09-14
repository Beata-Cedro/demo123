package pl.sda.servlets.users.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = "password")
public class Users {
    private Integer id;
    private String name;
    private String email;
    private String login;
    private String password;
    
}
