package com.ltp.config.service;

import com.ltp.domain.TbPermission;
import com.ltp.domain.TbUser;
import com.ltp.service.TbPermissionService;
import com.ltp.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2020/4/7
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TbUser tbUser = tbUserService.getUserByUserName(username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (null != tbUser) {
            List<TbPermission> tbPermissions = tbPermissionService.queryPermissionByUserId(tbUser.getId());
            tbPermissions.forEach(ele -> {
                if (null != ele && null != ele.getEnname()) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(ele.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            });
            return new User(tbUser.getUsername(), tbUser.getPassword(), grantedAuthorities);
        }
        return null;
    }
}
