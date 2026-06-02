package com.sharetechworks.muse.DOA;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Service_Task {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;
    long companyId;
    long serviceId;
    long taskId;
}
