package com.tensquare.qa.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: taibai
 * @date:2020/3/30
 */
@Entity
@Table(name = "tb_pl")
@Data
public class Pl implements Serializable {
    @Id
    private String problemid;

    @Id
    private String lableid;
}
