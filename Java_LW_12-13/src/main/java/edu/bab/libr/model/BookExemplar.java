package edu.bab.libr.model;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 26.04.2022 22:19
 * @class BookExemplar
 */
public class BookExemplar {
    //region attributes
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Publication publication;
    private String nomenclatureNumber;
    private String lendTime;
    private double collateralCost;
    private double rentCost;
    private Condition condition;
    //endregion

    //region Constructors
    public BookExemplar() {
    }

    public BookExemplar(String name, String description, Publication publication, String nomenclatureNumber, String lendTime, double collateralCost, double rentCost, Condition condition) {
        this.name = name;
        this.description = description;
        this.publication = publication;
        this.nomenclatureNumber = nomenclatureNumber;
        this.lendTime = lendTime;
        this.collateralCost = collateralCost;
        this.rentCost = rentCost;
        this.condition = condition;
    }

    public BookExemplar(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt, Publication publication, String nomenclatureNumber, String lendTime, double collateralCost, double rentCost, Condition condition) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.publication = publication;
        this.nomenclatureNumber = nomenclatureNumber;
        this.lendTime = lendTime;
        this.collateralCost = collateralCost;
        this.rentCost = rentCost;
        this.condition = condition;
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

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public String getNomenclatureNumber() {
        return nomenclatureNumber;
    }

    public void setNomenclatureNumber(String nomenclatureNumber) {
        this.nomenclatureNumber = nomenclatureNumber;
    }

    public String getLendTime() {
        return lendTime;
    }

    public void setLendTime(String lendTime) {
        this.lendTime = lendTime;
    }

    public double getCollateralCost() {
        return collateralCost;
    }

    public void setCollateralCost(double collateralCost) {
        this.collateralCost = collateralCost;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
    //endregion


    //region Overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookExemplar that = (BookExemplar) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "BookExemplar{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", publication=" + publication +
                ", nomenclatureNumber='" + nomenclatureNumber + '\'' +
                ", lendTime='" + lendTime + '\'' +
                ", collateralCost=" + collateralCost +
                ", rentCost=" + rentCost +
                ", condition=" + condition +
                '}';
    }
    //endregion
}
