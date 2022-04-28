package cn.medical.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Integer roleId;
    private String roleCode;
    private String roleName;
    private String description;
    private String createBy;
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date createTime;
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date updateTime;
    private Integer delFlag;
}