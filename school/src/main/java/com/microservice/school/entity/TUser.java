package com.microservice.school.entity;

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
 * @since 2020-04-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_USER")
public class TUser extends Model<TUser> {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Long id;

    @TableField("NAME")
    private String name;

    @TableField("AGE")
    private Long age;

    @TableField("EMAIL")
    private String email;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    @TableField("VERSION")
    private Long version;

    @TableField("DELETED")
    private Integer deleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
