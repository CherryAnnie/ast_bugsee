package com.ast.mall.ast_bugsee.jpa;

import com.ast.mall.ast_bugsee.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ast_mall on 2018/3/6.
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long>{
    //通过用户名查出用户
    SysUser findByUsername(String username);

}
