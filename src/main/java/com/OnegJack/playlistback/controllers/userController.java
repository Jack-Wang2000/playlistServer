package com.OnegJack.playlistback.controllers;

import com.OnegJack.playlistback.domain.*;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

public class userController {
    @Resource
    PlaylistsRepository playlistsRepository;
    @Resource
    SongsRepository songsRepository;
    @Resource
    HistoryRepository historyRepository;
    @GetMapping(value = "/getPlaylistDetail")
    public Playlists getPlaylistDetail(@RequestParam String listName){
        return playlistsRepository.findByName(listName);
    }
    @GetMapping(value ="/getSongs")
    public List<Songs> getSongs(@RequestParam String listName){
        return songsRepository.findAllByPlaylist(listName);
    }
    @RequestMapping(value = "/newPlaylist")
    public String newPlaylist(@RequestBody Playlists playlists) {
        playlistsRepository.save(playlists);
        return "创建歌单成功!";
    }

    @RequestMapping(value = "/deleteList/{listName}")
    public String deleteList(@PathVariable String listName) {
        playlistsRepository.deleteAllByName(listName);
        return "删除歌单成功!";
    }

    @RequestMapping(value = "/getPlaylists")
    public List<Playlists> getPlaylist(@RequestParam int id) {
        return playlistsRepository.findAllByusrId(id);
    }

    @RequestMapping(value = "/bookmarkSong")
    public String bookmarkSong(@RequestBody @Valid Songs songs, BindingResult bindingResult) {
        songsRepository.save(songs);
        return "收藏成功!";
    }

    @RequestMapping(value = "/deleteSong/{song}/{playlist}")
    public String deleteSong(@PathVariable int song,@PathVariable String playlist) {
        songsRepository.deleteAllByIdAndPlaylist(song,playlist);
        return "删除歌曲成功!";
    }

    @RequestMapping(value = "/saveHistory")
    public String saveHistory(@RequestBody @Valid History history, BindingResult bindingResult) {
        historyRepository.save(history);
        return "保存历史记录成功!";
    }

    @RequestMapping(value = "/getHistory")
    public List<History> getHistory(@RequestParam Integer id) {
        return historyRepository.findAllById(id);
    }

    @RequestMapping(value = "/onlineList")
    public String onlineList(@RequestBody List<Songs> songs) {
        songs.forEach((e)->{songsRepository.save((e));});
        return "保存歌曲成功!";
    }
}
