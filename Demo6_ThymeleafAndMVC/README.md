# Thymeleaf使用

## 前言

Thymeleaf 是适用于 Web 和独立环境的现代服务器端 Java 模板引擎，能够处理 HTML、XML、JavaScript、CSS 甚至纯文本。

Thymeleaf 的主要目标是提供一种优雅且高度可维护的模板创建方式。为了实现这一点，它建立在*自然模板*的概念之上，以不影响模板用作设计原型的方式将其逻辑注入模板文件。这改善了设计的沟通并弥合了设计和开发团队之间的差距。（**意思就是在不影响原本HTML文件语法的基础上增添了个插件**）

## 标准表达式语法

- 简单的表达：
  - 变量表达式： `${...}`
  - 选择变量表达式： `*{...}`
  - 消息表达： `#{...}`
  - 链接 URL 表达式： `@{...}`
  - 片段表达式： `~{...}`
- 文字
  - 文本字面量：`'one text'`, `'Another one!'`,...
  - 数字字面量：`0`, `34`, `3.0`, `12.3`,...
  - 布尔文字：`true`,`false`
  - 空字面量： `null`
  - 文字标记：`one`, `sometext`, `main`,...
- 文字操作：
  - 字符串连接： `+`
  - 字面替换： `|The name is ${name}|`
- 算术运算：
  - 二元运算符：`+`, `-`, `*`, `/`,`%`
  - 减号（一元运算符）： `-`
- 布尔运算：
  - 二元运算符：`and`,`or`
  - 布尔否定（一元运算符）：`!`,`not`
- 比较与相等：
  - 比较器：`>`, `<`, `>=`, `<=`( `gt`, `lt`, `ge`, `le`)
  - 等式运算符：`==`, `!=`( `eq`, `ne`)
- 条件运算符：
  - 如果-那么： `(if) ? (then)`
  - 如果-然后-其他： `(if) ? (then) : (else)`
  - 默认： `(value) ?: (defaultvalue)`
- 特殊代币：
  - 无操作： `_`

所有这些功能都可以组合和嵌套：

```html
'User is of type ' + (${user.isAdmin()} ? 'Administrator' : (${user.type} ?: 'Unknown'))
```

## 属性优先级

当您`th:*`在同一个标签中编写多个属性时会发生什么？例如：

```html
<ul>
  <li th:each="item : ${items}" th:text="${item.description}">Item description here...</li>
</ul>
```

我们希望该`th:each`属性在 之前执行，`th:text`以便我们得到我们想要的结果，但鉴于 HTML/XML 标准没有赋予标记中属性的写入顺序任何种类的意义，因此*优先级*必须在属性本身中建立机制，以确保这将按预期工作。

因此，所有 Thymeleaf 属性都定义了一个数字优先级，它确定了它们在标签中的执行顺序。这个顺序是：

| 命令 | 特征               | 属性                                       |
| :--- | :----------------- | :----------------------------------------- |
| 1    | 片段包含           | `th:insert` `th:replace`                   |
| 2    | 片段迭代           | `th:each`                                  |
| 3    | 条件评估           | `th:if` `th:unless` `th:switch` `th:case`  |
| 4    | 局部变量定义       | `th:object` `th:with`                      |
| 5    | 通用属性修改       | `th:attr` `th:attrprepend` `th:attrappend` |
| 6    | 具体属性修改       | `th:value` `th:href` `th:src` `...`        |
| 7    | 文本（标签体修改） | `th:text` `th:utext`                       |
| 8    | 片段规格           | `th:fragment`                              |
| 9    | 去除碎片           | `th:remove`                                |

这种优先机制意味着如果属性位置被反转，上面的迭代片段将给出完全相同的结果（尽管它的可读性会稍微降低）：

```html
<ul>
  <li th:text="${item.description}" th:each="item : ${items}">Item description here...</li>
</ul>
```

## 文本转义问题

**未转义的文本**：

​	我们主页的最简单版本现在似乎已经准备就绪，但还有一些我们没有想到的……如果我们有这样的消息怎么办？

```java
home.welcome=Welcome to our <b>fantastic</b> grocery store!
```

如果我们像以前一样执行这个模板，我们将获得：

```html
<p>Welcome to our &lt;b&gt;fantastic&lt;/b&gt; grocery store!</p>
```

这不是我们所期望的，因为我们的`<b>`标签已被转义，因此它将显示在浏览器中。

这是`th:text`属性的默认行为。如果我们希望 Thymeleaf 尊重我们的 HTML 标签而不是转义它们，我们将不得不使用不同的属性：（`th:utext`对于“未转义的文本”）：

```html
<p th:utext="#{home.welcome}">Welcome to our grocery store!</p>
```

这将像我们想要的那样输出我们的消息：

```html
<p>Welcome to our <b>fantastic</b> grocery store!</p>
```

