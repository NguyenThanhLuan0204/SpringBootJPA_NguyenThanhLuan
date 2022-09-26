package com.example.Lab04_NguyenThanhLuan.entity;


import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Table(name = "chuyenbay")
public class flight{
	@Id
	@Column(name = "MaCB", unique = true)
	private String MaCB;

	@Column(name = "GaDi")
	private String GaDi;

	@Column(name = "GaDen")
	private String GaDen;

	@Column(name = "DoDai")
	private int DoDai;

	@Column(name = "GioDi")
	private Time GioDi;

	@Column(name = "GioDen")
	private Time GioDen;

	@Column(name = "ChiPhi")
	private int ChiPhi;
}
