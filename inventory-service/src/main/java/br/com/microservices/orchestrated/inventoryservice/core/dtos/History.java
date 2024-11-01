package br.com.microservices.orchestrated.inventoryservice.core.dtos;

import java.time.LocalDateTime;

import br.com.microservices.orchestrated.inventoryservice.core.enums.ESagaStatus;
import lombok.Builder;

@Builder
public class History {

	private String source;
	private ESagaStatus status;
	private String message;
	private LocalDateTime createdAt;
	
	public History() {
		
	}

	public History(String source, ESagaStatus status, String message, LocalDateTime createdAt) {
		super();
		this.source = source;
		this.status = status;
		this.message = message;
		this.createdAt = createdAt;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public ESagaStatus getStatus() {
		return status;
	}

	public void setStatus(ESagaStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
}
