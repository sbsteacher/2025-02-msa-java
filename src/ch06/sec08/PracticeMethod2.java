package ch06.sec08;

import java.util.UUID;

public class PracticeMethod2 {
    public String getRandomFileName() {
        return UUID.randomUUID().toString();
    }

    public String getRandomFileName(String fileName) {
        return getRandomFileName() + getExt(fileName);
    }

    public String getExt(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }

    public int sumArr(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
