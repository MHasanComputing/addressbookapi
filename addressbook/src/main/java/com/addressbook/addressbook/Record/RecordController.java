package com.addressbook.addressbook.Record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecordController {
    private final RecordService recordService;

    //injector of above class
    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/api/v1/{addressBookId}/records")
    public List<Record> getRecordFromAb(@PathVariable String addressBookId){
        return recordService.getRecords(addressBookId);

    }
    @PostMapping("/api/v1/{addressBookId}/add")
    public void addNewRecord (@PathVariable String addressBookId, @RequestBody Record newRecord){
        recordService.addRecord(addressBookId,newRecord);
    }

    @DeleteMapping("/api/v1/{addressBookId}/delete/{recordId}")
    public Record deleteRecordFromAb(@PathVariable String addressBookId, @PathVariable Long recordId) {
        return recordService.deleteRecord(addressBookId, recordId);

    }


    @GetMapping("/api/v1/{addressBookId}/view/{recordId}")
    public Record getSpecificRecord(@PathVariable String addressBookId, @PathVariable Long recordId){
        return recordService.viewSpecificRecord(addressBookId, recordId);

    }

    @PatchMapping("/api/v1/{addressBookId}/edit/{recordId}")
    public ResponseEntity<String>editSpecificRecord(@PathVariable String addressBookId,@PathVariable Long recordId, @RequestBody Record editRecord){
        return recordService.updateRecord(addressBookId, recordId,editRecord);
    }




}
