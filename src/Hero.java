public class Hero implements CanDo {
    private int healthy = 1000, deffend = 100, power = 120, weapon = 250, sheild = 150;

    public Hero(int healthy, int deffend, int power, int weapon, int sheild) {
        this.healthy = healthy;
        this.deffend = deffend;
        this.power = power;
        this.weapon = weapon;
        this.sheild = sheild;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getDeffend() {
        return deffend;
    }

    public void setDeffend(int deffend) {
        this.deffend = deffend;
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

    public int getSheild() {
        return sheild;
    }

    public void setSheild(int sheild) {
        this.sheild = sheild;
    }


    @Override
    public void attackMethod() {
        System.out.printf("from hero");

    }

    @Override
    public void deffendMethod() {

    }

}
