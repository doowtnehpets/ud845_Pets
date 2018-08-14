package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {
    // Empty Constructor
    private PetContract() {
    }

    public static final class PetEntry implements BaseColumns {
        // Table name
        public final static String TABLE_NAME = "pets";

        // Unique ID for pet
        public final static String _ID = BaseColumns._ID;

        // Columns
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";

        // Gender Value Constants
        public final static int GENDER_UNKNOWN = 0;
        public final static int GENDER_MALE = 1;
        public final static int GENDER_FEMALE = 2;
    }

}
