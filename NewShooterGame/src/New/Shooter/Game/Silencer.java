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
public class Silencer extends WeaponAddOn {

    Weapon weapon;

    public Silencer(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getDescription() {
        return weapon.getDescription() + ", Silencer";
    }

    public double getWeight() {
        return .50 + weapon.getWeight();
    }

    public void aim_and_fire() {
        System.out.println("Fire with ");
    }

}
