package com.rs.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.Data;

@Data
@Entity

public class CallerTune {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String song;
	private String movie;
	private Integer phno;
	
	@CreationTimestamp
	@Column(updatable=false,insertable = true)
	private LocalDateTime serviceOpt;
	
	@UpdateTimestamp
	@Column(updatable=true,insertable = false)
	private LocalDateTime lastlyUpdated;
	
	
	@Version
	private Integer ChangedCount;
	
}
