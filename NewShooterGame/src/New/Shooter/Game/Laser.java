/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New.Shooter.Game;

/**
 *
 * @author shahi
 */
public class Laser extends WeaponAddOn {

    Weapon weapon;

    public Laser(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getDescription() {
        return weapon.getDescription() + ", Laser";
    }

    public double getWeight() {
        return .50 + weapon.getWeight();
    }

    public void aim_and_fire() {
        System.out.println("Fire with ");
    }

}
