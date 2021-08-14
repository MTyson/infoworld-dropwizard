package com.infoworld.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

import com.infoworld.repo.SongWriterRepo;
import com.infoworld.domain.SongWriter;

@Path("/songwriters")
@Produces(MediaType.APPLICATION_JSON)
public class SongWriters {
   private final SongWriterRepo repo;
    public SongWriters(SongWriterRepo repo) {
      this.repo = repo;
    }

    @GET
    public List<SongWriter> getBrands() {
//        return "{'name':'Roger Waters','name':'Tom Petty'}";
        return repo.findAll();
    }
/*
    @GET
    @Path("/{id}")
    public Brand getById(@PathParam("id") final Long id) {
        return brandRepository
          .findById(id)
          .orElseThrow(RuntimeException::new);
    }
    */
}
