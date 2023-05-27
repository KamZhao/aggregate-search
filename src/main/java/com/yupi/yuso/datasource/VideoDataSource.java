package com.yupi.yuso.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Component;

/**
 * 视频数据源
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Component
public class VideoDataSource implements DataSource<Object> {

    @Override
    public Page<Object> doSearch(String searchText, long pageNum, long pageSize) {
        return null;
    }
}
