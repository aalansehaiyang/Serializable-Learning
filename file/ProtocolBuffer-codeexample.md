# Protocol Buffer 代码示例
---


#### 在Java中使用ProtocolBuffer的步骤：

* 编写.proto文件，定义消息结构

* 使用ProtocolBuffer的编译器，将.proto文件编译成对应的java文件

* 在Java代码中使用上一步编译好的java文件


#### 工程依赖

```
<dependency>
	<groupId>com.google.protobuf</groupId>
	<artifactId>protobuf-java</artifactId>
	<version>3.6.0</version>
</dependency>
```


```
cd /Users/onlyone/software/protobuf-2.6.1

// 编译.proto文件
protoc   --proto_path=/Users/onlyone/open-github/Serializable-Learning/src/main/java/com/onlyone/protobuffer/proto/  --java_out=/Users/onlyone/open-github/Serializable-Learning/src/main/java/   /Users/onlyone/open-github/Serializable-Learning/src/main/java/com/onlyone/protobuffer/proto/Person.proto

```

代码位置：com.onlyone.protobuffer.bean




#### 语法


* message  

它等同于java中的class关键字和c中的struct关键字。

* 限定符

在proto2.0版本中有三个限定符

```
- required  必要的域
- optional  可选的
- repeated  可重复的(0~N)
```

其中被required修饰的变量是必不可少的。 
optional可有可无。 
repeated修饰的就要是数组字段。

而在proto3.0中required被删掉了。optional字符也不能使用，因为默认的域都是optional属性。

* 3.0新语法

```
syntax = "proto3";
或者
syntax="proto2";

```
这个写在.proto文件中，用来指定使用proto3语法还是使用proto2语法。目前protobuffer继续支持proto2

* 数据类型


|protoc类型|	java类型|
|--|--|
|double|double|
|float|float|
|int32|int|
|int64|long|
|uint32|int|
|uint64|long|
|sint32|int|
|sint64|long|
|fixed32|int|
|fixed64|long|
|bool|boolean|
|string|String|
|bytes|ByteString|

最常用的就是float、int32、bool string bytes。

* 枚举

protocol buffer除了支持上面的基本类型外还支持枚举。 
关键字是enum

```
enum Sex
{
    MALE = 0;
    FEMALE = 1;
}

message Student
{
    int32 number = 1;
    string name = 2;
    Sex sex = 3;
    string hobby = 4;
    string skill = 5;
}
```
* 数组
* 引用另一个message
* 嵌套
* import关键字
* option之java_package
* option之java_outer_classname
* 编译命令

#### 更多语法

参考：https://blog.csdn.net/briblue/article/details/53187780

