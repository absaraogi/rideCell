package com.bookStore.trackingService.repository;

import com.bookStore.trackingService.entity.TrackingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingRepository extends JpaRepository<TrackingInfo,Long> {

  public TrackingInfo findByOrderId(String title);

}
