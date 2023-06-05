package com.OnegJack.playlistback.domain;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaylistsRepository extends JpaRepository<Playlists,String> {
    List<Playlists> findAllByusrId(int id);
    @Transactional
    void deleteAllByName(String listName);

    Playlists findByName(String listName);
}
