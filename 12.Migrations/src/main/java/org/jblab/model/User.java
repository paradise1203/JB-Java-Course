package org.jblab.model;

import org.jblab.model.enums.Sex;

import javax.persistence.*;
import java.util.List;

/**
 * @author Aidar Shaifutdinov.
 */
@Entity
@Table(name = "users")
public class User {

    private static final String BLANK_MESSAGE = "This field is mandatory";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @OneToMany(mappedBy = "author")
    private List<Post> posts;

    public static String getBlankMessage() {
        return BLANK_MESSAGE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

}
