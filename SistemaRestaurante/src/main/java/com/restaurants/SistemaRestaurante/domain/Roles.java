package com.restaurants.SistemaRestaurante.domain;

import com.restaurants.SistemaRestaurante.permissions.Permission;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;


@RequiredArgsConstructor
public enum Roles {

    USER(Collections.emptySet()) ,
    ADMIN(
            Set.of(
                    Permission.ADMIN_READ,
                    Permission.ADMIN_DELETE,
                    Permission.ADMIN_WRITE,
                    Permission.ADMIN_ADD,
                    Permission.ADMIN_EDIT
            )
    )
    ;

    @Getter
    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities() {
       var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.name()))
                .toList();
       authorities.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
       return authorities;
    }

}
