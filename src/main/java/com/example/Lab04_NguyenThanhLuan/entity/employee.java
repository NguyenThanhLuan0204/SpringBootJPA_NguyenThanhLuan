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
@Table(name = "nhanvien")
@ToString
public class employee implements Serializable{
	
	@Id
    @Column(name = "MaNV")
    private String MaNV;

    @Column(name = "Ten")
    private String Ten;

    @Column(name = "Luong")
    private Integer Luong;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nhanvien")
//    private Collection<ChungNhan> lstChungNhan;

}

