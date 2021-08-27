package com.aspringbootnow12.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name="favourites")
public class Favourites {
	//@Id
	//private Long id;
    @Id
	private String symbol;
    
	private String exchange;
	private String datetime;
	private String open;
	private String high;
	private String low;
	private String close;
	
}