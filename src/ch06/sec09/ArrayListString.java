package ch06.sec09;

public class ArrayListString {
    String[] arr;

    //기본생성자
    public ArrayListString() {
        arr = new String[0];
    }

    public void add(String val) {
        //전역변수 arr이 가리키고 있는 배열보다 한 칸 더 큰 배열을 만든다.
        //그리고 마지막 방에 val를 넣는다.
        String[] temp = new String[arr.length + 1];
        //int lastIdx = temp.length - 1;
        int lastIdx = arr.length;
        temp[lastIdx] = val;
        for(int i=0; i<lastIdx; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public void add(int idx, String val) {
        String[] temp = new String[arr.length + 1];
        temp[idx] = val;
        for(int i=0; i<arr.length; i++) {
            temp[i < idx ? i : i + 1] = arr[i];
        }
        arr = temp;
    }

    public String get(int idx) {
        return arr[idx];
    }

    public String remove() {
        String[] temp = new String[arr.length - 1];
        String lastValue = get(temp.length);
        for(int i=0; i<temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return lastValue;
    }

    public String remove(int idx) {
        String removeVal = get(idx);
        String[] temp = new String[arr.length - 1];
        for(int i=0; i<temp.length; i++) {
            temp[i] = arr[i < idx ? i : i + 1];
        }
        arr = temp;
        return removeVal;
    }

    public void remove(String val) {
        for(int i=0; i<arr.length; i++) {
            if(val == arr[i]) {
                remove(i);
                return;
            }
        }
    }

    @Override
    public String toString() {
        if(arr.length == 0) { return "[]"; }
        String temp = arr[0];
        for(int i=1; i<arr.length; i++) {
            temp += ", " + arr[i];
        }
        return "[" + temp + "]";
    }
}
