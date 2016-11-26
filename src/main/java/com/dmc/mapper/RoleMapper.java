package com.dmc.mapper;

import com.dmc.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by yangfan on 2015/5/3.
 * 角色管理
 */
@Mapper
public interface RoleMapper {
    /**
     * 保存角色
     * @param role 角色
     */
    void save(Role role);

    /**
     * ID查角色
     * @param id ID
     * @return 角色
     */
    Role getById(String id);

    /**
     * 更新角色
     * @param role 角色
     */
    void update(Role role);

    /**
     * 角色列表
     * @param params 参数
     * @return 角色列表
     */
    List<Role> getRoleList(Map<String, Object> params);

    /**
     * 删除角色
     * @param id ID
     */
    void deleteById(String id);

    /**
     * 删除角色资源
     * @param id 角色ID
     */
    void deleteRoleResources(String id);

    /**
     * 保存角色的资源
     * @param id 角色ID
     * @param resourceIds 资源ID
     */
    void saveRoleResources(@Param("id") String id, @Param("resourceIds") String[] resourceIds);
}