package com.leimingtech.service.module.index.service;

import com.leimingtech.core.entity.base.Member;

/**
 * Created by rabook on 2015/3/27.
 */
public interface SignupService {

    public void saveSendEmail(Member member);

    public String updateSign(String userName,String code);
}
