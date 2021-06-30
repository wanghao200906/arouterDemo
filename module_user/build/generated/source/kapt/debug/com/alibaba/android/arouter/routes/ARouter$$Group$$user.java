package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.devio.as.hi.module_user.ProfileActivity;
import org.devio.as.hi.module_user.ProfileFragment;

/**
 * DO NOT EDIT THIS FILE!!! IT WAS GENERATED BY AROUTER. */
public class ARouter$$Group$$user implements IRouteGroup {
  @Override
  public void loadInto(Map<String, RouteMeta> atlas) {
    atlas.put("/user/profile/activity", RouteMeta.build(RouteType.ACTIVITY, ProfileActivity.class, "/user/profile/activity", "user", null, -1, -2147483648));
    atlas.put("/user/profile/fragment", RouteMeta.build(RouteType.FRAGMENT, ProfileFragment.class, "/user/profile/fragment", "user", null, -1, -2147483648));
  }
}