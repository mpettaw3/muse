package com.sharetechworks.muse.DOA;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;
    long companyId;
    String title;
    String products_needed;
    String directions;
}
