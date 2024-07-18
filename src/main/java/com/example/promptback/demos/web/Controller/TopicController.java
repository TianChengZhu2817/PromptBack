/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.promptback.demos.web.Controller;

import com.example.promptback.demos.web.Dao.TopicDao;
import com.example.promptback.demos.web.entity.Menu;
import com.example.promptback.demos.web.entity.Prompt;
import com.example.promptback.demos.web.entity.Topic;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.slf4j.Logger;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@RestController
@RequestMapping("/topic")
public class TopicController {

    private static final Logger logger = LoggerFactory.getLogger(TopicController.class);
    @Autowired
    private TopicDao topicDao;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @RequestMapping("/getTopicList")
    public List<Topic> getTopicList() {
        logger.info("数据库获取topic合集");
        return topicDao.getAllTopic();
    }
    @RequestMapping("/getSubtopicListByTopicId")
    public List<Menu> getSubtopicListByTopicId(@RequestParam("topicId") int topicId) {
        logger.info("数据库获取subtopic合集");
        return topicDao.getSubtopicByTopicId(topicId);
    }
    @RequestMapping("/getPromptBypromptId")
    public List<Prompt> getPromptBypromptId(@RequestParam("promptId") int promptId){
        logger.info("数据库获取prompt合集");
        return topicDao.getPromptByPromptId(promptId);
    }

}
