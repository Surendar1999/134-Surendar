package com.marticus.customers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
    
    @Column(name="customer_name")
    String customername;
    @Column(name="customer_number")
    String customerno;
    @Column(name="customer_location")
    String customerloc;
    
}