package com.library.model;

public class Library {

    String library_name;
    String library_location;
    int yearOfEstablishment;
    String library_type;

    public Library(String library_name, String library_location, int yearOfEstablishment, String library_type) {
        this.library_name = library_name;
        this.library_location = library_location;
        this.yearOfEstablishment = yearOfEstablishment;
        this.library_type = library_type;
    }

    public String getLibrary_type() {
        return library_type;
    }

    public void setLibrary_type(String library_type) {
        this.library_type = library_type;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public String getLibrary_location() {
        return library_location;
    }

    public void setLibrary_location(String library_location) {
        this.library_location = library_location;
    }

    public String getLibrary_name() {
        return library_name;
    }

    public void setLibrary_name(String library_name) {
        this.library_name = library_name;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library_name='" + library_name + '\'' +
                ", library_location='" + library_location + '\'' +
                ", yearOfEstablishment=" + yearOfEstablishment +
                ", library_type='" + library_type + '\'' +
                '}';
    }
}
