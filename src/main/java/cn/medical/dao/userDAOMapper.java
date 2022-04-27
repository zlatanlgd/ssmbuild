package cn.medical.dao;

import cn.medical.pojo.userDAO;

public interface userDAOMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(userDAO record);

    int insertSelective(userDAO record);

    userDAO selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(userDAO record);

    int updateByPrimaryKey(userDAO record);
}