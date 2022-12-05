
package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void testAddBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Война и мир", 500, "Л.Толстой");
        Book book2 = new Book(1, "Анна Каренина", 370, "Л.Толстой");
        Book book3 = new Book(1, "Воскресение", 330, "Л.Толстой");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book1, book2, book3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSearchBookByFindFew() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(12, "Война и мир", 500, "Л.Толстой");
        Book book2 = new Book(17, "Анна Каренина", 370, "Л.Толстой");
        Book book3 = new Book(5, "Воскресение", 330, "Л.Толстой");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book1, book2};
        Product[] actual = manager.searchBy("на");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSearchBookByFindOne() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(12, "Война и мир", 500, "Л.Толстой");
        Book book2 = new Book(17, "Анна Каренина", 370, "Л.Толстой");
        Book book3 = new Book(5, "Воскресение", 330, "Л.Толстой");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book1};
        Product[] actual = manager.searchBy("мир");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSearchBookByFindNone() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(12, "Война и мир", 500, "Л.Толстой");
        Book book2 = new Book(17, "Анна Каренина", 370, "Л.Толстой");
        Book book3 = new Book(5, "Воскресение", 330, "Л.Толстой");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {};
        Product[] actual = manager.searchBy("декабр");

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void testAddSmartPhone() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(1, "Iphone 12", 10000, "Apple");
        Smartphone smartphone2 = new Smartphone(15, "Iphone 13", 30000, "Apple");
        Smartphone smartphone3 = new Smartphone(12, "Iphone 14", 50000, "Apple");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {smartphone1, smartphone2, smartphone3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSearchSmartphoneByFindFew() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(1, "Iphone 12", 10000, "Apple");
        Smartphone smartphone2 = new Smartphone(15, "Iphone 13", 30000, "Apple");
        Smartphone smartphone3 = new Smartphone(12, "Mi15", 50000, "Xiaomi");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {smartphone1, smartphone2};
        Product[] actual = manager.searchBy("Iphone");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSearchSmartphoneByFindOne() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(1, "Iphone 12", 10000, "Apple");
        Smartphone smartphone2 = new Smartphone(15, "Iphone 13", 30000, "Apple");
        Smartphone smartphone3 = new Smartphone(12, "Mi15", 50000, "Xiaomi");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {smartphone3};
        Product[] actual = manager.searchBy("Mi15");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSearchSmartphoneByFindNone() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smartphone smartphone1 = new Smartphone(1, "Iphone 12", 10000, "Apple");
        Smartphone smartphone2 = new Smartphone(15, "Iphone 13", 30000, "Apple");
        Smartphone smartphone3 = new Smartphone(12, "Mi15", 50000, "Xiaomi");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Samsung");

        Assertions.assertArrayEquals(expected, actual);

    }

}
