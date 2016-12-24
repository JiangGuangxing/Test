package org.jgx.service.impl;

import org.jgx.bo.Veterinary;
import org.jgx.bo.ZhidaoQuestion;
import org.jgx.dao.VeterinaryMapper;
import org.jgx.dao.ZhidaoQuestionDao;
import org.jgx.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by JiangGuagnxing on 2016/12/17.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private ZhidaoQuestionDao zhidaoQuestionDao;
    @Resource
    private VeterinaryMapper veterinaryMapper;

    @Override
    public ZhidaoQuestion getZQById(Long userId) {
        // TODO Auto-generated method stub
        return this.zhidaoQuestionDao.selectByPrimaryKey(userId);
    }
    @Override
    public Veterinary getViById(Long userId) {
        // TODO Auto-generated method stub
        return this.veterinaryMapper.selectByPrimaryKey(userId);
    }
}

