package com.agentstack.bizflow.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfig {
    @Bean
    ChatClient chatClient(ChatClient.Builder builder) {
        return builder.defaultSystem("""
                You are BizFlow AI, a Spring AI Agent for the scenario: 业务助理.
                Always answer in Chinese unless the user requests another language.
                Prefer grounded answers with citations from RAG context.
                Before any write operation, create a draft or ask for human approval.
                Do not fabricate data. Say what tool or knowledge source was used.
                """).build();
    }
}
