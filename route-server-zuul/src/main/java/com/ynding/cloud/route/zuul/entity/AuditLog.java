package com.ynding.cloud.route.zuul.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p> 审计日志</p>
 *
 * @author dyn
 * @version 2020/9/27
 * @since JDK 1.8
 */
@Table(name = "audit_log")
@Data
@Entity
@ApiModel(value = "AuditLog", description = "审计日志")
public class AuditLog {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @ApiModelProperty(name = "id", notes = "ID", dataType = "long")
    private Long id;

    @ApiModelProperty(name = "username", notes = "用户名", dataType = "string")
    @Column(name = "username")
    private String username;

    @ApiModelProperty(name = "path", notes = "路径", dataType = "string")
    @Column(name = "path")
    private String path;

    @ApiModelProperty(name = "method", notes = "方法", dataType = "string")
    @Column(name = "method")
    private String method;

    @ApiModelProperty(name = "status", notes = "状态", dataType = "int")
    @Column(name = "status")
    private int status;

    @ApiModelProperty(name = "createTime", notes = "创建时间", dataType = "date")
    @Column(name = "create_time")
    private Date createTime;

    @ApiModelProperty(name = "updateTime", notes = "修改时间", dataType = "date")
    @Column(name = "update_time")
    private Date updateTime;
}
