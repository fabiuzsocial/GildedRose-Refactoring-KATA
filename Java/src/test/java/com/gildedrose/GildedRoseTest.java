package com.gildedrose;

import static org.junit.Assert.*;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void testUpdateQuality() {

        CombinationApprovals.verifyAllCombinations(
                this::doUpdateQuality,
                new String[]{"foo"},
                new Integer[]{0},
                new Integer[]{0}
        );
    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        //assertEquals("foo", app.items[0].name);
        String itemAsAString = app.items[0].toString();
        return itemAsAString;
    }

}
