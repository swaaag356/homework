public class Player extends Entity {
    protected int damage;

    public Player(String name, int age) {
        super(name, age);
        healthPoints = 150;
        armor = 50;
        damage = 20;
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
        System.out.println("Player | " + name + " | " + healthPoints + " healthPoints | " + damage + " damage" + armor + " armor");
    }

}
