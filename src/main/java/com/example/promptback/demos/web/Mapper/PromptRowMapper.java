package com.example.promptback.demos.web.Mapper;

import com.example.promptback.demos.web.entity.Prompt;
import com.example.promptback.demos.web.entity.Topic;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PromptRowMapper implements RowMapper<Prompt> {
    @Override
    public Prompt mapRow(ResultSet rs, int rowNum) throws SQLException {
        Prompt prompt = new Prompt();
        prompt.setPrompt(rs.getString("prompt"));
        prompt.setPromptId(rs.getInt("prompt_id"));
        return prompt;
    }
}
