package com.example.bootwebflux.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName collect
 */
@TableName(value ="collect")
@Data
public class Collect implements Serializable {
    private Integer cId;

    private Long uId;

    private Integer bId;

    private Integer cIsBeenDelete;

    private Integer cVersion;

    private static final long serialVersionUID = 1L;
}