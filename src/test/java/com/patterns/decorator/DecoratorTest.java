package com.patterns.decorator;

import org.junit.Test;

import java.io.FileNotFoundException;

public class DecoratorTest {

    @Test
    public void cost() throws FileNotFoundException {
        AbstractWeapon weapon = new WeaponAK();
        weapon.shoot();
        weapon.reload();
        System.out.println("Upgraded the weapon, adding aim that improving a reload and a shoot");
        AbstractWeapon upgradedWeapon = new AimWeapon(new WeaponAK());
        upgradedWeapon.shoot();
        upgradedWeapon.reload();

    }

}