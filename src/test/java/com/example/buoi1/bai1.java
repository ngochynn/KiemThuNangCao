package com.example.buoi1;

import org.junit.jupiter.api.Test;

import java.util.List;

public class bai1 {


    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static int tinhHieu(int a, int b) {
        return a - b;
    }

    public static int tinhTich(int a, int b) {
        return a * b;
    }

    public static Integer tinhThuong(int a, int b) {
        if (b == 0) {
            System.out.println("Lỗi: Không thể chia cho 0.");
            return null;
        }
        return a / b;
    }

    public static double trungBinhCong(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }

    public static int timViTriMang(int[] so, int x) {
        for (int i = 0; i < so.length; i++) {
            if (so[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int tinhTongNSo(int[] so) {
        int tong = 0;
        for (int number : so) {
            tong += number;
        }
        return tong;
    }

    public static int tinhTongNSoLe(int[] so) {
        int tong = 0;
        for (int number : so) {
            if (number % 2 != 0) {
                tong += number;
            }
        }
        return tong;
    }
}
