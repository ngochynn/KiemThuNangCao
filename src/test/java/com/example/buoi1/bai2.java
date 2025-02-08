package com.example.buoi1;

import java.util.Arrays;
import java.util.List;

public class bai2 {
//    Bài 1
    public static int nhanTichHaiSoNguyen(int a, int b) {
        return a * b;
    }

//    Bài 2
    public static int chiaHaiSoNguyen(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Ko chia được");
        }
        return a / b;
    }

//    Bài 3
    public static double tinhTBC(List<Integer> nums) {
        if (nums.isEmpty()) throw new ArithmeticException("List rỗng!");
        return nums.stream().mapToInt(i -> i).average().orElse(0);
    }


//    Bài 4
    static int layPhanTu(int[] arr, int index) {
        if (index < 0 || index >= arr.length)
            throw new IndexOutOfBoundsException("Vị trí ngoài phạm vi");
        return arr[index];
    }

//    Bài 5
    static String layTen(Object obj) {
        if (obj == null)
            throw new NullPointerException("Đối tượng không tồn tại");
        return obj.toString();
    }

//    Bài 6
    static int timMin(int[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Mảng rỗng");
        return Arrays.stream(arr).min().orElseThrow();
    }

}
