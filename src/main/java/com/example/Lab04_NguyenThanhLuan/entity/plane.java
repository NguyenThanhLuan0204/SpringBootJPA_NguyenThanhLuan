package com.example.Lab04_NguyenThanhLuan.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "maybay")
@ToString
public class plane{
	
	@Id
    @Column(name = "mamb")
    private int MaMB;

    @Column(name = "loai")
    private String Loai;

    @Column(name = "tambay")
    private int TamBay;

}

