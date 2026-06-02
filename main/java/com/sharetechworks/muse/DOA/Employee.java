package com.sharetechworks.muse.DOA;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;
    String firstName;
    String lastName;
    long companyId;
    String phone_number;
    String email;
    Boolean isEmployee;
}
