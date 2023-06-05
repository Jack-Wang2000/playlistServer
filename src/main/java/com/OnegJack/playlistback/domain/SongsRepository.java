package com.OnegJack.playlistback.domain;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongsRepository extends JpaRepository<Songs, Integer> {
    List<Songs> findAllByPlaylist(String listName);
@Transactional
    void deleteAllByIdAndPlaylist(int id, String playlist);
}
