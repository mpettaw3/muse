package com.sharetechworks.muse.DOA;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;
    long companyId;
    String title;
}
