package com.addressbook.addressbook.record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/record")

public class RecordController {
    private final RecordService recordService;

    //injector of above class
    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping
    public List<Record> getRecords() {
        return recordService.getRecords();

    }
    @PostMapping
    public void addNewRecord (@RequestBody Record record){
        recordService.addNewRecord(record);
    }

}
