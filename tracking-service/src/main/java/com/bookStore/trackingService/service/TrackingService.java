package com.bookStore.trackingService.service;

import com.bookStore.trackingService.entity.TrackingInfo;
import com.bookStore.trackingService.repository.TrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackingService {

  @Autowired
  private TrackingRepository repo;

  public TrackingInfo trackShipment(String tracking_id) {
    return repo.findByOrderId(tracking_id);
  }
}
