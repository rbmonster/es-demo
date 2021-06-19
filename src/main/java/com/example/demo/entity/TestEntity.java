package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.annotation.Version;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Data
@TypeAlias("testDemo")
@Document(
        indexName = "test.test_index",
        type = "_doc",
        createIndex = false
)
public class TestEntity {

    @Id
    private String id;

    private String creationDate;

    @Version
    private Long version;

    @Field(name = "status")
    private String status;
    private String title;
    private String description;
    private String content;
    private String authorName;
    private String topArticleOrder;

    private String publishTime;
}
