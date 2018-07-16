package com.onlyone.protobuffer;

import static com.onlyone.protobuffer.bean.PersonBean.Person;

import org.junit.Test;

public class PersonTest {

    /**
     * 测试序列化与反序列化
     */
    @Test
    public void m1() {
        // 序列化
        Person person1 = Person.newBuilder().setName("Tom哥").setAge(29).setGender("男").build();
        System.out.println(person1.toString());
        byte[] personBytes = person1.toByteArray();

        // 大家注意这个toByteArray()产生的byte[]数组，它代表要全部传输的二进制数据，大家可以打印它的大小，
        // 有心人可以用json实现两样的信息，然后打印json序列化后的数据长度做比较。
        // 看看，protocol buffre是不是更节省内存空间

        // 反序列化
        try {
            Person person2 = Person.parseFrom(personBytes);
            System.out.println(person2.getName());
            System.out.println(person2.getAge());
        } catch (Exception e) {
            // nodo
        }

    }
}
