package com.company.music;

import java.util.HashSet;
import java.util.Set;

public class JazzMusic implements Music {

    Set<String> songSet = new HashSet<>();
    private String musicClass;

    @Override
    public Set<String> getSongs() {
        return songSet;
    }

    @Override
    public String getMusicClass() {
        return "Jazz Music";
    }

    public void setMusicClass(String musicClass) {
        this.musicClass = musicClass;
    }

    public void setSongSet(Set<String> songSet) {
        this.songSet = songSet;
    }
}
