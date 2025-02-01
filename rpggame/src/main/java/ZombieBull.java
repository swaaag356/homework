public class ZombieBull extends Monster {
    private int healthPoints = 120;
    private int stamina = 100;
    private int damage = 20;
    private int armor = 150;

    public ZombieBull() {
    }

    public ZombieBull(String name, int age) {
        super(name, age);
    }

    @Override
    public void attack(Entity e) {
        if (this.stamina > 0) {
            if (e.armor > 0) {
                e.setArmor(e.armor-this.damage);
                this.stamina -= 10;
            } else {
                e.setHealthPoints(e.healthPoints-this.damage);
                this.stamina -= 10;
            }
        }
    }

    public void eatProteinCookies() {
        this.stamina = 100;
    }

    @Override
    public void printInfo() {
        if (this.healthPoints > 0) {
            System.out.println("Zombie Bull | " + name + " | " + age + " | " + healthPoints + " healthPoints | " + damage + " damage | " + armor + " armor | " + stamina + " stamina ");
        } else {
            System.out.println("Zombie Bull | " + name + " | dead");
        }
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public void setArmor(int armor) {
        this.armor = armor;
    }
}