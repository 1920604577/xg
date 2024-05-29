package com.hln.pojo;

import java.io.Serializable;

/**
 * (GyProfiles)实体类
 *
 * @author makejava
 * @since 2024-05-29 18:32:18
 */
public class GyProfiles implements Serializable {
    private static final long serialVersionUID = 873236831167505264L;

    private Long id;
/**
     * 种类名
     */
    private String name;

    private String kind;

/**
     * 种植面积
     */
    private Integer same;
/**
     * 成熟季节
     */
    private String season;
/**
     * 产量
     */
    private Integer yield;
/**
     * 逻辑删除(0:删除,1：正常)
     */
    private Integer delFlag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSame() {
        return same;
    }

    public void setSame(Integer same) {
        this.same = same;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Integer getYield() {
        return yield;
    }

    public void setYield(Integer yield) {
        this.yield = yield;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "GyProfiles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", same=" + same +
                ", season='" + season + '\'' +
                ", yield=" + yield +
                ", delFlag=" + delFlag +
                '}';
    }
}

