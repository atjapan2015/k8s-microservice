package com.microservice.school.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author atjapan2015
 * @since 2020-04-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("EMP")
public class Emp extends Model<Emp> {

    private static final long serialVersionUID = 1L;

    @TableId("EMPNO")
    private Integer empno;

    @TableField("ENAME")
    private String ename;

    @TableField("JOB")
    private String job;

    @TableField("MGR")
    private Integer mgr;

    @TableField("HIREDATE")
    private LocalDateTime hiredate;

    @TableField("SAL")
    private BigDecimal sal;

    @TableField("COMM")
    private BigDecimal comm;

    @TableField("DEPTNO")
    private Integer deptno;


    @Override
    protected Serializable pkVal() {
        return this.empno;
    }

}
