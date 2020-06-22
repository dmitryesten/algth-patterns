package com.patterns.decorator;

public class WeaponAK implements AbstractWeapon {

    @Override
    public void shoot() {
        System.out.println("Piu piu ");
    }

    @Override
    public void reload() {
        System.out.println("Slower reload");
    }

}
