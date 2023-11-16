package com.sis213.cardauction.CardAcuction.model;

import java.math.BigDecimal;

public class CardModel {
    private String idCard;
    private String rarity;
    private String name;
    private String imageLink;
    private BigDecimal marketPrice;

    public CardModel() {
    }

    public CardModel(String idCard, String rarity, String name, String imageLink, BigDecimal marketPrice) {
        this.idCard = idCard;
        this.rarity = rarity;
        this.name = name;
        this.imageLink = imageLink;
        this.marketPrice = marketPrice;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    @Override
    public String toString() {
        return "CardDao{" +
                "idCard='" + idCard + '\'' +
                ", rarity='" + rarity + '\'' +
                ", name='" + name + '\'' +
                ", imageLink='" + imageLink + '\'' +
                ", marketPrice=" + marketPrice +
                '}';
    }
}
