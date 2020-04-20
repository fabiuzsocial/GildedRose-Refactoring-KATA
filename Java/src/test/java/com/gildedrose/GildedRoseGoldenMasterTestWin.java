package com.gildedrose;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GildedRoseGoldenMasterTestWin {
    final String expected = "OMGHAI!\r\n"+
            "-------- day 0 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, 10, 20\r\n"+
            "Aged Brie, 2, 0\r\n"+
            "Elixir of the Mongoose, 5, 7\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 15, 20\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 10, 49\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 5, 49\r\n"+
            "Conjured Mana Cake, 3, 6\r\n"+
            "\r\n"+

            "-------- day 1 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, 9, 19\r\n"+
            "Aged Brie, 1, 1\r\n"+
            "Elixir of the Mongoose, 4, 6\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 14, 21\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 9, 50\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 4, 50\r\n"+
            "Conjured Mana Cake, 2, 5\r\n"+
            "\r\n"+

            "-------- day 2 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, 8, 18\r\n"+
            "Aged Brie, 0, 2\r\n"+
            "Elixir of the Mongoose, 3, 5\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 13, 22\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 8, 50\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 3, 50\r\n"+
            "Conjured Mana Cake, 1, 4\r\n"+
            "\r\n"+

            "-------- day 3 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, 7, 17\r\n"+
            "Aged Brie, -1, 4\r\n"+
            "Elixir of the Mongoose, 2, 4\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 12, 23\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 7, 50\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 2, 50\r\n"+
            "Conjured Mana Cake, 0, 3\r\n"+
            "\r\n"+

            "-------- day 4 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, 6, 16\r\n"+
            "Aged Brie, -2, 6\r\n"+
            "Elixir of the Mongoose, 1, 3\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 11, 24\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 6, 50\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 1, 50\r\n"+
            "Conjured Mana Cake, -1, 1\r\n"+
            "\r\n"+

            "-------- day 5 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, 5, 15\r\n"+
            "Aged Brie, -3, 8\r\n"+
            "Elixir of the Mongoose, 0, 2\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 10, 25\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 5, 50\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 0, 50\r\n"+
            "Conjured Mana Cake, -2, 0\r\n"+
            "\r\n"+

            "-------- day 6 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, 4, 14\r\n"+
            "Aged Brie, -4, 10\r\n"+
            "Elixir of the Mongoose, -1, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 9, 27\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 4, 50\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -1, 0\r\n"+
            "Conjured Mana Cake, -3, 0\r\n"+
            "\r\n"+

            "-------- day 7 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, 3, 13\r\n"+
            "Aged Brie, -5, 12\r\n"+
            "Elixir of the Mongoose, -2, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 8, 29\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 3, 50\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -2, 0\r\n"+
            "Conjured Mana Cake, -4, 0\r\n"+
            "\r\n"+

            "-------- day 8 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, 2, 12\r\n"+
            "Aged Brie, -6, 14\r\n"+
            "Elixir of the Mongoose, -3, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 7, 31\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 2, 50\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -3, 0\r\n"+
            "Conjured Mana Cake, -5, 0\r\n"+
            "\r\n"+

            "-------- day 9 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, 1, 11\r\n"+
            "Aged Brie, -7, 16\r\n"+
            "Elixir of the Mongoose, -4, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 6, 33\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 1, 50\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -4, 0\r\n"+
            "Conjured Mana Cake, -6, 0\r\n"+
            "\r\n"+

            "-------- day 10 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, 0, 10\r\n"+
            "Aged Brie, -8, 18\r\n"+
            "Elixir of the Mongoose, -5, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 5, 35\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 0, 50\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -5, 0\r\n"+
            "Conjured Mana Cake, -7, 0\r\n"+
            "\r\n"+

            "-------- day 11 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, -1, 8\r\n"+
            "Aged Brie, -9, 20\r\n"+
            "Elixir of the Mongoose, -6, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 4, 38\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -1, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -6, 0\r\n"+
            "Conjured Mana Cake, -8, 0\r\n"+
            "\r\n"+

            "-------- day 12 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, -2, 6\r\n"+
            "Aged Brie, -10, 22\r\n"+
            "Elixir of the Mongoose, -7, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 3, 41\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -2, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -7, 0\r\n"+
            "Conjured Mana Cake, -9, 0\r\n"+
            "\r\n"+

            "-------- day 13 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, -3, 4\r\n"+
            "Aged Brie, -11, 24\r\n"+
            "Elixir of the Mongoose, -8, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 2, 44\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -3, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -8, 0\r\n"+
            "Conjured Mana Cake, -10, 0\r\n"+
            "\r\n"+

            "-------- day 14 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, -4, 2\r\n"+
            "Aged Brie, -12, 26\r\n"+
            "Elixir of the Mongoose, -9, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 1, 47\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -4, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -9, 0\r\n"+
            "Conjured Mana Cake, -11, 0\r\n"+
            "\r\n"+

            "-------- day 15 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, -5, 0\r\n"+
            "Aged Brie, -13, 28\r\n"+
            "Elixir of the Mongoose, -10, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, 0, 50\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -5, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -10, 0\r\n"+
            "Conjured Mana Cake, -12, 0\r\n"+
            "\r\n"+

            "-------- day 16 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, -6, 0\r\n"+
            "Aged Brie, -14, 30\r\n"+
            "Elixir of the Mongoose, -11, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -1, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -6, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -11, 0\r\n"+
            "Conjured Mana Cake, -13, 0\r\n"+
            "\r\n"+

            "-------- day 17 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, -7, 0\r\n"+
            "Aged Brie, -15, 32\r\n"+
            "Elixir of the Mongoose, -12, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -2, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -7, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -12, 0\r\n"+
            "Conjured Mana Cake, -14, 0\r\n"+
            "\r\n"+

            "-------- day 18 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, -8, 0\r\n"+
            "Aged Brie, -16, 34\r\n"+
            "Elixir of the Mongoose, -13, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -3, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -8, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -13, 0\r\n"+
            "Conjured Mana Cake, -15, 0\r\n"+
            "\r\n"+

            "-------- day 19 --------\r\n"+
            "name, sellIn, quality\r\n"+
            "+5 Dexterity Vest, -9, 0\r\n"+
            "Aged Brie, -17, 36\r\n"+
            "Elixir of the Mongoose, -14, 0\r\n"+
            "Sulfuras, Hand of Ragnaros, 0, 80\r\n"+
            "Sulfuras, Hand of Ragnaros, -1, 80\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -4, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -9, 0\r\n"+
            "Backstage passes to a TAFKAL80ETC concert, -14, 0\r\n"+
            "Conjured Mana Cake, -16, 0\r\n"+
            "\r\n";

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
