#### spring mvc 模板项目
##### 1.下载到本地磁盘
##### 2.修改pom.xml文件（这一步很重要，记事本打开即可）
>  `<artifactId>springmvc-tmeplate</artifactId>`改为自己项目名称eg:`<artifactId>OcTest</artifactId>`
>  `<finalName>springmvc-template</finalName>` 改为自己项目名称eg:`<finalName>OcTest</finalName>`
##### 3.进入项目目录，命令行`mvn idea:idea`或则`mvn eclipse:eclipse`转化为idea或则eclipse项目
##### 4.使用eclipse或则idea导入项目即可,导入的时候选择maven项目
##### 5.修改logback.xml文件中的log地址，需要自己改到本机地址
##### 6.项目运行，我个人使用的是tomcat配置虚拟目录到./springmvc-tmeplate/target/springmvc-template下，这个可以按照个人喜好运行即可
