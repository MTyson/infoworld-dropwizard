package com.infoworld.domain;

import java.util.ArrayList;
import java.util.List;

public class SongWriter {
    private final String name;
    private List<String> songs = new ArrayList<>();

    public SongWriter(final String name, final List<String> songs) {
        this.name = name;
	this.songs = songs;
    }

    public String getName() {
      return name;
    }
    public List<String> getSongs(){
      return this.songs;
    }
}
