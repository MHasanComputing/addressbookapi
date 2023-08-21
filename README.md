# addressbookapi
RESTful API - Address Book


Get records from addressbook as list  - 
http://localhost:8080/api/v1/address-book-one/records

Get Specific record  - 
http://localhost:8080/api/v1/address-book-one/view/{recordId}" example = http://localhost:8080/api/v1/address-book-one/view/2

Add record - 
POST http://localhost:8080/api/v1/address-book-one/add/

Requestbody:
{
        "id": 3,
        "first_name": "Jake",
        "last_name": "alias",
        "phone": "0698435543",
        "email": "jaklis@gmail.com"
    }

Delete record -

Delete http://localhost:8080/api/v1/address-book-one/delete/{recordId} example =  http://localhost:8080/api/v1/address-book-one/delete/2

Edit record - 

Patch http://localhost:8080/api/v1/address-book-one/edit/{recordId} example =  http://localhost:8080/api/v1/address-book-one/edit/2

RequestBody paylaod - 
{
        "id": 2,
        "first_name": "Jane",
        "last_name": "Doe",
        "phone": "0698437773",
        "email": "JaneDoe2@gmail.com"
    }

