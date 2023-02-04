package edu.bab.libr.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 26.04.2022 23:58
 * @class Condition
 */
public class Condition {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private List<Integer> numberOfTornPages;
    private String coverCondition;

    //region Constructors
    public Condition() {
    }

    public Condition(String name, String description, List<Integer> numberOfTornPages, String coverCondition) {
        this.name = name;
        this.description = description;
        this.numberOfTornPages = numberOfTornPages;
        this.coverCondition = coverCondition;
    }

    public Condition(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt, List<Integer> numberOfTornPages, String coverCondition) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.numberOfTornPages = numberOfTornPages;
        this.coverCondition = coverCondition;
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

    public List<Integer> getNumberOfTornPages() {
        return numberOfTornPages;
    }

    public void setNumberOfTornPages(List<Integer> numberOfTornPages) {
        this.numberOfTornPages = numberOfTornPages;
    }

    public String getCoverCondition() {
        return coverCondition;
    }

    public void setCoverCondition(String coverCondition) {
        this.coverCondition = coverCondition;
    }
    //endregion


    //region Overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Condition condition = (Condition) o;
        return id.equals(condition.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Condition{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", numberOfTornPages=" + numberOfTornPages +
                ", coverCondition='" + coverCondition + '\'' +
                '}';
    }
    //endregion
}
