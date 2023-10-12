package capstone.secondhand.domain;

import capstone.secondhand.domain.enumeration.Gender;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
@DynamicUpdate
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter @Setter
public class User {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private String provider;
    private String nickname;
    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String phoneNumber;
    private String userImage;
    private int reliableScore;

    @Builder //생성을 Builder 패턴으로 하기 위해서
    public User(String name, String email, String provider, String nickname) {
        this.name = name;
        this.email = email;
        this.provider = provider;
        this.nickname = nickname;
    }

    public User update(String name, String email) {
        this.name = name;
        this.email = email;
        return this;
    }
}
