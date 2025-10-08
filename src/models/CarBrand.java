package models;

public enum CarBrand {
    MERCEDES,
    AUDI,
    TESLA,
    PORSCHE,
    BMW;


    public String getBrandName() {

        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}