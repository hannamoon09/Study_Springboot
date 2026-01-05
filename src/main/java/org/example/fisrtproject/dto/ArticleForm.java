package org.example.fisrtproject.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.example.fisrtproject.entity.Article;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(id, title, content);
    }
}
