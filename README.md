# 常见的序列化方式
---

## 一、Protocol Buffer

`Protocol Buffers(也称protobuf)是Google公司设计的一种独立于开发语言，独立于平台的可扩展的结构化数据序列机制。通俗点来讲它跟xml和json是一类。是一种数据交互格式协议。`

`protocol buffer的使用还是相对简单点，唯一麻烦的就是多了一个预编译的过程，将.proto文件转换成.java文件。`


* [软件安装](file/ProtocolBuffer-setup.md)
* [代码示例](file/ProtocolBuffer-codeexample.md)
* [为什么Protocol Buffer性能这么好？](https://blog.csdn.net/carson_ho/article/details/70568606)
* [ Protocol Buffer 语法详解](https://blog.csdn.net/carson_ho/article/details/ 70267574)

#### jprotobuf

`jprotobuf是百度针对Java程序开发一套简易类库，目的是简化Protocol Buffer类库的使用。`

* [代码示例](file/jprotobuf-codeexample.md)


## 二、fastJson

`fastjson 是由阿里巴巴开发的一个性能很好的Java 语言实现的 Json解析器和生成器。特点：速度快，测试表明fastjson具有极快的性能，超越任其他的java json parser。功能强大，完全支持java bean、集合、Map、日期、Enum，支持范型和自省。无依赖，能够直接运行在Java SE 5.0以上版本 
，支持Android。使用时候需引入FastJson第三方jar包`

* [文档说明](https://github.com/aalansehaiyang/technology-talk/blob/master/open-source-framework/fastJson.md)


## 三、Java原生序列化

`Java原生序列化方法即通过Java原生流(InputStream和OutputStream之间的转化)的方式进行转化。`

`需要注意的是JavaBean实体类必须实现Serializable接口，否则无法序列化。`

代码位置：com.onlyone.basic.UserTest


## 四、hessian

`着重数据的序列化，简单类型信息会直接附带；复杂类型序列化成Map，包含基本类型描述和数据内容。而在序列化过程中，如果一个对象之前出现过，hessian会直接插入一个R index这样的块来表示一个引用位置，从而省去再次序列化和反序列化的时间。这样做的代价就是hessian需要对不同的类型进行不同的处理，而且遇到某些特殊对象还要做特殊的处理。而且同时因为并没有深入到实现内部去进行序列化，所以在某些场合会发生一定的不一致，比如通过Collections.synchronizedMap得到的map。`

pom依赖：

```
<dependency>
	<groupId>com.caucho</groupId>
	<artifactId>hessian</artifactId>
	<version>4.0.51</version>
</dependency>
```

代码位置：com.onlyone.hessian.PeopleTest





## 性能压测

https://github.com/eishay/jvm-serializers/wiki