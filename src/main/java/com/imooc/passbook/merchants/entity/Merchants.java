package com.imooc.passbook.merchants.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商户的对象模型
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "merchants")
public class Merchants {

    //商户id，主键
    @Id
    @GeneratedValue
    private Integer id;
}
