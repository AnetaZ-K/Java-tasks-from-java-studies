/*
Napisz program porównujący książki, w tym celu:

    stwórz klasę Book, posiadającą pola title, author, publisher, year
    stwórz klasę, Library przechowującą tablicę obiektów Book
    wprowadź do tablicy kilka egzemplarzy Book
    zademonstruj porównywanie książek
    wyświetl szczegóły porównywanych książek
 */

package book;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;

    public Book (String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public String getTitle() {
        return  title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor () {
        return author;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public String getPublisher () {
        return publisher;
    }

    public void setPublisher () {
        this.publisher = publisher;
    }
    public int getYear () {
        return year;
    }

    public void  setYear () {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publisher, book.publisher);
    }


}
