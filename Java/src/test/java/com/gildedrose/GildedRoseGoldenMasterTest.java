package com.gildedrose;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GildedRoseGoldenMasterTest {
    final String CR = System.lineSeparator(); 
    final String expected = "OMGHAI!" + CR +
            "-------- day 0 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, 10, 20" + CR +
            "Aged Brie, 2, 0" + CR +
            "Elixir of the Mongoose, 5, 7" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 15, 20" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 10, 49" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 5, 49" + CR +
            "Conjured Mana Cake, 3, 6" + CR +
            "" + CR +

            "-------- day 1 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, 9, 19" + CR +
            "Aged Brie, 1, 1" + CR +
            "Elixir of the Mongoose, 4, 6" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 14, 21" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 9, 50" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 4, 50" + CR +
            "Conjured Mana Cake, 2, 5" + CR +
            "" + CR +

            "-------- day 2 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, 8, 18" + CR +
            "Aged Brie, 0, 2" + CR +
            "Elixir of the Mongoose, 3, 5" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 13, 22" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 8, 50" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 3, 50" + CR +
            "Conjured Mana Cake, 1, 4" + CR +
            "" + CR +

            "-------- day 3 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, 7, 17" + CR +
            "Aged Brie, -1, 4" + CR +
            "Elixir of the Mongoose, 2, 4" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 12, 23" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 7, 50" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 2, 50" + CR +
            "Conjured Mana Cake, 0, 3" + CR +
            "" + CR +

            "-------- day 4 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, 6, 16" + CR +
            "Aged Brie, -2, 6" + CR +
            "Elixir of the Mongoose, 1, 3" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 11, 24" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 6, 50" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 1, 50" + CR +
            "Conjured Mana Cake, -1, 1" + CR +
            "" + CR +

            "-------- day 5 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, 5, 15" + CR +
            "Aged Brie, -3, 8" + CR +
            "Elixir of the Mongoose, 0, 2" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 10, 25" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 5, 50" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 0, 50" + CR +
            "Conjured Mana Cake, -2, 0" + CR +
            "" + CR +

            "-------- day 6 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, 4, 14" + CR +
            "Aged Brie, -4, 10" + CR +
            "Elixir of the Mongoose, -1, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 9, 27" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 4, 50" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -1, 0" + CR +
            "Conjured Mana Cake, -3, 0" + CR +
            "" + CR +

            "-------- day 7 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, 3, 13" + CR +
            "Aged Brie, -5, 12" + CR +
            "Elixir of the Mongoose, -2, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 8, 29" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 3, 50" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -2, 0" + CR +
            "Conjured Mana Cake, -4, 0" + CR +
            "" + CR +

            "-------- day 8 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, 2, 12" + CR +
            "Aged Brie, -6, 14" + CR +
            "Elixir of the Mongoose, -3, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 7, 31" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 2, 50" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -3, 0" + CR +
            "Conjured Mana Cake, -5, 0" + CR +
            "" + CR +

            "-------- day 9 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, 1, 11" + CR +
            "Aged Brie, -7, 16" + CR +
            "Elixir of the Mongoose, -4, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 6, 33" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 1, 50" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -4, 0" + CR +
            "Conjured Mana Cake, -6, 0" + CR +
            "" + CR +

            "-------- day 10 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, 0, 10" + CR +
            "Aged Brie, -8, 18" + CR +
            "Elixir of the Mongoose, -5, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 5, 35" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 0, 50" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -5, 0" + CR +
            "Conjured Mana Cake, -7, 0" + CR +
            "" + CR +

            "-------- day 11 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, -1, 8" + CR +
            "Aged Brie, -9, 20" + CR +
            "Elixir of the Mongoose, -6, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 4, 38" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -1, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -6, 0" + CR +
            "Conjured Mana Cake, -8, 0" + CR +
            "" + CR +

            "-------- day 12 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, -2, 6" + CR +
            "Aged Brie, -10, 22" + CR +
            "Elixir of the Mongoose, -7, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 3, 41" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -2, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -7, 0" + CR +
            "Conjured Mana Cake, -9, 0" + CR +
            "" + CR +

            "-------- day 13 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, -3, 4" + CR +
            "Aged Brie, -11, 24" + CR +
            "Elixir of the Mongoose, -8, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 2, 44" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -3, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -8, 0" + CR +
            "Conjured Mana Cake, -10, 0" + CR +
            "" + CR +

            "-------- day 14 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, -4, 2" + CR +
            "Aged Brie, -12, 26" + CR +
            "Elixir of the Mongoose, -9, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 1, 47" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -4, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -9, 0" + CR +
            "Conjured Mana Cake, -11, 0" + CR +
            "" + CR +

            "-------- day 15 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, -5, 0" + CR +
            "Aged Brie, -13, 28" + CR +
            "Elixir of the Mongoose, -10, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, 0, 50" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -5, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -10, 0" + CR +
            "Conjured Mana Cake, -12, 0" + CR +
            "" + CR +

            "-------- day 16 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, -6, 0" + CR +
            "Aged Brie, -14, 30" + CR +
            "Elixir of the Mongoose, -11, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -1, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -6, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -11, 0" + CR +
            "Conjured Mana Cake, -13, 0" + CR +
            "" + CR +

            "-------- day 17 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, -7, 0" + CR +
            "Aged Brie, -15, 32" + CR +
            "Elixir of the Mongoose, -12, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -2, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -7, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -12, 0" + CR +
            "Conjured Mana Cake, -14, 0" + CR +
            "" + CR +

            "-------- day 18 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, -8, 0" + CR +
            "Aged Brie, -16, 34" + CR +
            "Elixir of the Mongoose, -13, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -3, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -8, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -13, 0" + CR +
            "Conjured Mana Cake, -15, 0" + CR +
            "" + CR +

            "-------- day 19 --------" + CR +
            "name, sellIn, quality" + CR +
            "+5 Dexterity Vest, -9, 0" + CR +
            "Aged Brie, -17, 36" + CR +
            "Elixir of the Mongoose, -14, 0" + CR +
            "Sulfuras, Hand of Ragnaros, 0, 80" + CR +
            "Sulfuras, Hand of Ragnaros, -1, 80" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -4, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -9, 0" + CR +
            "Backstage passes to a TAFKAL80ETC concert, -14, 0" + CR +
            "Conjured Mana Cake, -16, 0" + CR +
            "" + CR ;

    @Test
    public void gildedRose() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);

        out.println("OMGHAI!");

        Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 20;

        for (int i = 0; i < days; i++) {
            out.println("-------- day " + i + " --------");
            out.println("name, sellIn, quality");
            for (Item item : items) {
                out.println(item);
            }
            out.println();
            app.updateQuality();
        }

        System.out.println(output.toString());
        Assert.assertEquals(expected, output.toString());

    }
}
