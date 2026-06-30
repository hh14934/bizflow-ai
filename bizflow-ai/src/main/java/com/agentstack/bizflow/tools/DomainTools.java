package com.agentstack.bizflow.tools;

import com.agentstack.bizflow.rag.KnowledgeBaseService;
import com.agentstack.bizflow.tenant.TenantContext;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class DomainTools {
    private final KnowledgeBaseService knowledgeBaseService;

    public DomainTools(KnowledgeBaseService knowledgeBaseService) {
        this.knowledgeBaseService = knowledgeBaseService;
    }

    @Tool(description = "Search tenant scoped private knowledge base")
    public String knowledge_search(@ToolParam(description = "search query") String query) {
        return String.join("\n", knowledgeBaseService.search(query));
    }

    @Tool(description = "crm customer lookup for 业务助理")
    public String crm_customer_lookup(@ToolParam(description = "business query") String query) {
        return "[crm_customer_lookup] tenant=" + TenantContext.getTenantId() + "; result for: " + query + "; demo stub, connect real system in production.";
    }

    @Tool(description = "erp inventory query for 业务助理")
    public String erp_inventory_query(@ToolParam(description = "business query") String query) {
        return "[erp_inventory_query] tenant=" + TenantContext.getTenantId() + "; result for: " + query + "; demo stub, connect real system in production.";
    }

    @Tool(description = "order draft create for 业务助理")
    public String order_draft_create(@ToolParam(description = "business query") String query) {
        return "[order_draft_create] tenant=" + TenantContext.getTenantId() + "; result for: " + query + "; demo stub, connect real system in production.";
    }

    @Tool(description = "approval status lookup for 业务助理")
    public String approval_status_lookup(@ToolParam(description = "business query") String query) {
        return "[approval_status_lookup] tenant=" + TenantContext.getTenantId() + "; result for: " + query + "; demo stub, connect real system in production.";
    }

    @Tool(description = "invoice search for 业务助理")
    public String invoice_search(@ToolParam(description = "business query") String query) {
        return "[invoice_search] tenant=" + TenantContext.getTenantId() + "; result for: " + query + "; demo stub, connect real system in production.";
    }

    @Tool(description = "receivable risk check for 业务助理")
    public String receivable_risk_check(@ToolParam(description = "business query") String query) {
        return "[receivable_risk_check] tenant=" + TenantContext.getTenantId() + "; result for: " + query + "; demo stub, connect real system in production.";
    }

}
