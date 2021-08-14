package com.infoworld.repo;

import com.infoworld.domain.SongWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class SongWriterRepo {
  private final List<SongWriter> songWriters;
  public SongWriterRepo(){
    this.songWriters = new ArrayList<SongWriter>();	 
  }
  public SongWriterRepo(List<SongWriter> songWriters){
    this.songWriters = songWriters;
  }
  public List<SongWriter> findAll(){
    return songWriters;
  }
  public Optional<SongWriter> getByName(final String name){
    return songWriters.stream().filter(sw -> sw.getName().equals(name)).findFirst();
  }
}
