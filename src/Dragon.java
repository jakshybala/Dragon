public class Dragon{

    int healthy = 2000, defend = 120, power = 150, weapon = 0;

    public Dragon(int healthy, int defend, int power, int weapon) {
        this.healthy = healthy;
        this.defend = defend;
        this.power = power;
        this.weapon = weapon;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

}
