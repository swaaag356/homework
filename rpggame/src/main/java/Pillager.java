public class Pillager extends Monster {

    public Pillager() {
        armor = 100;
        healthPoints = 200;
        damage = 25;
    }


    public Pillager(String name, int age) {
        super(name, age);
        armor = 100;
        healthPoints = 200;
        damage = 25;
    }

    @Override
    public void attack(Entity e) {
        if (e.armor > 0) {
            e.setArmor(e.armor-this.damage);
        } else {
            e.setHealthPoints(e.healthPoints-this.damage);
        }
    }

    @Override
    public void printInfo() {
        if (this.healthPoints > 0) {
            System.out.println("Pillager | " + name + " | " + age + " | " + healthPoints + " healthPoints | " + damage + " damage | " + armor + " armor");
        } else {
            System.out.println("Pillager | " + name + " | " + "dead");
        }
    }
}