package edu.bab.libr.form;

import java.time.LocalDateTime;

/**
 * @author artem
 * @version: 1.0.0
 * @project Java_LW_12-13
 * @date 02.06.2022 11:31
 * @class EmployeeFrom
 */
public class EmployeeFrom {
    private String id;
    private String name;
    private String description;
    private String createdAt;
    private String updatedAt;

    public EmployeeFrom() {
    }

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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "EmployeeFrom{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
