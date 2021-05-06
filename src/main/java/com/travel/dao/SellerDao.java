package com.travel.dao;

import com.travel.domain.Seller;


public interface SellerDao {

    /**
     * 根据route的sid找到seller信息
     * @param sid
     * @return
     */
    Seller findBySid(int sid);
}
