package com.marticus.technology.entity;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Entity
	@Data
	@Table(name = "Technology")
	@NoArgsConstructor
	public class TechnologyEntity {
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		
		@Column(name="Tech_name")
		String name;
		

	}


