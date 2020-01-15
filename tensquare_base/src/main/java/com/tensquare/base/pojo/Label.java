package com.tensquare.base.pojo;

/**
 * @author: taibai
 * @date:2019/9/10
 */

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 标签实体类
 */
@Entity
@Table(name = "tb_label")
@Data
public class Label implements Serializable {
    @Id
    private String id;
    private String labelname;
    private String state;
    private Long count;
    private Long fans;
    private String recommend;
}
