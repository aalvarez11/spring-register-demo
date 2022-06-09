package com.example.demo;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private boolean married;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;
    private String profession;

    //getters
    //setters

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", note='" + note + '\'' +
                ", married=" + married +
                ", birthday=" + birthday +
                ", profession='" + profession + '\'' +
                '}';
    }
}
