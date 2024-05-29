package com.hln.pojo.vo;

import com.hln.pojo.GyProfiles;

import java.io.Serializable;
import java.util.List;

public class PageVo implements Serializable {

    private List<GyProfiles> list;
    private Long total;

    public List<GyProfiles> getList() {
        return list;
    }

    public void setList(List<GyProfiles> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PageVo{" +
                "list=" + list +
                ", total=" + total +
                '}';
    }
}
