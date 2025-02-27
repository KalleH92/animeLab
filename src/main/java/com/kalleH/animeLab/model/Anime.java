package com.kalleH.animeLab.model;


import jakarta.persistence.*;

@Entity
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    public Anime() {}
    public Anime(long id) {
        this.id = id;
    }

    @Column(name ="name")
    private String name;


    public Anime (long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
