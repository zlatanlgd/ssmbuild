package cn.medical.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.text.Format;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userId;
    private String username;
    private String passwordHash;
    private String cellphone;
    private String createBy;
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date createTime;
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date updateTime;
    private Integer status;
    private Integer delFlag;
}