package com.bookStore.trackingService.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long bookId;
  private String title;
  @ElementCollection(targetClass=String.class)
  private List<String> authors;

  @JsonSerialize(using = LocalDateTimeSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  private LocalDateTime publicationDate;
  private String publishingHouse;
  @ElementCollection(targetClass=String.class)
  private List<String> tags;
  private UUID isbn;
  private Double retailPrice;


//	private String mongoBookId;

//	public Book() {
//	}
//
	public Book(String title, List<String> authors, LocalDateTime publicationDate, String publishingHouse,
			List<String> tags, UUID isbn, Double retailPrice) {
		this.title = title;
		this.authors = authors;
		this.publicationDate = publicationDate;
		this.publishingHouse = publishingHouse;
		this.tags = tags;
		this.isbn = isbn;
		this.retailPrice = retailPrice;
	}
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	public Long getMasterBookId() {
//		return masterBookId;
//	}
//
//	public void setMasterBookId(Long bookId) {
//		this.masterBookId = bookId;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	@ElementCollection
//	@CollectionTable(name = "authors")
//	public List<String> getAuthors() {
//		return authors;
//	}
//
//	public void setAuthors(List<String> authors) {
//		this.authors = authors;
//	}
//
//	public LocalDateTime getPublicationDate() {
//		return publicationDate;
//	}
//
//	public void setPublicationDate(LocalDateTime publicationDate) {
//		this.publicationDate = publicationDate;
//	}
//
//	public String getPublishingHouse() {
//		return publishingHouse;
//	}
//
//	public void setPublishingHouse(String publishingHouse) {
//		this.publishingHouse = publishingHouse;
//	}
//
//	@ElementCollection
//	@CollectionTable(name = "tags")
//	public List<String> getTags() {
//		return tags;
//	}
//
//	public void setTags(List<String> tags) {
//		this.tags = tags;
//	}
//
//	public UUID getIsbn() {
//		return isbn;
//	}
//
//	public void setIsbn(UUID isbn) {
//		this.isbn = isbn;
//	}
//
//	public Double getRetailPrice() {
//		return retailPrice;
//	}
//
//	public void setRetailPrice(Double retailPrice) {
//		this.retailPrice = retailPrice;
//	}
////
////	public String getMongoBookId() {
////		return mongoBookId;
////	}
////
////	public void setMongoBookId(String mongoBookId) {
////		this.mongoBookId = mongoBookId;
////	}
}
