package com.OnegJack.playlistback.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
@Entity
@Table(name="user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id@NotNull
    private Integer id;
    @Column
    private String nickname;
    @Column
    private String picUrl;
}
