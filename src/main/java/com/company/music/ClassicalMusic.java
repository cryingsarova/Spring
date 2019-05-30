package com.company.music;


import java.util.HashSet;
import java.util.Set;

public class ClassicalMusic implements Music {

    private Set<String> songSet = new HashSet<>();
    private String musicClass;

    public ClassicalMusic(Set<String> songSet, String musicClass) {
        this.songSet = songSet;
        this.musicClass = musicClass;
    }

    @Override
    public Set<String> getSongs() {
        return  songSet;
    }

    @Override
    public String getMusicClass() {
        return musicClass;
    }


}
