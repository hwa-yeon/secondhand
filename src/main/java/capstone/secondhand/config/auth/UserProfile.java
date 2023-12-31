package capstone.secondhand.config.auth;

import capstone.secondhand.domain.User;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserProfile {

    private String name;
    private String email;
    private String provider;
    private String nickname;

    public User toUser() {
        return User.builder()
                .name(name)
                .email(email)
                .provider(provider)
                .build();
    }
}
