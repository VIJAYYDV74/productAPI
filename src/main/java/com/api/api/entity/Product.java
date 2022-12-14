package com.api.api.entity;

import com.opencsv.bean.CsvBindByName;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pID;
    @CsvBindByName
    private Integer productId;

    @CsvBindByName
    private String category;
    @CsvBindByName
    private String subCategory;
    @CsvBindByName
    private String displayName;
    @CsvBindByName
    private String description;
    @CsvBindByName
    private float listPrice;
    @CsvBindByName
    private float salePrice;
    @CsvBindByName
    private String uom;
    @CsvBindByName
    private String sku;
    @CsvBindByName
    private String hsn;
    @CsvBindByName
    private String taxGroup;
    @CsvBindByName
    private String imageUrl;

    public Product() {
    }

    public Product(Integer productId, String category, String subCategory, String displayName, String description, float listPrice, float salePrice, String uom, String sku, String hsn, String taxGroup, String imageUrl) {
        this.productId = productId;
        this.category = category;
        this.subCategory = subCategory;
        this.displayName = displayName;
        this.description = description;
        this.listPrice = listPrice;
        this.salePrice = salePrice;
        this.uom = uom;
        this.sku = sku;
        this.hsn = hsn;
        this.taxGroup = taxGroup;
        this.imageUrl = imageUrl;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getListPrice() {
        return listPrice;
    }

    public void setListPrice(float listPrice) {
        this.listPrice = listPrice;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        this.hsn = hsn;
    }

    public String getTaxGroup() {
        return taxGroup;
    }

    public void setTaxGroup(String taxGroup) {
        this.taxGroup = taxGroup;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
