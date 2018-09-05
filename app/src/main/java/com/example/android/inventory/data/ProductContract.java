package com.example.android.inventory.data;

import android.provider.BaseColumns;

public final class ProductContract {

    private ProductContract() {
    }

    /**
     * Inner class that defines constant values for the database table.
     * Each entry in the table represents a single product.
     */
    public static final class ProductEntry implements BaseColumns {

        /**
         * Name of database table
         */
        public final static String TABLE_NAME = "sqlitedatabase";

        /**
         * Unique ID number (only for use in the database table).
         * <p>
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_NAME = "name";

        /**
         * Type: TEXT
         */
        public final static String COLUMN_PRODUCT_VENDOR = "vendor";

        /**
         * Type: TEXT
         */

        public final static String COLUMN_PRODUCT_PHONE = "phone";

        /**
         * Type: INTEGER
         */

        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";

        /**
         * Type: INTEGER
         */
        public final static String COLUMN_PRODUCT_PRICE = "price";


    }
}

