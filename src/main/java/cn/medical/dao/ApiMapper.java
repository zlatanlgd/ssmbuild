package cn.medical.dao;

import cn.medical.pojo.Api;

public interface ApiMapper {
    int deleteByPrimaryKey(Integer apiId);

    int insert(Api record);

    int insertSelective(Api record);

    Api selectByPrimaryKey(Integer apiId);

    int updateByPrimaryKeySelective(Api record);

    int updateByPrimaryKey(Api record);
}