package com.example.promptback.demos.web.Mapper;

import com.example.promptback.demos.web.entity.Topic;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TopicRowMapper implements RowMapper<Topic> {
    @Override
    public Topic mapRow(ResultSet rs, int rowNum) throws SQLException {
        Topic topic = new Topic();
        topic.setTopicName(rs.getString("topic_name"));
        topic.setTopicId(rs.getInt("topic_id"));
        return topic;
    }
}
