package com.liuyouyan.springbootinit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liuyouyan.springbootinit.model.entity.Post;
import java.util.Date;
import java.util.List;

/**
 * 帖子数据库操作
 *
 * @author <a href="https://liuyouyan.com">刘有颜</a>
 * @from <a href="https://liuyouyan.com">刘有颜的博客</a>
 */
public interface PostMapper extends BaseMapper<Post> {

    /**
     * 查询帖子列表（包括已被删除的数据）
     */
    List<Post> listPostWithDelete(Date minUpdateTime);

}




