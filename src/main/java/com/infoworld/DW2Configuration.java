package com.infoworld;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.ArrayList;

public class DW2Configuration extends Configuration {
  private List<String> songWriters;
  @JsonCreator
  public DW2Configuration(@JsonProperty("songWriters") List<String> songWriters){
	  this.songWriters = songWriters;
  }
  public List<String> getSongWriters(){
	  return this.songWriters;
  }
}
