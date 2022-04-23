package pl.edu.agh.asd3.map;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBookTest {

    @Test
    public void addAndGetPositiveTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Adam Adamski", "123456789");
        phoneBook.addEntry("Beata Beatowska", "987654321");

        assertEquals("123456789", phoneBook.findEntry("Adam Adamski"));
    }

    @Test
    public void addAndGetNegativeTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Adam Adamski", "123456789");
        phoneBook.addEntry("Beata Beatowska", "987654321");

        assertNull(phoneBook.findEntry("Cezary Czarkowski"));
    }

    @Test
    public void addAndCheckEntryExistencePositiveTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Adam Adamski", "123456789");
        phoneBook.addEntry("Beata Beatowska", "987654321");

        assertTrue(phoneBook.existsEntry("Adam Adamski"));
    }

    @Test
    public void addAndCheckEntryExistenceNegativeTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Adam Adamski", "123456789");
        phoneBook.addEntry("Beata Beatowska", "987654321");

        assertFalse(phoneBook.existsEntry("Cezary Czarkowski"));
    }

    @Test
    public void addAndCheckNumberExistencePositiveTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Adam Adamski", "123456789");
        phoneBook.addEntry("Beata Beatowska", "987654321");

        assertTrue(phoneBook.checkNumberExists("123456789"));
    }

    @Test
    public void addAndCheckNumberExistenceNegativeTest() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Adam Adamski", "123456789");
        phoneBook.addEntry("Beata Beatowska", "987654321");

        assertFalse(phoneBook.checkNumberExists("456789123"));
    }
}
