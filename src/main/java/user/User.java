package user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class User {
    private String user_id;
    private String password;
    private String nickname;
    private String created_date;
    private String modified_date;
}
