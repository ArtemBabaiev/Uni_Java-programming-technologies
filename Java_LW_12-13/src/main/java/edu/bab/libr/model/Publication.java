package edu.bab.libr.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 26.04.2022 22:14
 * @class Publication
 */
public class Publication {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String author;
    private String publisher;
    private String yearOfPublishing;
    private String numberOfPages;
    private String coverType;
    private String numberInStock;
    private List<Genre> genres;

    //region Constructors
    public Publication() {
    }

    public Publication(String name, String description, String author, String publisher, String yearOfPublishing, String numberOfPages, String coverType, String numberInStock, List<Genre> genres) {
        this.name = name;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.coverType = coverType;
        this.numberInStock = numberInStock;
        this.genres = genres;
    }

    public Publication(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt, String author, String publisher, String yearOfPublishing, String numberOfPages, String coverType, String numberInStock, List<Genre> genres) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.coverType = coverType;
        this.numberInStock = numberInStock;
        this.genres = genres;
    }

    //endregion


    //region Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(String yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(String numberInStock) {
        this.numberInStock = numberInStock;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
    //endregion


    //region Overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Publication{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublishing='" + yearOfPublishing + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                ", coverType='" + coverType + '\'' +
                ", numberInStock='" + numberInStock + '\'' +
                ", genres=" + genres +
                '}';
    }
    //endregion
}
