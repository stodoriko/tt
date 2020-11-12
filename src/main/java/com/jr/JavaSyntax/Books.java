package com.jr.JavaSyntax;

/*1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain].
Параметр конструктора - название книги (title).
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook измените тип возвращаемого значения на более подходящий.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.*/

import java.util.LinkedList;
import java.util.List;

public class Books {

    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }


    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";

            if (getBook() instanceof MarkTwainBook) {
                output = markTwainOutput;
            } else if (getBook() instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
            }

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }


    public static class MarkTwainBook extends Book {
        private String title;

        public MarkTwainBook(String title) {
            super(title);
            this.title = title;
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static class AgathaChristieBook extends Book {
        private String title;

        public AgathaChristieBook(String title) {
            super(title);
            this.title = title;
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }
}
