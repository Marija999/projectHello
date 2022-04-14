package com.example.helloProject.language;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {

    @Id
    private String id;
    private String language;
    private String message;

    public Language(){}

    public Language(String language, String message, String id) {
        this.language = language;
        this.message = message;
        this.id=id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
