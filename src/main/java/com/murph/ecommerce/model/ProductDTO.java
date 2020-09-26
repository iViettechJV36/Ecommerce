package com.murph.ecommerce.model;

public class ProductDTO {
    private int productId;
    private String namePoduct;
    private double price;
    private String supplier;
    private String type;
    private int detailses;
    private String images;

    public ProductDTO() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getNamePoduct() {
        return namePoduct;
    }

    public void setNamePoduct(String namePoduct) {
        this.namePoduct = namePoduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDetailses() {
        return detailses;
    }

    public void setDetailses(int detailses) {
        this.detailses = detailses;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
    
    
}
