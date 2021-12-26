package com.bookStore.trackingService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrackingInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String orderId;
  private String orderStatus;

  public TrackingInfo(String orderId, String orderStatus) {
    this.orderId=orderId;
    this.orderStatus=orderStatus;

  }
}
