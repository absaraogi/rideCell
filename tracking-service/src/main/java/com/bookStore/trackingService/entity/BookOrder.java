package com.bookStore.trackingService.entity;

import java.time.LocalTime;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long sellerId;
	private Long buyerId;
	
	private LocalTime orderPlacedOn;
	private LocalTime deliveryTargetedOn;

	private UUID isbn;

	@Enumerated(EnumType.ORDINAL)
	private BookType bookType;
	
	@Enumerated(EnumType.ORDINAL)
	private OrderStatus status;

	public BookOrder(Long sellerId, Long buyerId, LocalTime orderPlacedOn, LocalTime deliveryTargetedOn, UUID isbn,
			BookType bookType) {
		this.sellerId = sellerId;
		this.buyerId = buyerId;
		this.orderPlacedOn = orderPlacedOn;
		this.deliveryTargetedOn = deliveryTargetedOn;
		this.isbn = isbn;
		this.bookType = bookType;
		this.status = OrderStatus.NEW;
	}

}
