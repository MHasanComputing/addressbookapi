package com.addressbook.addressbook.Record;

import java.util.Objects;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Objects;

public class Record {
    private Long id;
    @NotNull(message = "Enter a valid First name please")
    @NotEmpty(message = "Please provide an input")
    //regular expressions applied
    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9-]*$", message = "Contains invalid contents, alphanumeric and must begin with a Character")
    private String first_name;
    @NotNull(message = "Enter a valid second name please")
    @NotEmpty(message = "please provide a valid input")
    //regular expressions applied
    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9-]*$", message ="Contains invalid contents, alphanumeric and must begin with a Character")


    private String last_name;
    @NotNull(message = "Enter a valid Number please")
    @NotEmpty(message = "please provide a valid input")
    private String phone;

    @NotNull(message = "Enter a valid Email name please")
    @NotEmpty(message = "please provide a valid input")
    @Pattern(regexp = "[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$", message = "Not a Valid email, Please provide valid email")
    private String email;

    public Record() {
    }

    public Record(Long id,
                  String first_name,
                  String last_name,
                  String phone,
                  String email) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name, phone, email);
    }

    @Override
    public boolean equals(Object o) {
        boolean result;
        if (this == o) {
            result = true;
        } else if (o == null || getClass() != o.getClass()) {
            result = false;
        } else {
            Record record = (Record) o;
            result = Objects.equals(id, record.id) && Objects.equals(first_name, record.first_name) && Objects.equals(last_name, record.last_name) && Objects.equals(phone, record.phone) && Objects.equals(email, record.email);
        }
        return result;
    }
}



