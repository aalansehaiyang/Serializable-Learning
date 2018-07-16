# Protocol Buffer 安装
---

1、下载 Protocol Buffer 安装包

下载地址：https://github.com/google/protobuf/releases/tag/v2.6.1


```
// 本文存放地址
/Users/onlyone/software/protobuf-2.6.1.tar.gz

//解压
tar zxvf protobuf-2.6.1.tar.gz

```

2、安装 HOMEBREW

https://github.com/aalansehaiyang/technology-talk/blob/master/other/tool.md

3、安装Protocol buffer

```
// 安装 Protocol Buffer 的依赖，autoconf、automake、libtool、curl
brew install autoconf automake libtool curl

cd /Users/onlyone/software/protobuf-2.6.1

// 运行 autogen.sh 脚本
./autogen.sh

// 运行 configure.sh 脚本
./configure


// 编译未编译的依赖包
 make

//检查依赖包是否完整
make check

// 安装
make install
```

4、检查 Protocol Buffer 是否安装成功

```
protoc --version
```

返回：libprotoc 2.6.1

