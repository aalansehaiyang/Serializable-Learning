package com.onlyone.jprotobuf;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import java.util.List;

public class AddressBook {

    @Protobuf(fieldType = FieldType.OBJECT, order = 1, required = false)
    public Person       person;

    @Protobuf(fieldType = FieldType.OBJECT, order = 2, required = false)
    public List<Person> personList;

    @Protobuf(fieldType = FieldType.STRING, order = 3, required = false)
    public List<String> stringList;

}
