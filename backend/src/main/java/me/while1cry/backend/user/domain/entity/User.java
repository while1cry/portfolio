package me.while1cry.backend.user.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import me.while1cry.backend.user.domain.vo.*;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDate;

@Setter
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull
    private String username;

    @Column(nullable = false)
    @NotNull
    private String nickname;

    @Column(nullable = false)
    @NotNull
    private String email;

    @Column(nullable = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column
    @Nullable
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column
    @Nullable
    @Setter(AccessLevel.NONE)
    private Integer age;

    @Column
    @Nullable
    private LocalDate birthDate;

    @Column
    @Nullable
    @Enumerated(EnumType.STRING)
    private Zodiac zodiac;

    @Column
    @Nullable
    @Enumerated(EnumType.STRING)
    private ChineseZodiac chineseZodiac;

    @Column
    @Nullable
    private String avatarUrl;

    @Column
    @Nullable
    private String bannerUrl;

    @Embedded
    private UserSettings settings = new UserSettings();
}
