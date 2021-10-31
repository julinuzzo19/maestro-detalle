package com.example.maestrodetalle.placeholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<PlaceholderItem> ITEMS = new ArrayList<PlaceholderItem>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static Map<String, PlaceholderItem> ITEM_MAP =
            new HashMap<String, PlaceholderItem>();

    static {
        addItem(new PlaceholderItem("1", "Amazon", "http://www.amazon.com"));
        addItem(new PlaceholderItem("2", "Google", "http://www.google.com"));
        addItem(new PlaceholderItem("3", "Android", "http://www.android.com"));
    }
    private static void addItem(PlaceholderItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }




    public static class PlaceholderItem {
        public String id;
        public String website_name;
        public String website_url;

        public PlaceholderItem(String id, String website_name,
                         String website_url)
        {
            this.id = id;
            this.website_name = website_name;
            this.website_url = website_url;
        }

        @Override
        public String toString() {
            return website_url;
        }

    }
}

    /*
    public final String id;
    public final String content;
    public final String details;

    public PlaceholderItem(String id, String content, String details) {
        this.id = id;
        this.content = content;
        this.details = details;
    }

    @Override
    public String toString() {
        return content;
    }
    */