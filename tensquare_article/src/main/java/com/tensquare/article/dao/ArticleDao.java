package com.tensquare.article.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.article.pojo.Article;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * 数据访问接口
 *
 * @author Administrator
 */
public interface ArticleDao extends JpaRepository<Article, String>, JpaSpecificationExecutor<Article> {

    /**
     * 审核文章
     *
     * @param articleId
     */
    @Modifying
    @Query(value = "UPDATE tb_article SET state='1' WHERE id=?", nativeQuery = true)
    void examine(String articleId);

    /**
     * 点赞文章
     *
     * @param articleId
     */
    @Modifying
    @Query(value = "UPDATE tb_article SET thumbup=thumbup+1 WHERE id=?", nativeQuery = true)
    void updateThumbup(String articleId);
}
