package com.company;

public class Book {
    private int id;
    private static int iD;

    private int yearOfPublishing, numberOfPages, price;
    private String bookName, authorName, typeOfCover, publishing;

    public Book() {
        id = iD++;
    }

    public Book(String bookName_, String authorName_, String typeOfCover_,
                String publishing_, int yearOfPublishing_, int numberOfPages_, int price_) {
        this();
        bookName = bookName_;
        authorName = authorName_;
        typeOfCover = typeOfCover_;
        publishing = publishing_;
        this.yearOfPublishing = yearOfPublishing_;
        this.numberOfPages = numberOfPages_;
        this.price = price_;
    }

    public String toString() {
        String string = id + " " + bookName + "," + authorName + "," + typeOfCover + "," + publishing + "," + yearOfPublishing + "," + numberOfPages + "," + price;
        return string;
    }

    public void setBookName(String bookName_) {
        bookName = bookName_;
    }

    public void setAuthorName(String authorName_) {
        authorName = authorName_;
    }

    public void setTypeOfCover(String typeOfCover_) {
        typeOfCover = typeOfCover_;
    }

    public void setPublishing(String publ_) {
        publishing = publ_;
    }

    public void setYearOfPublishing(int yearOfPublishing_) {
        yearOfPublishing = yearOfPublishing_;
    }

    public void setNumberOfPages(int numberOfPages_) {
        numberOfPages = numberOfPages_;
    }

    public void setPrice(int price_) {
        price = price_;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
}
