# gradle-project-seed

使用该种子工程快速创建一个gralde工程。

解决问题：

1. 不需要事先准备gradle环境；
2. 统一各个工程的gradle版本；
3. 避免对每个新建的gradle工程重复配置

## 优化

相对使用gradle init方法初始化，种子工程的差异：

1. 指定Gradle使用UTF-8编码

gradlew.bat

```diff
-set DEFAULT_JVM_OPTS="-Xmx64m"
+set DEFAULT_JVM_OPTS="-Xmx64m -Dfile.encoding=UTF-8"
```

gradlew

```diff
-DEFAULT_JVM_OPTS='"-Xmx64m"'
+DEFAULT_JVM_OPTS='"-Xmx64m -Dfile.encoding=UTF-8"'
```

2. 指定Java编译使用UTF-8编码

build.gradle

```diff
+tasks.withType(JavaCompile) {
+  options.encoding = 'UTF-8'
+}
```

3. 指定Java文档生成使用UTF-8编码

build.gradle

```diff
+tasks.withType(Javadoc) {
+    options.encoding = 'UTF-8'
+}
```

4. 多个预置种子模块

settings.gradle

```diff
+include 'platform', 'api', 'core', 'cli', 'rpc', 'rpc-sdk', 'server', 'webgui'
```

各模块说明

| 种子模块 | 说明                                               |
| -------- | -------------------------------------------------- |
| platform | bills of materials，包含工程所需的所有第三方依赖。 |
| core     | 接口定义和公共代码示例                             |
| api      | 接口实现示例                                       |
| cli      | 命令行工具示例                                     |
| rpc      | RPC服务端示例                                      |
| rpc-sdk  | RPC客户端示例                                      |
| server   | 应用服务端示例                                     |
| webgui   | 应用Web端示例                                      |

## 其他建议

建议配置环境变量`JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF-8`使JAVA默认使用UTF-8编码。
