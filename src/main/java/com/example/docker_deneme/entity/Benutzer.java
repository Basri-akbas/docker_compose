package com.example.docker_deneme.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class Benutzer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 2, max = 30)
    @NotNull(message = "Please enter your firstName")
    private String Name;

    @Email(message = "Please enter valid email")
    @Size(min = 10, max = 80)
    @NotNull(message = "Please enter your email")
    private String email;


    @NotNull(message = "Please enter your password")
    private String password;
}
