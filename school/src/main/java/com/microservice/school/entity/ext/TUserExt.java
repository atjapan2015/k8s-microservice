package com.microservice.school.entity.ext;

import com.baomidou.mybatisplus.annotation.*;
import com.microservice.school.entity.TUser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_USER")
public class TUserExt extends TUser {

    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(value = "UPDATE_TIME", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @Version
    @TableField("VERSION")
    private Long version;

    // @TableLogic
    @TableField("DELETED")
    private Integer deleted;
}
