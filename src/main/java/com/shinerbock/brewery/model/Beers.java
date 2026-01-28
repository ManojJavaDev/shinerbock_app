package com.shinerbock.brewery.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "beers")
public class Beers {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;
    @Column
    private String name;

    @Column
    private String style;
    @Column
    private Long upc;

    public Beers() {
    }

    public Beers(String name, String style, Long upc) {
        this.name = name;
        this.style = style;
        this.upc = upc;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Long getUpc() {
        return upc;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }
}
