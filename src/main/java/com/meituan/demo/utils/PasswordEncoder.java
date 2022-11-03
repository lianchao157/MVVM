package com.meituan.demo.utils;

import org.springframework.util.DigestUtils;

/***
 * 对密码进行校验
 */
public class PasswordEncoder
{

    /**
     * 密码加密
     * @param rawPassword 登录时传入的密码
     */
    public static String encode(CharSequence rawPassword) {
        return DigestUtils.md5DigestAsHex(rawPassword.toString().getBytes());
    }

    /**
     * 密码对比
     * @param rawPassword 登录时传入的密码
     * @param encodedPassword 数据库保存的加密过的密码
     */
    public static boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(DigestUtils.md5DigestAsHex(rawPassword.toString().getBytes()));
    }
//    原文链接：https://blog.csdn.net/qq_42411805/article/details/124676309
}
