package com.sharetechworks.muse.DOA;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Assignment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;
    long companyId;
    long serviceId;
    long employeeId;
    long clientId;
    Date dueDate;
}
