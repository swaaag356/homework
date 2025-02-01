public class Player extends Entity {
    protected int healthPoints = 150;
    protected int armor = 50;
    protected int damage = 20;

    public Player(String name, int age) {
        super(name, age);
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
