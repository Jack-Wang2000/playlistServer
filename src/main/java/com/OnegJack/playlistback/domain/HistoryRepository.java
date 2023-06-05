package com.OnegJack.playlistback.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History,Integer> {
    List<History> findAllById(Integer id);
}

