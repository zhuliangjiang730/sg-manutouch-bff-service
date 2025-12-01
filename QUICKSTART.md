# Manulife Spring Boot 项目 - 快速指南

## 项目概述

这是一个使用 Spring Boot 3.2.0 和 Maven 构建的企业级 Java 应用程序。

## 项目结构说明

```
sg-manutouch-bff-service/
├── pom.xml                              # Maven 项目配置文件
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/manulife/
│   │   │       ├── ManulifeApplication.java      # 应用程序入口
│   │   │       └── controller/
│   │   │           └── HelloController.java      # REST API 控制器示例
│   │   └── resources/
│   │       ├── application.properties            # 应用程序配置文件
│   │       └── application.yml                   # 可选的 YAML 配置
│   └── test/
│       └── java/
│           └── com/manulife/
│               ├── ManulifeApplicationTests.java # 主测试类
│               └── controller/
│                   └── HelloControllerTests.java # 控制器测试
├── README.md                            # 英文说明文档
└── QUICKSTART.md                        # 本文件
```

## 技术栈

- **Java 17+**: 编程语言
- **Spring Boot 3.2.0**: 应用框架
- **Maven**: 依赖管理和构建工具
- **Spring Web**: 用于构建 REST API
- **Spring Boot Actuator**: 应用监控和健康检查
- **Lombok**: 简化 Java 代码
- **JUnit 5**: 单元测试框架

## 常用 Maven 命令

### 1. 清理并编译项目
```bash
mvn clean compile
```

### 2. 运行测试
```bash
mvn test
```

### 3. 打包项目
```bash
mvn clean package
```
生成的 JAR 文件位于: `target/manulife-app-1.0.0-SNAPSHOT.jar`

### 4. 运行应用程序
```bash
mvn spring-boot:run
```

### 5. 安装到本地 Maven 仓库
```bash
mvn clean install
```

## 运行应用程序

### 方式一：使用 Maven 插件（推荐开发时使用）
```bash
mvn spring-boot:run
```

### 方式二：运行打包后的 JAR 文件
```bash
# 先打包
mvn clean package

# 运行
java -jar target/manulife-app-1.0.0-SNAPSHOT.jar
```

## 测试 API

应用启动后（默认端口：8080），可以使用浏览器或 curl 测试以下端点：

### 1. Hello API
```bash
# 浏览器访问
http://localhost:8080/api/hello

# 或使用 curl
curl http://localhost:8080/api/hello
# 返回: Hello, World!
```

### 2. 带参数的 Hello API
```bash
curl http://localhost:8080/api/hello?name=张三
# 返回: Hello, 张三!
```

### 3. 应用信息
```bash
curl http://localhost:8080/api/info
# 返回: Manulife Spring Boot Application - Version 1.0.0
```

### 4. 健康检查（Actuator）
```bash
curl http://localhost:8080/actuator/health
# 返回应用健康状态
```

## 配置说明

主要配置文件：`src/main/resources/application.properties`

```properties
# 应用名称
spring.application.name=manulife-app

# 服务器端口（默认 8080）
server.port=8080

# 日志级别
logging.level.root=INFO
logging.level.com.manulife=DEBUG

# Actuator 端点配置
management.endpoints.web.exposure.include=health,info
```

## 添加新的依赖

在 `pom.xml` 文件中的 `<dependencies>` 标签内添加依赖，例如：

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

添加后运行：
```bash
mvn clean install
```

## 开发建议

### 1. 创建新的 Controller
在 `src/main/java/com/manulife/controller/` 目录下创建新的控制器类：

```java
@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @GetMapping
    public List<User> getAllUsers() {
        // 实现逻辑
    }
}
```

### 2. 创建 Service 层
在 `src/main/java/com/manulife/service/` 目录下创建服务类：

```java
@Service
public class UserService {
    // 业务逻辑
}
```

### 3. 创建数据模型
在 `src/main/java/com/manulife/model/` 或 `entity/` 目录下创建实体类。

## 常见问题

### 1. 端口被占用
修改 `application.properties` 中的 `server.port` 为其他端口号。

### 2. 编译错误
确保 Java 版本为 17 或更高：
```bash
java -version
```

### 3. 依赖下载失败
检查网络连接，Maven 会自动从配置的镜像源下载依赖。

## IDE 支持

### IntelliJ IDEA
1. 直接打开项目目录
2. IDEA 会自动识别为 Maven 项目
3. 等待依赖下载完成

### Eclipse
1. File -> Import -> Existing Maven Projects
2. 选择项目目录
3. 完成导入

### VS Code
1. 安装 Java Extension Pack
2. 安装 Spring Boot Extension Pack
3. 打开项目目录

## 下一步

1. ✅ 项目已成功创建并通过测试
2. 📝 根据需求添加业务逻辑
3. 🗄️ 集成数据库（如需要）
4. 🔐 添加安全认证（如需要）
5. 📊 集成更多监控和日志功能

## 获取帮助

- [Spring Boot 官方文档](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Spring Boot 中文文档](https://springdoc.cn/spring-boot/)
- [Maven 官方文档](https://maven.apache.org/guides/)

## 项目状态

✅ 项目创建完成
✅ 编译成功
✅ 所有测试通过（4/4）
✅ 可以正常运行

祝开发顺利！🚀

