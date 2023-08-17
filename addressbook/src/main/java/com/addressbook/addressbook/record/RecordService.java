package com.addressbook.addressbook.record;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//Bean instance
public class RecordService {
    public List<Record> getRecords() {
        return List.of(
                new Record(
                        1L,
                        "Hasan",
                        "Khan",
                        "54545454",
                        "aych.khan@gmail.com"
                ),

                new Record(
                        2L,
                        "blal",
                        "Khan",
                        "684684684",
                        "blalkahn98@gmail.com"
                )



        );
    }

    public void addNewRecord(Record record) {
        System.out.println(record);

    }

    public void deleteRecord(Record record) {

    }
}
