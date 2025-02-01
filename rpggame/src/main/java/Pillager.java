public class Pillager extends Monster {
    protected int healthPoints = 200;
    protected int armor = 100;
    protected int damage = 25;

    public Pillager() {
    }


    public Pillager(String name, int age) {
        super(name, age);
    }

    @Override
    public void attack(Entity e) {//p2=e
        if (e.armor > 0) {
            e.setArmor(e.armor-20);
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