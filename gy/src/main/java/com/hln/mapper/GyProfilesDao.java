package com.hln.mapper;

import com.hln.pojo.GyProfiles;
import com.hln.pojo.bo.PageBo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (GyProfiles)表数据库访问层
 *
 * @author makejava
 * @since 2024-05-29 18:32:11
 */
@Mapper
public interface GyProfilesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    GyProfiles queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param gyProfiles 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<GyProfiles> queryAllByLimit(GyProfiles gyProfiles, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @return 总行数
     */
    long count();

    /**
     * 新增数据
     *
     * @param gyProfiles 实例对象
     * @return 影响行数
     */
    int insert(GyProfiles gyProfiles);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<GyProfiles> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<GyProfiles> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<GyProfiles> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<GyProfiles> entities);

    /**
     * 修改数据
     *
     * @param gyProfiles 实例对象
     * @return 影响行数
     */
    int update(GyProfiles gyProfiles);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 插叙所有数据（分页）
     * @param gyProfiles
     * @return
     */
    List<GyProfiles> queryAllPage(PageBo gyProfiles);
}

