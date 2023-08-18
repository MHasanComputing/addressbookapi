package com.addressbook.addressbook.record;
import org.springframework.stereotype.Service;
import java.util.*;

@Service//Bean instance
public class RecordService {
    private static final String ADDRESS_BOOK_ONE = "address-book-one";
    private final Map<String, List<Record>> addressBook = new HashMap<>();
    public RecordService(){
        addressBook.put(ADDRESS_BOOK_ONE, new ArrayList<>());

        this.addRecord(ADDRESS_BOOK_ONE, new Record(
                1l,
                "Thomas",
                "Allan",
                "0421435543",
                "0allan@gmail.com"));
        this.addRecord(ADDRESS_BOOK_ONE, new Record(
                2L,
                "blal",
                "Khan",
                "684684684",
                "blalkahn98@gmail.com"
        ));



    }


    public Record addRecord(String addressBookId, Record record) {
        addressBook.get(addressBookId).add(record);
        return record;

    }
    List<Record> getRecords(String addressbookId) {
        return addressBook.get(addressbookId);
    }

    public Record deleteRecord(String addressbookId, final Long recordId){
        Optional<Record> recordRemove = addressBook.get(addressbookId).stream().filter(record -> record.getId().equals(recordId)).findFirst();
        if (recordRemove.isPresent()){
            addressBook.get(addressbookId).remove(recordRemove.get());
            return recordRemove.get();
        }
        return null;
    }

    public Record viewSpecificRecord(String addressbookId, final Long recordId){
        Optional<Record> recordIdentify = addressBook.get(addressbookId).stream().filter(record -> record.getId().equals(recordId)).findFirst();
        if (recordIdentify.isPresent()){
            return recordIdentify.get();
        }
        return null;

    }









}
