package com.hln.service;

import com.hln.pojo.GyProfiles;
import com.hln.pojo.bo.PageBo;
import com.hln.pojo.vo.PageVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (GyProfiles)表服务接口
 *
 * @author makejava
 * @since 2024-05-29 18:32:20
 */
public interface GyProfilesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    GyProfiles queryById(Long id);

    /**
     * 新增数据
     *
     * @param gyProfiles 实例对象
     * @return 实例对象
     */
    GyProfiles insert(GyProfiles gyProfiles);

    /**
     * 修改数据
     *
     * @param gyProfiles 实例对象
     * @return 实例对象
     */
    GyProfiles update(GyProfiles gyProfiles);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    PageVo queryByPage(PageBo gyProfiles);
}
