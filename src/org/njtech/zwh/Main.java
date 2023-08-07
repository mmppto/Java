package org.njtech.zwh;

import org.njtech.zwh.imp.Ame;
import org.njtech.zwh.imp.Hero;
import org.njtech.zwh.imp.Role;
import org.njtech.zwh.imp.Zeus;

public class Main {
    public static void main(String[] args) {
        Role[] roles = {
                new Zeus(),
                new Ame(),
        };

        for (Role role : roles) {
            role.greet();
        }
    }
}