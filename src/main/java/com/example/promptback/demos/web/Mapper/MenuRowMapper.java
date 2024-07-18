package com.example.promptback.demos.web.Mapper;

import com.example.promptback.demos.web.entity.Menu;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MenuRowMapper implements RowMapper<Menu> {
    @Override
    public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
        Menu menu = new Menu();
        menu.setId(rs.getInt("id"));
        menu.setTopicId(rs.getInt("topic_id"));
        menu.setSubtopicName(rs.getString("subtopic_name"));
        menu.setEnglishPromptId(rs.getInt("english_prompt_id"));
        menu.setChinesePromptId(rs.getInt("chinese_prompt_id"));
        return menu;
    }
}
