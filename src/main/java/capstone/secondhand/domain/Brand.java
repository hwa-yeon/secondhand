package capstone.secondhand.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Brand {

    @Id @GeneratedValue
    private Long id;

    private String name;
}
