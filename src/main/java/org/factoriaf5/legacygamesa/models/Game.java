package org.factoriaf5.legacygamesa.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "games")
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String platform;

    @NotNull
    private double priceoriginal;

    private String photo;

    @Override
    public String toString() {
        return "Game{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", platform='" + platform + '\'' +
        ", priceoriginal='" + priceoriginal + '\'' +
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

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhotoImagePath() {
        if (photo == null || id == null) return null;
        return "/game-photo/" + id + "/" + photo;
    }
}
