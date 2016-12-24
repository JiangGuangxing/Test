package org.jgx.dao;

import org.jgx.bo.ZhidaoQuestion;

public interface ZhidaoQuestionDao {
    int deleteByPrimaryKey(Long id);

    int insert(ZhidaoQuestion record);

    int insertSelective(ZhidaoQuestion record);

    ZhidaoQuestion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZhidaoQuestion record);

    int updateByPrimaryKey(ZhidaoQuestion record);
}