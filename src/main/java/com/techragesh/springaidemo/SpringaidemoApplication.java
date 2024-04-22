package com.techragesh.springaidemo;

import org.springframework.ai.embedding.EmbeddingClient;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringaidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringaidemoApplication.class, args);
	}

	@Bean
	public SimpleVectorStore simpleVectorStore(EmbeddingClient embeddingClient) {
		return new SimpleVectorStore(embeddingClient);
	}

}
