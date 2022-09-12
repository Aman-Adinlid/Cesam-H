package se.aman;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import org.junit.jupiter.api.*;

public class ShelfTest {

private Shelf items;

    @Test
    public void shelfCanAcceptAndReturnItem() {
        Shelf shelf = new Shelf();
        Assertions.assertTrue(shelf.take(""));

    }
}
