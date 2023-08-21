package com.addressbook.addressbook.Record;

import org.junit.jupiter.api.Test;

class RecordControllerTest {

    /**
     * The testing is shown more as a preliminary option and very basic in context.
     * More test cased could easily be applied to increase credibility and robustness of the code.
     */

    private  RecordController recordController;
    //Before every test have the class records  initiated.
    Record RECORD_1 = new Record(1L, "Jason", "Andrew", "098977909", "andrew@gmail.com");
    Record RECORD_2 = new Record(1L, "Harry", "Smith", "0989734562", "harry@gmail.com");
    Record RECORD_3 = new Record(1L, "Megan", "Garden", "09897797564", "mrgan@gmail.com");


    @Test
    void getRecordFromAB() {

    }

    @Test
    void addNewRecord() {
    }

    @Test
    void deleteRecordFromAB() {
    }

    @Test
    void getSpecificRecord() {
    }

    @Test
    void editSpecificRecord() {
    }
}