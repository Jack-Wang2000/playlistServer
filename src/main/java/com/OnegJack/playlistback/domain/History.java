package com.OnegJack.playlistback.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "history")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class History {
    @Id@NotEmpty
    private Integer id;
    @Column
    private int usr_id;
    @Column
    private int song_id;
    @Column
    private String song_name;
    @Column
    private String artist;
    @Column
    private String album;

    @Column
    private Date time;

    @Column
    private int isInList;

}
