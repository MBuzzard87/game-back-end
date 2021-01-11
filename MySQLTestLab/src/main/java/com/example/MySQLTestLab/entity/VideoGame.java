package com.example.MySQLTestLab.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class VideoGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String console;
    private Integer year;
    private String developer;
    private Double price;
    private Integer stock;




    public VideoGame() {
    }

    public VideoGame(String title, String console, Integer year, String developer, Double price, Integer stock) {
        this.title = title;
        this.console = console;
        this.year = year;
        this.developer = developer;
        this.price = price;
        this.stock = stock;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String gameName) {
        this.title = gameName;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }


    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "VideoGame{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", console='" + console + '\'' +
                ", year=" + year +
                ", developer='" + developer + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

}
