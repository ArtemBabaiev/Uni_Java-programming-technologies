package edu.bab.libr.model;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 26.04.2022 22:20
 * @class Record
 */
public class Record {
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private BookExemplar bookExemplar;
    private Reader reader;
    private LocalDateTime lendedAt;
    private LocalDateTime orientedReturnTime;
    private LocalDateTime returnedAt;
    private Employee lendedBy;
    private Employee acceptedBy;
    private Discount discount;
    private Fine fine;
    private double income;
    private Condition returnBokokCondition;

    //region Constructors
    public Record() {
    }

    public Record(String name, String description, BookExemplar bookExemplar, Reader reader, LocalDateTime lendedAt, LocalDateTime orientedReturnTime, LocalDateTime returnedAt, Employee lendedBy, Employee acceptedBy, Discount discount, Fine fine, double income, Condition returnBokokCondition) {
        this.name = name;
        this.description = description;
        this.bookExemplar = bookExemplar;
        this.reader = reader;
        this.lendedAt = lendedAt;
        this.orientedReturnTime = orientedReturnTime;
        this.returnedAt = returnedAt;
        this.lendedBy = lendedBy;
        this.acceptedBy = acceptedBy;
        this.discount = discount;
        this.fine = fine;
        this.income = income;
        this.returnBokokCondition = returnBokokCondition;
    }

    public Record(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt, BookExemplar bookExemplar, Reader reader, LocalDateTime lendedAt, LocalDateTime orientedReturnTime, LocalDateTime returnedAt, Employee lendedBy, Employee acceptedBy, Discount discount, Fine fine, double income, Condition returnBokokCondition) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.bookExemplar = bookExemplar;
        this.reader = reader;
        this.lendedAt = lendedAt;
        this.orientedReturnTime = orientedReturnTime;
        this.returnedAt = returnedAt;
        this.lendedBy = lendedBy;
        this.acceptedBy = acceptedBy;
        this.discount = discount;
        this.fine = fine;
        this.income = income;
        this.returnBokokCondition = returnBokokCondition;
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

    public BookExemplar getBookExemplar() {
        return bookExemplar;
    }

    public void setBookExemplar(BookExemplar bookExemplar) {
        this.bookExemplar = bookExemplar;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public LocalDateTime getLendedAt() {
        return lendedAt;
    }

    public void setLendedAt(LocalDateTime lendedAt) {
        this.lendedAt = lendedAt;
    }

    public LocalDateTime getOrientedReturnTime() {
        return orientedReturnTime;
    }

    public void setOrientedReturnTime(LocalDateTime orientedReturnTime) {
        this.orientedReturnTime = orientedReturnTime;
    }

    public LocalDateTime getReturnedAt() {
        return returnedAt;
    }

    public void setReturnedAt(LocalDateTime returnedAt) {
        this.returnedAt = returnedAt;
    }

    public Employee getLendedBy() {
        return lendedBy;
    }

    public void setLendedBy(Employee lendedBy) {
        this.lendedBy = lendedBy;
    }

    public Employee getAcceptedBy() {
        return acceptedBy;
    }

    public void setAcceptedBy(Employee acceptedBy) {
        this.acceptedBy = acceptedBy;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Fine getFine() {
        return fine;
    }

    public void setFine(Fine fine) {
        this.fine = fine;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public Condition getReturnBokokCondition() {
        return returnBokokCondition;
    }

    public void setReturnBokokCondition(Condition returnBokokCondition) {
        this.returnBokokCondition = returnBokokCondition;
    }
    //endregion


    //region overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return id.equals(record.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Record{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", bookExemplar=" + bookExemplar +
                ", reader=" + reader +
                ", lendedAt=" + lendedAt +
                ", orientedReturnTime=" + orientedReturnTime +
                ", returnedAt=" + returnedAt +
                ", lendedBy=" + lendedBy +
                ", acceptedBy=" + acceptedBy +
                ", discount=" + discount +
                ", fine=" + fine +
                ", income=" + income +
                ", returnBokokCondition=" + returnBokokCondition +
                '}';
    }
    //endregion
}
