package br.com.microservices.orchestrated.inventoryservice.core.dtos;

import java.time.LocalDateTime;
import java.util.List;

import br.com.microservices.orchestrated.inventoryservice.core.enums.ESagaStatus;

public class Event {

    private String id;
    private String transactionId;
    private String orderId;
    private Order paylod;
    private String source;
    private ESagaStatus status;
    private List<History> eventHistory;
    private LocalDateTime createdAt;

    public Event() {}

    public Event(String id, String transactionId, String orderId, Order paylod, String source, 
                 ESagaStatus status, List<History> eventHistory, LocalDateTime createdAt) {
        this.id = id;
        this.transactionId = transactionId;
        this.orderId = orderId;
        this.paylod = paylod;
        this.source = source;
        this.status = status;
        this.eventHistory = eventHistory;
        this.createdAt = createdAt;
    }

    // Getters and setters

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public Order getPaylod() { return paylod; }
    public void setPaylod(Order paylod) { this.paylod = paylod; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public ESagaStatus getStatus() { return status; }
    public void setStatus(ESagaStatus status) { this.status = status; }

    public List<History> getEventHistory() { return eventHistory; }
    public void setEventHistory(List<History> eventHistory) { this.eventHistory = eventHistory; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    // Classe Builder
    public static class EventBuilder {
        private String id;
        private String transactionId;
        private String orderId;
        private Order paylod;
        private String source;
        private ESagaStatus status;
        private List<History> eventHistory;
        private LocalDateTime createdAt;

        public EventBuilder id(String id) {
            this.id = id;
            return this;
        }

        public EventBuilder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public EventBuilder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public EventBuilder paylod(Order paylod) {
            this.paylod = paylod;
            return this;
        }

        public EventBuilder source(String source) {
            this.source = source;
            return this;
        }

        public EventBuilder status(ESagaStatus status) {
            this.status = status;
            return this;
        }

        public EventBuilder eventHistory(List<History> eventHistory) {
            this.eventHistory = eventHistory;
            return this;
        }

        public EventBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Event build() {
            return new Event(id, transactionId, orderId, paylod, source, status, eventHistory, createdAt);
        }
    }

    // Método para criar um builder
    public static EventBuilder builder() {
        return new EventBuilder();
    }
}
