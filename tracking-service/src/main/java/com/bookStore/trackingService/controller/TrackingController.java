package com.bookStore.trackingService.controller;

import com.bookStore.trackingService.entity.TrackingInfo;
import com.bookStore.trackingService.service.TrackingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "/tracking")

public class TrackingController {

  @Autowired
  private TrackingService service;

  @GetMapping (value = "/id/{tracking_id}")
  public TrackingInfo trackOder(@PathVariable("tracking_id") String tracking_id) {
    log.info("track the shipment with id: " + tracking_id);
    return service.trackShipment(tracking_id);
  }
}
