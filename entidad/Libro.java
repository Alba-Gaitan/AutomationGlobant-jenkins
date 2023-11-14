package entidad;

import java.util.Scanner;

public class Libro {

    int ISBN, numberPage;
    String title, autor;


    public Libro(int ISBN, int numberPage, String title, String autor) {
        this.ISBN = ISBN;
        this.numberPage = numberPage;
        this.title = title;
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Libro() {
    }
}
