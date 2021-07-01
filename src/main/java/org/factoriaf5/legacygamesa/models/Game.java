package org.factoriaf5.legacygamesa.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "games")
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private List<Game> games;
    @NotNull
    private String title;

    @NotNull
    private String platform;

    @NotNull
    private double priceoriginal;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private String photo;

    @Override
    public String toString() {
        return "Game{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", platform='" + platform + '\'' +
        ", priceoriginal='" + priceoriginal + '\'' +
        ", category='" + category + '\'' +
        ", photo='" + photo + '\'' +
        '}';
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getPriceoriginal() {
        return priceoriginal;
    }

    public void setPriceoriginal(double priceoriginal) {
        this.priceoriginal = priceoriginal;
    }

    public String getphoto() {
        return photo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhotoImagePath() {
        if (photo == null || id == null) return null;
        return "/game-photo/" + id + "/" + photo;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
