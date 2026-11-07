# 用户信息管理系统 (User CRUD System)

本项目是一个基于 Spring Boot 的个人全栈实战项目，实现了完整的用户信息增删改查（CRUD）功能，旨在巩固 Java 后端核心生态与前后端联调能力。

##  技术栈
*   **后端**：Java 22, Spring Boot 3.x, MyBatis
*   **数据库**：MySQL 8.0
*   **前端**：原生 HTML + JavaScript (Fetch API)
*   **工具**：Maven, Git, Postman

## 核心功能与技术亮点
*   **完整 CRUD**：实现用户信息的增、删、改、查，前后端通过 JSON 格式交互。
*   **IoC/DI**：使用 Spring 容器管理 Controller、Service、Mapper 之间的依赖注入，降低代码耦合度。
*   **AOP 切面**：利用 Spring AOP 编写自定义切面，统一拦截 Controller 层请求，实现接口调用日志记录。
*   **数据持久化**：整合 MyBatis 与 MySQL，完成数据的持久化操作，使用 `#{}` 预编译防止 SQL 注入。

##  快速启动指南
1. 在 MySQL 中执行根目录下的 `schema.sql` 文件初始化数据库。
2. 将 `src/main/resources` 目录下的 `application-example.yml` 中填入你自己的数据库账号和密码
3. 运行 `org.example.Main` 类启动项目。
4. 打开浏览器访问 `http://localhost:8081/` 即可体验。
