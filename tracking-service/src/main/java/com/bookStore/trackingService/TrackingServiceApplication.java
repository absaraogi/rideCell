package com.bookStore.trackingService;

import com.bookStore.trackingService.entity.TrackingInfo;
import com.bookStore.trackingService.repository.TrackingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TrackingServiceApplication  implements CommandLineRunner {
	@Autowired
	private TrackingRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(TrackingServiceApplication.class, args);

	}
	@Override
	public void run(String... arg0) throws Exception {
		repo.deleteAll();
		log.info("inside run");
		repo.save(new TrackingInfo("1","DELIVERED"));
		repo.save(new TrackingInfo("2","NEW"));
		repo.save(new TrackingInfo("3","OUT_FOR_DELIVERY"));
	}



}
