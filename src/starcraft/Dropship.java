package starcraft;

//수송선
public class Dropship extends Unit {
    //8개의 유닛을 태울 수 있는 공간이 필요
    private Unit[] units = new Unit[8];
    private int loadIdx = 0;

    public void load(Unit unit) {
        if(loadIdx == units.length) { return; }
        units[loadIdx++] = unit;
    }

    public Unit unload(int idx) {
        Unit temp = units[idx];
        int len = units.length - 1;
        for(int i=idx; i<len; i++) {
            int next = i + 1;
            if(units[next] == null) { break; }
            units[i] = units[next];
            units[next] = null;
        }
        return temp;
    }

    public Unit unload2(int idx) {
        Unit temp = units[idx];
        for(int i=idx + 1; i<units.length; i++) {
            if(units[i] == null) { break; }
            units[i - 1] = units[i];
        }
        units[--loadIdx] = null;
        return temp;
    }

    public void check() {
        for(int i=0; i<units.length; i++) {
            System.out.printf("[%d]: %s\n", i, units[i]);
        }
    }
}
