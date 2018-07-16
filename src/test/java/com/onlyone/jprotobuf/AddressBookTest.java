package com.onlyone.jprotobuf;

import com.alibaba.fastjson.JSON;
import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AddressBookTest {

    @Test
    public void m1() {
        Codec<AddressBook> addressBookCodec = ProtobufProxy.create(AddressBook.class);

        Person p1 = new Person();
        p1.name = "Tom哥";
        p1.id = 101;
        p1.email = "aalansehaiyang52@126.com";
        p1.doubleF = 1.0;

        AddressBook addressBook = new AddressBook();
        addressBook.person = p1;

        List<Person> personList = new ArrayList<>();
        Person p2 = new Person();
        p2.name = "Tom哥2";
        p2.id = 102;
        p2.email = "aalansehaiyang52@126.com";
        p2.doubleF = 1.2;
        personList.add(p2);

        Person p3 = new Person();
        p3.name = "Tom哥3";
        p3.id = 103;
        p3.email = "aalansehaiyang52@126.com";
        p3.doubleF = 1.3;
        personList.add(p3);

        addressBook.personList = personList;

        byte[] bb = null;
        try {
            // 序列化
            bb = addressBookCodec.encode(addressBook);

            // 反序列化
            AddressBook addressBookAfter = addressBookCodec.decode(bb);
            // 打印结果
            System.out.println(JSON.toJSONString(addressBookAfter));
        } catch (Exception e) {
            // nodo
        }
    }
}
