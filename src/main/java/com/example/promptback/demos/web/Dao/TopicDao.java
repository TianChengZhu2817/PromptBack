package com.example.promptback.demos.web.Dao;

import com.example.promptback.demos.web.Mapper.MenuRowMapper;
import com.example.promptback.demos.web.Mapper.PromptRowMapper;
import com.example.promptback.demos.web.Mapper.TopicRowMapper;
import com.example.promptback.demos.web.entity.Menu;
import com.example.promptback.demos.web.entity.Prompt;
import com.example.promptback.demos.web.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


import java.util.List;

@Service
@Resource
public class TopicDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Topic> getAllTopic() {
        String sql = "SELECT * FROM topic;";
        return jdbcTemplate.query(sql,new TopicRowMapper());
    }
    public List<Menu> getSubtopicByTopicId(int topicId){
        String sql="SELECT * FROM menu WHERE topic_id=?;";
        return jdbcTemplate.query(sql,new MenuRowMapper(),topicId);
    }
    public List<Prompt> getPromptByPromptId(int promptId){
        String sql="SELECT prompt FROM prompt WHERE prompt_id=?;";
        return jdbcTemplate.query(sql,new PromptRowMapper(),promptId);
    }
}
