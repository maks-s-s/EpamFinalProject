package com.maksim.demo.model;

import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.NotNull;

@Table(name = "users")
@Entity
@Setter
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class User {
    @GeneratedValue
    @Id
    private Long id;

    @NotNull(message = "Role cannot be null")
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phoneNumber;
}
