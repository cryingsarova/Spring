package com.company.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

       public MusicPlayer() {
    }

    public void playMusic(){
        for (Music music: musicList) {
            System.out.println("----"+music.getMusicClass()+"----");
            Set<String>songs = music.getSongs();
            for (String song: songs ) {
                System.out.println("    playing: "+song);
            }
        }
    }
}
