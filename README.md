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

## 其他建议

建议配置环境变量`JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF-8`使JAVA默认使用UTF-8编码。
