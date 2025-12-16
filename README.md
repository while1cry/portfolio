# Portfolio

> while1cry 的个人作品集网站

这是一个全栈个人作品集项目，用于展示个人信息、作品、动态和创意内容。项目采用前后端分离架构，提供了完整的内容管理和展示功能。

---

> [!WARNING]
> **🚧 活跃开发中**  
> 本项目正处于活跃开发阶段，功能和 API 可能会频繁变更。该项目当前完全无法使用。

---

## ✨ 功能特性

- 🏠 **个人主页** - 展示个人简介、技能和联系方式
- 📝 **动态发布** - 分享个人想法、文章和项目更新
- 💬 **留言互动** - 访客留言与互动功能
- 🖼️ **画廊展示** - 个人摄影作品集、返图自取
- 🎨 **壁纸分享** - 进入壁纸模式，专注眼下吧

## 🏗️ 项目结构

```
portfolio/
├── frontend/         # 前端模块
│   └── ...
├── backend/          # 后端模块
│   └── ...
├── LICENSE           # 开源协议
└── README.md         # 项目说明
```

## 🛠️ 技术栈

### 前端
- **框架**: Vue 3
- **语言**: TypeScript
- **构建工具**: Vite
- **包管理**: pnpm

### 后端
- **框架**: Spring Boot
- **语言**: Java
- **数据库**: MySQL

## 🚀 快速开始

### 前端开发

```bash
# 进入前端目录
cd frontend

# 安装依赖
pnpm install

# 启动开发服务器
pnpm run dev

# 构建生产版本
pnpm run build
```

### 后端开发

```bash
# 进入后端目录
cd backend

# 使用 Gradle 启动
./gradlew bootRun
```

## 📦 部署

### 前端部署
构建后的静态文件位于 `frontend/dist` 目录，可部署到任何静态文件服务器。

### 后端部署
打包为 JAR 文件后，使用以下命令运行：
```bash
java -jar backend/target/portfolio-backend.jar
```

## 📄 开源协议

本项目采用 [MIT License](LICENSE) 开源协议。

## 🤝 贡献

欢迎提交 Issue 和 Pull Request！

## 📮 联系方式

如有任何问题或建议，欢迎通过以下方式联系：

- 提交 [Issue](../../issues)
- 发起 [Pull Request](../../pulls)

---

**Made with ❤️ by while1cry**
