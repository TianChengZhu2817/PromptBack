package com.example.promptback.demos.web.entity;

public class Menu {
    int id;
    int topicId;
    String subtopicName;
    int englishPromptId;
    int chinesePromptId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getSubtopicName() {
        return subtopicName;
    }

    public void setSubtopicName(String subtopicName) {
        this.subtopicName = subtopicName;
    }

    public int getEnglishPromptId() {
        return englishPromptId;
    }

    public void setEnglishPromptId(int englishPromptId) {
        this.englishPromptId = englishPromptId;
    }

    public int getChinesePromptId() {
        return chinesePromptId;
    }

    public void setChinesePromptId(int chinesePromptId) {
        this.chinesePromptId = chinesePromptId;
    }
}
