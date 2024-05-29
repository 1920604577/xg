package com.hln.service.impl;

import com.hln.mapper.GyProfilesDao;
import com.hln.pojo.GyProfiles;
import com.hln.pojo.bo.PageBo;
import com.hln.pojo.vo.PageVo;
import com.hln.service.GyProfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GyProfiles)表服务实现类
 *
 * @author makejava
 * @since 2024-05-29 18:32:23
 */
@Service
public class GyProfilesServiceImpl implements GyProfilesService {
    @Autowired
    private GyProfilesDao gyProfilesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public GyProfiles queryById(Long id) {
        return this.gyProfilesDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param gyProfiles 实例对象
     * @return 实例对象
     */
    @Override
    public GyProfiles insert(GyProfiles gyProfiles) {
        int insert = gyProfilesDao.insert(gyProfiles);

        if(insert != 1){
            return null;
        }

        return gyProfiles;
    }

    /**
     * 修改数据
     *
     * @param gyProfiles 实例对象
     * @return 实例对象
     */
    @Override
    public GyProfiles update(GyProfiles gyProfiles) {
        this.gyProfilesDao.update(gyProfiles);
        return this.queryById(gyProfiles.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.gyProfilesDao.deleteById(id) > 0;
    }

    /**
     * 分页
     * @param gyProfiles
     * @return
     */
    @Override
    public PageVo queryByPage(PageBo gyProfiles) {

        long total = this.gyProfilesDao.count();
        List<GyProfiles> list = gyProfilesDao.queryAllPage(gyProfiles);

        PageVo pageVo = new PageVo();
        pageVo.setTotal(total);
        pageVo.setList(list);
        return pageVo;
    }
}
