package org.jblab.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.jblab.model.enums.Sex;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * @author Aidar Shaifutdinov.
 */
@Entity
//NOTE Вот эта аннотация задает имя таблицы, из-за этого не работало
@Table(name = "users")
public class User {

    private static final String BLANK_MESSAGE = "This field is mandatory";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = BLANK_MESSAGE)
    @Email
    private String email;

    @NotBlank(message = BLANK_MESSAGE)
    @Size(min = 7, max = 20, message = "Password should be from 7 to 20 symbols")
    private String password;

    @Enumerated(EnumType.STRING)
    private Sex sex;

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
