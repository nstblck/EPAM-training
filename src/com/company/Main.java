package com.company;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book[] arrayBooks = createBook();
        Scanner scanner = new Scanner(System.in);
        //Вывести: a) список книг заданного автора
        System.out.println("Введите фамилию автора:");
        String surname = scanner.nextLine();
        for (int i = 0; i < arrayBooks.length; i++) {
            Book book = arrayBooks[i];
            if (book.getAuthorName().equals(surname)) {
                System.out.println(book);
            }
        }

        //Вывести б) список книг, выпущенных заданным издательством;
        System.out.println("Введите название издательства:");
        String publishName = scanner.nextLine();
        for (int i = 0; i < arrayBooks.length; i++) {
            Book book = arrayBooks[i];
            if (book.getPublishing().toLowerCase(Locale.ROOT).equals(publishName.toLowerCase(Locale.ROOT))) {
                System.out.println(book);
            }
        }

        //Вывести в)список книг, выпущенных после заданного года
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        for (int i = 0; i < arrayBooks.length; i++) {
            Book book = arrayBooks[i];
            if (book.getYearOfPublishing() > year) {
                System.out.println(book);
            }
        }
    }

    private static Book[] createBook() {
        return new Book[]{
                new Book("The color of magic", "Terry Pratchett",
                        "paperback", "Ast", 2015, 320,
                        50),
                new Book("GUARDS! GUARDS!", "Terry Pratchett",
                        "hard cover", "Corgi", 2010, 496,
                        55),
                new Book("Mort", "Terry Pratchett", "hard cover",
                        "Ast", 2011, 416, 55),
                new Book("MONDAY BEGINS ON SATURDAY", "STRUGATSKI",
                        "hard cover", "Volna", 1995, 320, 48),
                new Book("Roadside Picnic", "STRUGATSKI", "paperback", "Volna",
                        2013, 250, 52),
                new Book("Solaris", "Stanislaw Lem", "paperback", "Mariner",
                        2012, 224, 64),
                new Book("I, Robot", "Isaac Asimov", "paperback", "Del Rey",
                        2008, 256, 60),
                new Book("Later", "Stephen King", "hard cover", "Mariner",
                        2021, 272, 75),
                new Book("The Institute: A Novel", "Stephen King", "hard cover",
                        "Del Rey", 2020, 300, 65)};
    }
}