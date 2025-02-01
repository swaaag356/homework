public class Villager extends Entity {
    protected int healthPoints = 100;
    protected int armor = 50;
    protected int damage = 15;


    public Villager() {
    }

    public Villager(String name, int age) {
        super(name, age);
    }

    public void useTheHealthPotion(Entity e) {
        if (this.healthPoints < 100) {
            this.healthPoints += 15;
        }
    }

    public void attack(Entity e) {
        if (e.armor > 0) {
            e.setArmor(e.armor-this.damage);
        } else {
            e.setHealthPoints(e.healthPoints-this.damage);
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Vampire | " + name + " | " + age + " | " + healthPoints + " healthPoints | " + damage + " damage | " + armor + " armor");
    }
}
