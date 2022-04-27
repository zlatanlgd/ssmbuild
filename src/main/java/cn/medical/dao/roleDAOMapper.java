package cn.medical.dao;

import cn.medical.pojo.roleDAO;

public interface roleDAOMapper {
    int deleteByPrimaryKey(Integer apiId);

    int insert(roleDAO record);

    int insertSelective(roleDAO record);

    roleDAO selectByPrimaryKey(Integer apiId);

    int updateByPrimaryKeySelective(roleDAO record);

    int updateByPrimaryKey(roleDAO record);
}