package com.addressbook.addressbook.record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import java.util.List;

@RestController
public class RecordController {
    private final RecordService recordService;

    //injector of above class
    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/api/v1/record/{addressBookId}/records")
    public List<Record> getRecordFromAB(@PathVariable String addressBookId){
        return recordService.getRecords(addressBookId);

    }
    @PostMapping("/api/v1/record/{addressBookId}/add")
    public void addNewRecord (@PathVariable String addressBookId, @RequestBody Record newRecord){
        recordService.addRecord(addressBookId,newRecord);
    }

    @DeleteMapping("/api/v1/record/{addressBookId}/delete/{recordId}")
    public Record deleteRecordFromAB(@PathVariable String addressBookId, @PathVariable Long recordId) {
        return recordService.deleteRecord(addressBookId, recordId);

    }

    @GetMapping("/api/v1/record/{addressBookId}/viewrecord/{recordId}")
    public Record getSpecificRecord(@PathVariable String addressBookId, @PathVariable Long recordId){
        return recordService.viewSpecificRecord(addressBookId, recordId);

    }




}
