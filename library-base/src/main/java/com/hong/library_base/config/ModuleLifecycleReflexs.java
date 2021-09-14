package com.hong.library_base.config;

/**
 * Created by goldze on 2018/6/21 0021.
 * 组件生命周期反射类名管理，在这里注册需要初始化的组件，通过反射动态调用各个组件的初始化方法
 * 注意：以下模块中初始化的Module类不能被混淆
 */

public class ModuleLifecycleReflexs {
    private static final String BaseInit = "com.hong.module_home.HomeModuleInit";
    //主业务模块
    private static final String MainInit = "com.hong.module_main.MainModuleInit";
    //登录验证模块
    private static final String SignInit = "com.hong.module_msg.MsgModuleInit";
    //首页业务模块
    private static final String HomeInit = "com.hong.module_home.HomeModuleInit";
    //工作业务模块
    private static final String WorkInit = "com.hong.module_work.WorkModuleInit";
    //消息业务模块
    private static final String MsgInit = "com.hong.module_msg.MsgModuleInit";
    //用户业务模块
    private static final String UserInit = "com.hong.module_user.UserModuleInit";

    public static String[] initModuleNames = {BaseInit, MainInit,SignInit, HomeInit, WorkInit, MsgInit,UserInit};
}
