package com.restaurants.SistemaRestaurante.permissions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin_read"),
    ADMIN_WRITE("admin_write"),
    ADMIN_DELETE("admin_delete"),
    ADMIN_ADD("admin_add"),
    ADMIN_EDIT("admin_edit"),
    USERS_READ("users_read"),
    USER_GET("users_get"),
    ;

    @Getter
    private final String permission;
}
