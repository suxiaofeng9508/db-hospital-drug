项目线上地址：http://hospital.letec.top

# 截图

![用户登录](screenshot/login.png)

![后台主页](screenshot/user_man.png)

# 环境


开发工具：IntelliJ IDEA

数据库：MySQL 5.7

JDK：1.8

构建工具：Maven

版本管理：Git

# 开始

- 使用 Git 将仓库 develop 分支克隆到本地，项目 url 为 https://你的用户名:密码@gitee.com/jameszbl/HospitalDrugSys.git
- 安装 JDK, Git for Windows
- 打开 IntelliJ IDEA，安装码云插件，拉取代码，教程见 http://git.mydoc.io/?t=153739
- 等待 build 完成
- 运行 me.zbl.HospitalApplication
- 浏览器访问 http://localhost:8086
- 系统登录：用户名 admin，密码 123456

# 开发

- 本地新建分支并命名为自己的名字
- 切换到新建分支
- 重要！重要！重要：一切修改都要在自己新建的分支上进行！！！
- 确认修改代码并测试无误后，提交并推送自己的分支到码云仓库
- 到码云上提交 pull request，源分支为自己的分支，目标分支为 develop，注明实现了哪些功能
- 码云插件使用教程见 教程见 http://git.mydoc.io/?t=153739

![数据库](screenshot/db.png)


# 其他

- 数据库 IP：47.93.187.44，端口 3306
- 数据库用户名：dev，密码：19961120，该用户目前权限有：SELECT, INSERT, UPDATE, DELETE, CREATE, ALTER, DROP
- 运行时使用的数据库在服务器上，因此必须在有网络的环境中调试运行
- IDEA 激活可以使用我的 License Server，地址：http://jetbrains.letec.top
- 药品管理系统用到的表前缀为：app_，其他前缀的表为项目必须，但系统非必须，无需修改
- 新增数据表以前缀 app_ 开头，避免与其他表表淆
- act_ 前缀的 25 个表为 druid 运行时自动生成的，可以忽略，系统框架用得到的表共 20 个
- 目前服务器上的数据库结构是我的设计，可以使用任意 GUI 工具（推荐使用 Navicat）查看、修改或新建表
- 系统使用的 ORM 框架为 MyBatis，可以使用 Spring Data JPA



# 可能有用的东西

- [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Spring Data JPA Guide](https://spring.io/guides/gs/accessing-data-jpa/)
- [码云平台帮助文档](http://git.mydoc.io/)