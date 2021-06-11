package org.factoriaf5.legacygamesa.models;

import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "games")
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;
    private String title;
    private String platform;
    private String year;
    private String priceoriginal;
    private String etiqueta;
    private String discount;
    private String pricediscount;
    private String category;
    private String publisher;
    private String PEGI;
    private String PEGIcontentdescriptors;


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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPriceoriginal() {
        return priceoriginal;
    }

    public void setPriceoriginal(String priceoriginal) {
        this.priceoriginal = priceoriginal;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPricediscount() {
        return pricediscount;
    }

    public void setPricediscount(String pricediscount) {
        this.pricediscount = pricediscount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPEGI() {
        return PEGI;
    }

    public void setPEGI(String PEGI) {
        this.PEGI = PEGI;
    }

    public String getPEGIcontentdescriptors() {
        return PEGIcontentdescriptors;
    }

    public void setPEGIcontentdescriptors(String PEGIcontentdescriptors) {
        this.PEGIcontentdescriptors = PEGIcontentdescriptors;
    }
}
