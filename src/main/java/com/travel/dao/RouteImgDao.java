package com.travel.dao;

import com.travel.domain.RouteImg;

import java.util.List;

public interface RouteImgDao {

    /**
     * 根据route的rid找到route img信息
     * @param rid
     * @return
     */
    List<RouteImg> findByRid(int rid);
}
