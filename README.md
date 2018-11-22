# demo-web-02 - Maven Java Web Project

## 配置工作空间
Project -> Build Automatically 取消勾选
Window -> Preferences -> General -> Workspace Text file encoding 修改为 UTF-8
Window -> Preferences -> Validation 取消 Allow projects..., 勾选 Suspend all validators
Window -> Open Perspective -> Java
Package Presentation -> Hierarchical
Top Level Elements -> Working Sets

## 创建项目
eclipse 创建Maven Java Web Project时候，需要使用骨架 maven-archetype-webapp
gav cn.lhl.core demo-web-02 1.0.0
修改pom.xml 使用文件管理器复制src 项目右键Refresh

## 配置项目
eclipse创建 3.0 Dynamic Web Project需要手动修改
项目目录\.settings\org.eclipse.wst.common.project.facet.core.xml
<?xml version="1.0" encoding="UTF-8"?>
<faceted-project>
  <fixed facet="wst.jsdt.web"/>
  <installed facet="jst.web" version="3.0"/>
  <installed facet="wst.jsdt.web" version="1.0"/>
  <installed facet="java" version="1.7"/>
</faceted-project>
项目右键 -> Properties -> Project Facets
项目右键 -> Properties -> Deployment Assembly
项目右键 -> Properties -> Web Project Settings
项目右键 -> Maven -> Update Project...
Project -> Clean... 只构建选中的项目

## 配置Maven
Window -> Preferences -> Maven
Installations 配置已安装的Maven并打勾
User Settings 确认本地仓库目录
项目右键 -> Run As -> Maven clean
项目右键 -> Run As -> Maven build...（Goals 输入 clean package）
项目右键 -> Run As -> Maven build
项目右键 -> Run As -> Run Configurations

## 配置Tomcat
Window -> Preferences -> Server -> Runtime Environments
用于创建tomcat环境，如创建一个tomcat7，D:\Java\tomcat7，JDK1.7
Window -> Show View -> Servers
用于配置多个tomcat实例，创建一个Server name:tomcat7，并把相关项目add and deploy

多个实例可以基于一个环境创建
如果有多个实例，则tmp0、tmp1、tmp2...
当前工作空间\.metadata\.plugins\org.eclipse.wst.server.core\tmp0
如果某个实例下有多个context或者项目，则
当前工作空间\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\项目

## 构建部署项目
clean 项目
clean tomcat

## 启动tomcat
http://127.0.0.1:8080/demo-web-02/view/testView.shtm
http://127.0.0.1:8080/demo-web-02/view/testView.shtm?id=2
http://127.0.0.1:8080/demo-web-02/view/testView.shtm?id=二
