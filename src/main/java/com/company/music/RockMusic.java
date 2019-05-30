package com.company.music;

import java.util.HashSet;
import java.util.Set;

public class RockMusic implements Music{

    private Set<String> songSet = new HashSet<>();
    private String musicClass;

    @Override
    public Set<String> getSongs() {
        return songSet;
    }

    @Override
    public String getMusicClass() {
        return "Rock Music";
    }

    public void setMusicClass(String musicClass) {
        this.musicClass = musicClass;
    }

    public void setSongSet(Set<String> songSet) {
        this.songSet = songSet;
    }
}
