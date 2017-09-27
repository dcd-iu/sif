package edu.iu.uits.dcd.sif;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class ServiceRecord {
    @Id
    @GeneratedValue
    private Long id;
    private String name, url, shortDescription, longDescription;
    private boolean active;

}
