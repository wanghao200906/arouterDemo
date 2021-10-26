package org.devio.as.hi.hi_arouter;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;

import org.devio.as.hi.module_trade.ILoginService;

@Route(path = "/service/login")
public class LoginServiceImpl implements ILoginService {
    @Override
    public void login() {

    }

    @Override
    public void init(Context context) {

    }
}
