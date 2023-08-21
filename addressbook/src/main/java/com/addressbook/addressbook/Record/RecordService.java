package com.addressbook.addressbook.Record;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.*;

@Service//Bean instance
public class RecordService {
    private static final String ADDRESS_BOOK_ONE = "address-book-one";

    //Hashmap in case of  further implements of multiple address books.
    private final Map<String, List<Record>> addressBook = new HashMap<>();

    // applying ID to ArrayList, Introduction of records into arrayList.
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
                "blalkahn98@gmail.com"));



    }

// add record using getter.
    public void addRecord(String addressBookId, Record record) {
        addressBook.get(addressBookId).add(record);

    }

    // List with record objects, will return selected address book based on AddressBookId
    List<Record> getRecords(String addressbookId) {
        return addressBook.get(addressbookId);
    }
// using allocated key provided in Path and addressbookid. selects specific record via recordId, remove record will stream to search for match. Then remove Record object.
    public Record deleteRecord(String addressbookId, final Long recordId){
        Optional<Record> recordRemove = addressBook.get(addressbookId).stream().filter(record -> record.getId().equals(recordId)).findFirst();
        if (recordRemove.isPresent()){
            addressBook.get(addressbookId).remove(recordRemove.get());
            return recordRemove.get();
        }
        return null;
    }

    //Using same instance of search via stream filter with paths indicating the record to view. will check if its present then, get to show and return.
    public Record viewSpecificRecord(String addressbookId, final Long recordId){
        Optional<Record> recordIdentify = addressBook.get(addressbookId).stream().filter(record -> record.getId().equals(recordId)).findFirst();
        return recordIdentify.orElse(null);

    }
// Filter to locate record in question, then using if statements determine is the request body is null, if not null set new contents after getting it.
    public ResponseEntity<String> updateRecord(String addressbookId, final Long recordId, Record updateRecord){
        Optional<Record> recordIdentify = addressBook.get(addressbookId).stream().filter(record -> record.getId().equals(recordId)).findFirst();

        if (recordIdentify.isPresent()) {
            Record currentrecord = recordIdentify.get();//places selected record in variable.

            //use request body contents to update info.
            if (updateRecord.getId()!=null){
                currentrecord.setId(updateRecord.getId());
            }

            if (updateRecord.getFirst_name()!=null){
                currentrecord.setFirst_name(updateRecord.getFirst_name());
            }

            if (updateRecord.getLast_name()!=null){
                currentrecord.setLast_name(updateRecord.getLast_name());
            }

            if (updateRecord.getPhone()!=null){
                currentrecord.setPhone(updateRecord.getPhone());
            }

            if (updateRecord.getEmail()!=null){
                currentrecord.setEmail(updateRecord.getEmail());
            }

            return ResponseEntity.ok("Update is Successful");
        }else {
            return ResponseEntity.notFound().build();

        }



        }


}











