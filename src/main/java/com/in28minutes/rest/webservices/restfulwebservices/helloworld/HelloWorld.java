package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorld {
    private String body;

    public HelloWorld(String body){
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("HelloWorldBean [body=%s]", body);
    }
}
