package br.com.fiap;

import java.util.ArrayList;
import java.util.List;

public class RequestBody {
    private String model;
    private long maxTokens;
    private float temperature;
    private List<Message> messages = new ArrayList<>();

    public RequestBody() {
    }

    public RequestBody(String model, List<Message> messages) {
        this.model = model;

        this.maxTokens = maxTokens;
        this.temperature = temperature;
        this.messages = messages;
    }

    public float getTemperature() {
        return temperature;
    }

    public RequestBody setTemperature(float temperature) {
        this.temperature = temperature;
        return this;
    }

    public long getMaxTokens() {
        return maxTokens;
    }

    public RequestBody setMaxTokens(long maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }


    public String getModel() {
        return model;
    }

    public RequestBody setModel(String model) {
        this.model = model;
        return this;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public RequestBody setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    @Override
    public String toString() {
        return "RequestBody{" +
                "model='" + model + '\'' +
                ", maxTokens=" + maxTokens +
                ", temperature=" + temperature +
                ", messages=" + messages +
                '}';
    }
}
