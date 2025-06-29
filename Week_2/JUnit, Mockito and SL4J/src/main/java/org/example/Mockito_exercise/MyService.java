package src.main.java.org.example.Mockito_exercise;

package org.example.Mockito_exercise;

public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void doSomething() {
        api.log("Doing something...");
    }
}
