package com.OnegJack.playlistback.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "history")
@Data
@IdClass(PrimaryKey.class)
@NoArgsConstructor
@AllArgsConstructor
public class History {
    @Id
    @Column(name = "usr_id")
    private Integer usrId;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column
    private String name;
    @Column
    private String artist;
    @Column
    private String album;

    @Column
    private String time;

    @Column
    private String listName;

    @Column
    private int duration;

}
@Data
class PrimaryKey implements Serializable {

    private Integer id;

    private Integer usrId;
}