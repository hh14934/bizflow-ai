# BizFlow AI Community

        CRM / ERP 业务操作 Agent：基于 **Spring AI 2.0 + Agent Tool Calling + PGVector RAG + Ollama** 的业务助理项目模板。

        > 风险提示：订单、库存、发票、回款等写操作默认只创建草稿，必须通过人工审批后提交。

        ## 场景定位

        连接 CRM、ERP、库存、订单、审批系统，辅助员工查询客户、创建订单草稿、查询库存、跟进回款与审批。

        ## 版本定位：开源版


- 单租户或轻量租户 Header 演示
- 本地 Ollama 模型，适合开发和 Demo
- 基础 RAG 知识库、基础工具调用、REST API
- Apache-2.0 友好的开源项目结构
- 可作为 Open Core 的免费获客漏斗

        ## 核心能力

        - Spring AI `ChatClient` Agent 编排
        - `@Tool` 工具调用
        - PGVector 私有知识库 RAG
        - Ollama 本地模型默认配置
        - Docker Compose 一键启动基础设施
        - Flyway 数据库初始化
        - Prometheus / Actuator 可观测性

        ## 工具清单

        - `crm_customer_lookup`
- `erp_inventory_query`
- `order_draft_create`
- `approval_status_lookup`
- `invoice_search`
- `receivable_risk_check`

        ## 连接器方向

        - Salesforce/纷享销客/销售易
- 金蝶/用友 ERP
- 库存系统
- OA 审批系统

        ## API

        | Method | Path | Description |
        |---|---|---|
        | POST | `/api/agent/ask` | 业务查询和操作建议 |
| POST | `/api/orders/draft` | 创建订单草稿 |
| GET | `/api/inventory/check` | 查询库存 |
        | POST | `/api/kb/sync` | 同步知识库 |
        | GET | `/api/kb/search?q=` | 检索知识库 |

        ## 本地运行

        ```bash
        cp .env.example .env
        docker compose up -d
        ollama pull qwen2.5:7b
        ollama pull mxbai-embed-large
        mvn spring-boot:run
        ```

        ## 示例调用

        ```bash
        curl -s -X POST http://localhost:8080/api/agent/ask \
          -H 'Content-Type: application/json' \
          -H 'X-Tenant-Id: demo' \
          -d '{
            "question": "帮我查询客户 A 的最近采购记录，如果华东仓库存够，就生成一个订单草稿。",
            "userId": "u_1001",
            "sessionId": "s_demo"
          }' | jq
        ```

        ## 目录结构

        ```text
        src/main/java/.../agent        Agent 编排
        src/main/java/.../tools        工具调用
        src/main/java/.../rag          RAG 服务
        src/main/java/.../tenant       多租户上下文
        src/main/resources/kb          示例知识库
        src/main/resources/db          Flyway 初始化 SQL
        docs/                          架构、API、部署、定价、演示脚本
        ```

        ## GitHub 上传

        ```bash
        git init
        git add .
        git commit -m "Initial commit: BizFlow AI Community"
        gh repo create bizflow-ai --public --source=. --remote=origin --push
        ```
