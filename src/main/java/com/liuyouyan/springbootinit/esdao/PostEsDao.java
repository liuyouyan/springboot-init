package com.liuyouyan.springbootinit.esdao;

import com.liuyouyan.springbootinit.model.dto.post.PostEsDTO;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
 * @author <a href="https://liuyouyan.com">刘有颜</a>
 * @from <a href="https://liuyouyan.com">刘有颜的博客</a>
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}