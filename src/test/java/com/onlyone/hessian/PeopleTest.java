package com.onlyone.hessian;

import com.alibaba.fastjson.JSON;
import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class PeopleTest {

    @Test
    public void m1() {

        People p = new People();
        p.setName("Tom哥");
        p.setPwd("123456");
        p.setDesc("随便打点字");

        byte[] result = null;
        try {
            // 序列化
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            HessianOutput ho = new HessianOutput(os);
            ho.writeObject(p);
            result = os.toByteArray();

            // 反序列化
            ByteArrayInputStream is = new ByteArrayInputStream(result);
            HessianInput hi = new HessianInput(is);
            People p2 = (People) hi.readObject();

            // 打印结果
            System.out.println(JSON.toJSONString(p2));

        } catch (IOException e) {
        }

    }
}
