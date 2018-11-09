##1：thymeleaf和jsp之争
springboot 推荐我们使用 thymeleaf 来做为动态页面,所以，当我们采用thymeleaf开发时，可以按照默认 
但是我们以往的经验来说，一般是采用jsp来作为动态页面的载体
若使用 jsp 则需要配置 前缀和后缀 并且关闭 thymeleaf
这两者在同一个项目中是无法共存的
```
  thymeleaf：
      templates：文件夹是视图模板
      static：静态文件
    jsp:
      按照以往经验 使用webapp文件夹
```
  本项目采用jsp来搭建，但是resources文件夹下任然遗留templates和static 来作为thymeleaf备忘
  
##web项目打包无法访问jsp
打包只能用1.4.2.RELEASE 版本的，其它版本的打包成jar都无法访问jsp。这个目前是springboot的bug。目前还未看到官方的解说。

 
  