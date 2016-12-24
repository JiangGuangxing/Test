package org.jgx.dao;

import org.jgx.bo.Veterinary;

public interface VeterinaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Veterinary record);

    int insertSelective(Veterinary record);

    Veterinary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Veterinary record);

    int updateByPrimaryKey(Veterinary record);
}