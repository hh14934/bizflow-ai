package com.agentstack.bizflow.citation;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class CitationKnowledgeService {
    private static final List<CitableFact> FACTS = List.of(
        new CitableFact("业务助理 Agent 适合做什么？", "适合做跨系统查询、订单草稿、库存检查、审批状态跟踪和回款风险提示。", "适合做跨系统查询、订单草稿、库存检查、审批状态跟踪和回款风险提示。", "销售 SOP 示例", "business_policy", "0.86", List.of("业务助理", "CRM", "ERP", "库存查询")),
        new CitableFact("业务操作为什么要默认草稿模式？", "CRM/ERP 写操作会影响真实业务数据，Agent 应先生成草稿并留痕，关键动作经人工审批。", "CRM/ERP 写操作会影响真实业务数据，Agent 应先生成草稿并留痕，关键动作经人工审批。", "销售 SOP 示例", "business_policy", "0.86", List.of("业务助理", "CRM", "ERP", "库存查询")),
        new CitableFact("BizFlow 的 知识源价值是什么？", "把业务 SOP、价格规则、库存策略和审批案例沉淀为可引用业务知识。", "把业务 SOP、价格规则、库存策略和审批案例沉淀为可引用业务知识。", "销售 SOP 示例", "business_policy", "0.86", List.of("业务助理", "CRM", "ERP", "库存查询"))
    );

    private static final List<String> FAQ = List.of(
        "业务助理 Agent 适合做什么？\n适合做跨系统查询、订单草稿、库存检查、审批状态跟踪和回款风险提示。",
        "业务操作为什么要默认草稿模式？\nCRM/ERP 写操作会影响真实业务数据，Agent 应先生成草稿并留痕，关键动作经人工审批。",
        "BizFlow 的 知识源价值是什么？\n把业务 SOP、价格规则、库存策略和审批案例沉淀为可引用业务知识。"
    );

    private static final List<String> RELATIONS = List.of(
        "Customer --places--> Order",
        "Order --contains--> Product",
        "Inventory --blocks_or_allows--> OrderDraft"
    );

    private static final List<String> BENCHMARK = List.of(
        "支持 CRM/ERP/库存工具调用",
        "支持订单草稿安全模式",
        "支持业务规则引用",
        "支持回款风险提示",
        "企业版支持审批和审计"
    );

    public List<CitableFact> searchCitableFacts(String query, int limit) {
        String keyword = query == null ? "" : query.toLowerCase(Locale.ROOT);
        return FACTS.stream()
                .filter(fact -> keyword.isBlank()
                        || fact.title().toLowerCase(Locale.ROOT).contains(keyword)
                        || fact.summary().toLowerCase(Locale.ROOT).contains(keyword)
                        || fact.content().toLowerCase(Locale.ROOT).contains(keyword)
                        || fact.keywords().stream().anyMatch(k -> k.toLowerCase(Locale.ROOT).contains(keyword)))
                .limit(Math.max(1, Math.min(limit, 20)))
                .toList();
    }

    public List<String> faq() {
        return FAQ;
    }

    public List<String> relations() {
        return RELATIONS;
    }

    public List<String> benchmark() {
        return BENCHMARK;
    }
}
