package org.jgx.service;

import org.jgx.bo.Veterinary;
import org.jgx.bo.ZhidaoQuestion;

/**
 * Created by JiangGuagnxing on 2016/12/17.
 */
public interface UserService {

    ZhidaoQuestion getZQById(Long userId);

    Veterinary getViById(Long userId);
}
