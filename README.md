# Manulife Spring Boot 应用程序

这是一个使用 Maven 构建的 Spring Boot 应用程序。

## 项目结构

```
sg-manutouch-bff-service/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── manulife/
│   │   │           ├── ManulifeApplication.java      # 主应用类
│   │   │           └── controller/
│   │   │               └── HelloController.java      # 示例控制器
│   │   └── resources/
│   │       ├── application.properties                # 应用配置
│   │       └── application.yml                       # 应用配置(YAML格式)
│   └── test/
│       └── java/
│           └── com/
│               └── manulife/
│                   ├── ManulifeApplicationTests.java # 应用测试
│                   └── controller/
│                       └── HelloControllerTests.java # 控制器测试
├── pom.xml                                           # Maven配置文件
└── README.md                                         # 项目说明
```

## 技术栈

- **Spring Boot 3.2.0**
- **Java 17**
- **Maven** - 依赖管理
- **Spring Web** - REST API
- **Spring Boot Actuator** - 监控和健康检查
- **Lombok** - 减少样板代码
- **JUnit 5** - 单元测试

## 快速开始

### 前置要求

- JDK 17 或更高版本
- Maven 3.6 或更高版本

### 构建项目

```bash
mvn clean install
```

### 运行应用程序

```bash
mvn spring-boot:run
```

或者构建后运行 JAR 文件：

```bash
mvn clean package
java -jar target/manulife-app-1.0.0-SNAPSHOT.jar
```

### 运行测试

```bash
mvn test
```

## API 端点

应用程序运行后，可以访问以下端点：

- **Hello API**: http://localhost:8080/api/hello
- **Hello with Name**: http://localhost:8080/api/hello?name=YourName
- **Info API**: http://localhost:8080/api/info
- **Health Check**: http://localhost:8080/actuator/health
- **Application Info**: http://localhost:8080/actuator/info

## 配置

应用程序配置位于 `src/main/resources/application.properties`。

主要配置项：
- `server.port`: 服务器端口（默认：8080）
- `spring.application.name`: 应用程序名称
- `logging.level.*`: 日志级别配置

## 开发

### 添加新的依赖

在 `pom.xml` 文件的 `<dependencies>` 部分添加新的依赖，然后运行：

```bash
mvn clean install
```

### 热重载

项目已包含 Spring Boot DevTools，支持代码修改后自动重启应用程序。

## 许可证

此项目为内部使用项目。

