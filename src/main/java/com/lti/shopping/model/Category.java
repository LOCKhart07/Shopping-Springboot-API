package com.lti.shopping.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GenericGenerator(name = "category_sequence", strategy = "increment")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_sequence")
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "image_url")
    String imageUrl;

    public Category(int id, String name, String imageUrl) {
        super();
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public Category() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name='" + name + ", imageUrl=" + '\'' + '}';
    }
}
