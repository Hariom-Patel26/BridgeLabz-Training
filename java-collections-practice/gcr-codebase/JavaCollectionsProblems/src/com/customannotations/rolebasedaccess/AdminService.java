package com.customannotations.rolebasedaccess;

public class AdminService {

    @RoleAllowed("ADMIN")
    void deleteUser() {
        System.out.println("User deleted");
    }
}