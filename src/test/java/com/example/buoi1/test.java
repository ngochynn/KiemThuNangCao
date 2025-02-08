package com.example.buoi1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class test {

    @Test
    public void testTinhTong() {
        assertEquals(5, bai1.tinhTong(2, 3));
        assertEquals(50, bai1.tinhTong(0, 50));
        assertEquals(100, bai1.tinhTong(100, 0));
        assertEquals(200, bai1.tinhTong(100, 100));
        assertEquals(1, bai1.tinhTong(1, 0));
        assertEquals(-1, bai1.tinhTong(-1, 0));
//        cộng với giá trị nguyên max-min
        assertEquals(Integer.MAX_VALUE, bai1.tinhTong(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, bai1.tinhTong(Integer.MIN_VALUE, 0));
        assertEquals(0, bai1.tinhTong(0, 0));
        assertEquals(-5, bai1.tinhTong(-2, -3));
        assertEquals(0, bai1.tinhTong(-5, 5));
    }

    @Test
    public void testTinhHieu() {
        assertEquals(3, bai1.tinhHieu(6, 3));
        assertEquals(-3, bai1.tinhHieu(3, 6));
        assertEquals(0, bai1.tinhHieu(5, 5));
//        giá trị lớn nhất mà kiểu int lưu trữ
        assertEquals(Integer.MAX_VALUE - 1, bai1.tinhHieu(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testTinhTich() {
        assertEquals(18, bai1.tinhTich(6, 3));
        assertEquals(0, bai1.tinhTich(0, 5));
        assertEquals(-12, bai1.tinhTich(-4, 3));
        assertEquals(25, bai1.tinhTich(-5, -5));
    }

    @Test
    public void testTinhThuong() {
        assertEquals(2, bai1.tinhThuong(6, 3));
        assertEquals(0, bai1.tinhThuong(0, 5));
        assertEquals(-2, bai1.tinhThuong(-6, 3));
        assertEquals(3, bai1.tinhThuong(9, 3));
        assertNull(bai1.tinhThuong(9, 0));
    }

    @Test
    public void test4() {
        assertEquals(5, bai1.trungBinhCong(List.of(5)));
    }

    @Test
    public void test4a() {
        assertEquals(5, bai1.trungBinhCong(List.of(2,4,6,8)));
    }

    @Test
    public void test4b() {
        assertEquals(-2.5, bai1.trungBinhCong(List.of(-1,-2,-3,-4)));
    }

    @Test
    public void test4c() {
        assertEquals(0, bai1.trungBinhCong(List.of()));
    }

    @Test
    public void testTimViTriMang1() {
        int[] numbers = {5, 10, 15, 20};
        assertEquals(2, bai1.timViTriMang(numbers, 15));  // Tìm phần tử 15, vị trí là 2
    }

    @Test
    public void testTimViTriMang2() {
        int[] numbers = {10, 20, 30, 40};
        assertEquals(0, bai1.timViTriMang(numbers, 10));  // Tìm phần tử 10, vị trí là 0
    }

    @Test
    public void testTimViTriMang3() {
        int[] numbers = {7, 14, 21, 28};
        assertEquals(3, bai1.timViTriMang(numbers, 28));  // Tìm phần tử 28, vị trí là 3
    }

    @Test
    public void testTimViTriMang4() {
        int[] numbers = {5, 10, 15};
        assertEquals(-1, bai1.timViTriMang(numbers, 25));  // Tìm phần tử không có trong mảng, trả về -1
    }

    @Test
    public void testTimViTriMang5() {
        int[] numbers = {100};
        assertEquals(0, bai1.timViTriMang(numbers, 100));  // Mảng chỉ có 1 phần tử, tìm thấy tại vị trí 0
    }

    @Test
    public void testTinhTongNSo1() {
        int[] numbers1 = {1, 2, 3, 4, 5};
        assertEquals(15, bai1.tinhTongNSo(numbers1));
    }
    @Test
    public void testTinhTongNSo2() {
        int[] numbers2 = {10, -5, 3, 4};
        assertEquals(12, bai1.tinhTongNSo(numbers2));
    }
    @Test
    public void testTinhTongNSo3() {
        int[] numbers3 = {-1, -2, -3, -4, -5};
        assertEquals(-15, bai1.tinhTongNSo(numbers3));
    }
    @Test
    public void testTinhTongNSo4() {
        int[] numbers4 = {0, 0, 0};
        assertEquals(1, bai1.tinhTongNSo(numbers4));
    }
    @Test
    public void testTinhTongNSo5() {
        int[] numbers5 = {};
        assertEquals(0, bai1.tinhTongNSo(numbers5));
    }

    @Test
    public void testTinhTongNSoLe1() {
        int[] numbers1 = {1, 2, 3, 4, 5};
        assertEquals(9, bai1.tinhTongNSoLe(numbers1));
    }
    @Test
    public void testTinhTongNSoLe2() {
        int[] numbers2 = {10, -5, 3, 4};
        assertEquals(-2, bai1.tinhTongNSoLe(numbers2));
    }
    @Test
    public void testTinhTongNSoLe3() {
        int[] numbers3 = {-1, -2, -3, -4, -5};
        assertEquals(-9, bai1.tinhTongNSoLe(numbers3));
    }
    @Test
    public void testTinhTongNSoLe4() {
        int[] numbers4 = {0, 0, 0};
        assertEquals(0, bai1.tinhTongNSoLe(numbers4));
    }
    @Test
    public void testTinhTongNSoLe5() {
        int[] numbers5 = {2, 4, 6, 8};
        assertEquals(0, bai1.tinhTongNSoLe(numbers5));
    }

}
