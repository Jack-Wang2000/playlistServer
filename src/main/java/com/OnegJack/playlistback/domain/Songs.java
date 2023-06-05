package com.OnegJack.playlistback.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "songs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Songs {
    @Id@NotNull()
    private Integer id;
    @Column@NotEmpty
    private String name;
    @Column@NotNull
    private String artist;
    @Column
    private String playlist;
    @Column
    private String album;
    @Column
    private String imgUrl;

    @Column
    private  int duration;

}
