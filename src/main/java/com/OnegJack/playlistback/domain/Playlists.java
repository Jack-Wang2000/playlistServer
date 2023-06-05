package com.OnegJack.playlistback.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "playlists")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Playlists{
    @Id@NotEmpty@GenericGenerator(name = "uuid")
    private String name;
    @Column
    private int usrId;
    @Column
    private String description;

    @Column String creatorName;

    @Column String listPic;

    @Column String creatorPic;

}
