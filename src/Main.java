/*
class { } 안에 코드 작성을 한다.
컴파일 언어에서는 main메소드가 굉장히 특별한 메소드   >>>   프로그램 시작점!
main메소드가 호출되면서 프로그램이 시작하게 된다.
자바에서는 main메소드 모양이 항상 같아야한다.
유일하게 달라도 되는 부분은 "args"매개변수명만 바꿀 수 있다. 나머지는 그대로 작성해야 한다.
*/
public class Main {
    public static void main(String[] args) {
        //JS의 console.log()와 비슷하다. 개행을 해주지 않는다.
        //System.out.printf("Hello and welcome!");
        //만약 개행을 하고 싶다. println 메소드 호출로 해결
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}