<h1 align="center"><img src="https://s4.ax1x.com/2021/12/05/orPOnU.png"  alt="naaf-logo" /></h1>

# naaf-init

<a href="https://github.com/feiniaojin/naaf-init/blob/main/LICENSE">![](https://img.shields.io/github/license/feiniaojin/naaf-init)</a> <a href="https://github.com/feiniaojin/naaf-init/issues"> ![](https://img.shields.io/github/issues/feiniaojin/naaf-init)</a>

naaf的项目初始化archetype

[![o7o000.png](https://s4.ax1x.com/2021/12/11/o7o000.png)](https://imgtu.com/i/o7o000)

# 快速入门

## 第一步
在本项目根路径下，执行
```shell
mvn archetype:create-from-project
```
创建一个archetype

## 第二步
第一步执行完成后，到
```
target/generated-sources/archetype
```
目录下，执行
```shell
nvm install
```
此时archetype已经安装到本地
## 第三步
执行
```shell
mvn archetype:crawl
```
更新本地catalog file
## 第四步
IDEA创建项目，选择**create from archetype**，勾选我们创建好的archetype，输入GAV，即可完成项目创建。
