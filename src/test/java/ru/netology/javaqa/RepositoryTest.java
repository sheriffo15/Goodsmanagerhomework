package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {

    Product book1 = new Product(12, "Война и мир", 500);
    Product book2 = new Product(17, "Анна Каренина", 370);
    Product book3 = new Product(5, "Воскресение", 330);

    @Test
    public void testAdd() {
        Repository repo = new Repository();
        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Product[] expected = {book1, book2, book3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testRemoveById() {
        Repository repo = new Repository();
        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.removeById(book2.getId());

        Product[] expected = {book1, book3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

}
