public class Monster extends Entity {
    protected int damage;

    public Monster() {
        healthPoints = 100;
        damage = 10;
    }

    public Monster(String name, int age) {
        super(name, age);
        healthPoints = 100;
        damage = 10;
    }

    @Override
    public void printInfo() {
        if (this.healthPoints > 0) {
            System.out.println("Monster | " + name + " | " + age + " | " + healthPoints + " healthPoints | " + damage + " damage");
        } else {
            System.out.println("Monster | " + name + " | dead");
        }
    }


    public void attack(Entity e) {
        e.setHealthPoints(e.healthPoints-this.damage);
    }

    private int gethealthPoints() {
        return healthPoints;
    }

    private int getdamage() {
        return damage;
    }

    private void sethealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    private void setdamage(int damage) {
        this.damage = damage;
    }


}
