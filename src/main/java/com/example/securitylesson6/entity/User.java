package com.example.securitylesson6.entity;

import com.example.securitylesson6.userRole.UserRole;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity(name = "my_user")
@Setter
@Getter
public class User extends BaseEntity{

    @Column(unique = true)
    private String email;

    private String password;

    private String fullName;

    @Column(nullable = false)
    @ColumnDefault("false")
    private boolean confirmed=false;

    @Enumerated(EnumType.STRING)
    private UserRole role=UserRole.USER;

}
