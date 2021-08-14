package com.infoworld;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import java.util.List;
import java.util.ArrayList;

import com.infoworld.resources.SongWriters;
import com.infoworld.repo.SongWriterRepo;
import com.infoworld.domain.SongWriter;

public class DW2Application extends Application<DW2Configuration> {

    public static void main(final String[] args) throws Exception {
        new DW2Application().run(args);
    }

    @Override
    public String getName() {
        return "DW2";
    }

    @Override
    public void initialize(final Bootstrap<DW2Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DW2Configuration configuration,
                    final Environment environment) {
	
	List<SongWriter> preload = new ArrayList<SongWriter>();
//	preload.add(new SongWriter("Mark Knopfler", new ArrayList<String>()));

	configuration.getSongWriters().forEach(sw -> preload.add(new SongWriter(sw, new ArrayList<String>())));
	SongWriterRepo swRepo = new SongWriterRepo(preload);
	SongWriters songWriters = new SongWriters(swRepo);
	environment.jersey().register(songWriters);
    }

}
