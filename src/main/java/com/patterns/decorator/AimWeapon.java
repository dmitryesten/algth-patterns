package com.patterns.decorator;

public class AimWeapon extends EquipmentDecorator {

    private AbstractWeapon weapon;

    public AimWeapon(AbstractWeapon weapon){
        this.weapon = weapon;
    }

    @Override
    public void shoot() {
        weapon.shoot();
        System.out.println("BOM BOM BOM ");
    }

    @Override
    public void reload() {
        weapon.reload();
        System.out.println("Fast reload");
    }
}
