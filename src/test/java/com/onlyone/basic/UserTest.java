package com.onlyone.basic;

import java.io.*;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class UserTest {

    @Test
    public void m1() {
        User user = new User();
        user.setName("Tom哥");
        user.setPwd("123456789");
        user.setDesc("测试用的，随便说");

        byte[] result = null;
        try {

            // 序列化
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bout);
            out.writeObject(user);
            result = bout.toByteArray();

            // 反序列化
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(result));
            User user_1 = (User) ois.readObject();

            // 打印结果
            System.out.println(JSON.toJSONString(user_1));

        } catch (Exception e) {
            // nodo
        }
    }
}
