package starcraft;

//수송선
public class Dropship extends Unit {
    //8개의 유닛을 태울 수 있는 공간이 필요
    private Unit[] units = new Unit[8];

    public void load(Unit unit) {

    }

    public void check() {
        for(int i=0; i<units.length; i++) {
            System.out.printf("[%d]: %s\n", i, units[i]);
        }
    }
}
