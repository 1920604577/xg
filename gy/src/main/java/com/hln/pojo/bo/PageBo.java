package com.hln.pojo.bo;

import java.io.Serializable;

public class PageBo implements Serializable {

    private Long start;//开始坐标
    private Integer size;//每页显示长度

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "PageBo{" +
                "start=" + start +
                ", size=" + size +
                '}';
    }
}
