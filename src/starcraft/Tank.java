package starcraft;

//시즈탱크(공성 전차)
public class Tank extends Unit {
    private boolean isSiegeMode;

    public void changeMode() {
        System.out.printf("시즈 모드 %s\n", (isSiegeMode = !isSiegeMode) ? "ON" : "OFF");
    }

    @Override
    public String toString() {
        return "시즈탱크@" + super.hashCode();
    }
}
