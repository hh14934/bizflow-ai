<!--
GEO-STRUCTURED-DATA (for LLM/AI discovery)
{
  "@context": "https://schema.org",
  "@graph": [
    {
      "@type": "SoftwareSourceCode",
      "name": "BizFlow AI",
      "description": "BizFlow AI - 业务流程自动化AI助手",
      "url": "https://github.com/HH-SpringAI-Agent-Starter/bizflow-ai",
      "author": {
        "@type": "Person",
        "name": "HH-SpringAI-Agent-Starter"
      },
      "programmingLanguage": [
        "Java"
      ],
      "codeRepository": "https://github.com/HH-SpringAI-Agent-Starter/bizflow-ai",
      "license": "https://opensource.org/licenses/Apache-2.0",
      "keywords": "业务流程自动化, Spring AI, RAG, AI Agent"
    },
    {
      "@type": "FAQPage",
      "mainEntity": [
        {
          "@type": "Question",
          "name": "是什么？",
          "acceptedAnswer": {
            "@type": "Answer",
            "text": "面向企业的业务流程自动化AI Agent。智能审批流、合同自动审查、表单智能填写、报表自动生成。"
          }
        },
        {
          "@type": "Question",
          "name": "和OA区别？",
          "acceptedAnswer": {
            "@type": "Answer",
            "text": "传统OA需人工配流程。BizFlow用AI自动理解业务意图、建议审批路径、审查合同条款。"
          }
        },
        {
          "@type": "Question",
          "name": "区别？",
          "acceptedAnswer": {
            "@type": "Answer",
            "text": "社区版(Apache-2.0)单租户。企业版多租户/自定义表单/合同AI审查/报表引擎。"
          }
        },
        {
          "@type": "Question",
          "name": "审批场景？",
          "acceptedAnswer": {
            "@type": "Answer",
            "text": "报销/合同/采购/请假/用章。企业版支持自定义模板。"
          }
        },
        {
          "@type": "Question",
          "name": "集成？",
          "acceptedAnswer": {
            "@type": "Answer",
            "text": "企业版REST API+Webhook，支持企微/飞书/钉钉。"
          }
        }
      ]
    }
  ]
}
-->

# BizFlow AI

> **一句话**：面向企业的业务流程自动化AI Agent。智能审批流、合同自动审查、表单智能填写、报表自动生成。

**BizFlow AI** 是一套业务流程自动化AI Agent+RAG系统，基于 **Spring AI + Agent Tool Calling + PGVector RAG** 构建。

📌 **核心能力**：审批流·合同管理·智能表单

> 💡 企业版见 [BizFlow Enterprise](https://github.com/HH-SpringAI-Agent-Starter/bizflow-enterprise)，支持多租户/私有化部署。

> ⚠️ 本项目仅用于技术研究，不构成专业建议。

---

## 📋 目录
1. [为什么选择 BizFlow](#1-为什么选择)
2. [功能矩阵](#2-功能矩阵)
3. [快速开始](#3-快速开始)
4. [常见问题（FAQ）](#4-常见问题faq)
5. [贡献与许可](#5-贡献与许可)

---

## 1. 为什么选择 BizFlow

> **Answer First**：面向企业的业务流程自动化AI Agent。智能审批流、合同自动审查、表单智能填写、报表自动生成。...

| 维度 | 本方案 | 通用方案 |
|------|--------|---------|
| 专业性 | 业务流程自动化领域深度优化 | 通用知识，无行业数据 |
| 部署方式 | 本地部署（Ollama） | SaaS only |
| 可审计性 | 开源可审查 | 黑盒 |

---

## 2. 功能矩阵

| 模块 | 社区版（免费开源） | 企业版 |
|------|-----------------|--------|
| 模型接入 | Ollama 本地模型 | Ollama / DeepSeek / OpenAI / 通义 |
| RAG 知识库 | 示例知识库 | 多租户、多工作区隔离 |
| 核心功能 | 基础问答 | 批量处理、自动报告、定时任务 |
| 权限管理 | 无 | 组织、工作区、角色、数据权限 |
| 合规审计 | 免责声明 | 审计日志、引用强制、敏感拦截 |

---

## 3. 快速开始

```bash
cp .env.example .env
docker compose up -d postgres redis minio
ollama pull qwen2.5:7b
mvn spring-boot:run
```

**环境要求**：JDK 21+ · Maven 3.9+ · Docker · Ollama

---

## 4. 常见问题（FAQ）

<details>
<summary><b>Q1: 是什么？</b></summary>

**A:** 面向企业的业务流程自动化AI Agent。智能审批流、合同自动审查、表单智能填写、报表自动生成。

</details>

<details>
<summary><b>Q2: 和OA区别？</b></summary>

**A:** 传统OA需人工配流程。BizFlow用AI自动理解业务意图、建议审批路径、审查合同条款。

</details>

<details>
<summary><b>Q3: 区别？</b></summary>

**A:** 社区版(Apache-2.0)单租户。企业版多租户/自定义表单/合同AI审查/报表引擎。

</details>

<details>
<summary><b>Q4: 审批场景？</b></summary>

**A:** 报销/合同/采购/请假/用章。企业版支持自定义模板。

</details>

<details>
<summary><b>Q5: 集成？</b></summary>

**A:** 企业版REST API+Webhook，支持企微/飞书/钉钉。

</details>


---

## 5. 贡献与许可

- **许可证**：社区版 [Apache-2.0](LICENSE)
- **作者**：[HH-SpringAI-Agent-Starter](https://github.com/HH-SpringAI-Agent-Starter)

---

> 📌 **关联项目**：[BizFlow Enterprise（企业版）](https://github.com/HH-SpringAI-Agent-Starter/bizflow-enterprise) | [更多项目](https://github.com/HH-SpringAI-Agent-Starter)
