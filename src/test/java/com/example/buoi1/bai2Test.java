package com.example.buoi1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class bai2Test {
    //Bai1 - Buổi2
//    Kiểm tra với 2 số nguyên dương
    @Test
    public void testNguyenDuong() {
        assertEquals(18, bai2.nhanTichHaiSoNguyen(6, 3));
    }

    //    Kiểm tra với 2 số nguyên âm
    @Test
    public void testNguyenAm() {
        assertEquals(18, bai2.nhanTichHaiSoNguyen(-6, -3));
    }

    //    Kiểm tra với số dương và âm
    @Test
    public void testDuongAm() {
        assertEquals(-12, bai2.nhanTichHaiSoNguyen(-6, 2));
    }

    //    Kiểm tra với số 0
    @Test
    public void testso0() {
        assertEquals(0, bai2.nhanTichHaiSoNguyen(0, 4));
    }

    // Kiểm tra số lớn
    @Test
    void testSoLon() {
        assertEquals(2147395600, bai2.nhanTichHaiSoNguyen(46340, 46340));
    }

    // Kiểm tra số nhỏ nhất của Integer
    @Test
    void testMinInt() {
        assertEquals(0, bai2.nhanTichHaiSoNguyen(Integer.MIN_VALUE, 0));
    }

    // Kiểm tra số lớn nhất của Integer
    @Test
    void testMaxInt() {
        assertEquals(Integer.MAX_VALUE, bai2.nhanTichHaiSoNguyen(Integer.MAX_VALUE, 1));
    }

    // Kiểm tra nhân hai số giống nhau
    @Test
    void testSameNumbers() {
        assertEquals(64, bai2.nhanTichHaiSoNguyen(8, 8));
    }

    // Kiểm tra nhân với 1
    @Test
    void testMultiplicationByOne() {
        assertEquals(99, bai2.nhanTichHaiSoNguyen(99, 1));
    }


    //Bài 2
// Kiểm tra với hai số nguyên dương
    @Test
    void testChiaHaiSoNguyenDuong() {
        assertEquals(4, bai2.chiaHaiSoNguyen(20, 5));
    }

    // Kiểm tra với hai số nguyên âm
    @Test
    void testChiaHaiSoNguyenAm() {
        assertEquals(2, bai2.chiaHaiSoNguyen(-4, -2));
    }

    // Kiểm tra với số dương và số âm
    @Test
    void testChiaHaiSoDuongAm() {
        assertEquals(-2, bai2.chiaHaiSoNguyen(-10, 5));
    }

    // Kiểm tra với số 0 ở tử số
    @Test
    void testChiaSo0() {
        assertEquals(0, bai2.chiaHaiSoNguyen(0, 2));
    }

    // Kiểm tra số lớn
    @Test
    void testChiaSoLon() {
        assertEquals(1, bai2.chiaHaiSoNguyen(2147483647, 2147483647));
    }

    // Kiểm tra số nhỏ nhất của Integer
    @Test
    void testChiaSoNhoNhat() {
        assertEquals(1, bai2.chiaHaiSoNguyen(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    // Kiểm tra số lớn nhất của Integer
    @Test
    void testChiaSoLonNhat() {
        assertEquals(1, bai2.chiaHaiSoNguyen(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    // Kiểm tra chia hai số giống nhau
    @Test
    void testChiaHaiSoGiongNhau() {
        assertEquals(1, bai2.chiaHaiSoNguyen(10, 10));
    }

    // Kiểm tra chia cho 1
    @Test
    void testChiaCho1() {
        assertEquals(100, bai2.nhanTichHaiSoNguyen(100, 1));
    }

    // Kiểm tra chia cho 0
    @Test
    void testChiaCho0NgoaiLe() {
        Exception exception = assertThrows(ArithmeticException.class, () -> bai2.chiaHaiSoNguyen(10, 0));
        assertEquals("Ko chia được", exception.getMessage());
    }


    //Bài 3
    @Test
    void testTBC1() {
        assertEquals(2.5, bai2.tinhTBC(List.of(1, 2, 3, 4)));
    }

    @Test
    void testTBC2() {
        assertEquals(3.0, bai2.tinhTBC(List.of(1, 2, 3, 4, 5)));
    }

    @Test
    void testTBC3() {
        assertEquals(0.0, bai2.tinhTBC(List.of(0, 0, 0)));
    }

    @Test
    void testTBC4() {
        assertThrows(ArithmeticException.class, () -> bai2.tinhTBC(List.of()));
    }

    @Test
    void testTBC5() {
        assertEquals(-3.0, bai2.tinhTBC(List.of(-1, -2, -3, -4, -5)));
    }

    @Test
    void testTBC6() {
        assertEquals(99, bai2.tinhTBC(List.of(99, 99, 99, 99)));
    }

    @Test
    void testTBC7() {
        assertEquals(2.5, bai2.tinhTBC(List.of(2, 3)));
    }

    @Test
    void testTBC8() {
        assertEquals(100.0, bai2.tinhTBC(List.of(100, 100, 100)));
    }

    @Test
    void testTBC9() {
        assertEquals(50.0, bai2.tinhTBC(List.of(50, 50, 50)));
    }

    @Test
    void testTBC10() {
        assertEquals(1.0, bai2.tinhTBC(List.of(1, 1, 1, 1)));
    }


    //    Bài 4
    @Test
    void testLayPhanTuTaiViTri1() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(30, bai2.layPhanTu(arr, 2));
    }

    @Test
    void testLayPhanTuTaiViTri2() {
        int[] arr = {99, 88, 77, 66, 55};
        assertEquals(99, bai2.layPhanTu(arr, 0));
    }

    @Test
    void testLayPhanTuTaiViTri3() {
        int[] arr = {5, 15, 25, 35, 45};
        assertThrows(IndexOutOfBoundsException.class, () -> bai2.layPhanTu(arr, 10));
    }

    @Test
    void testLayPhanTuTaiViTri4() {
        int[] arr = {7, 14, 21, 28, 35};
        assertEquals(35, bai2.layPhanTu(arr, 4));
    }

    @Test
    void testLayPhanTuTaiViTri5() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(3, bai2.layPhanTu(arr, 1));
    }

    @Test
    void testLayPhanTuTaiViTri6() {
        int[] arr = {42, 24, 12, 6};
        assertThrows(IndexOutOfBoundsException.class, () -> bai2.layPhanTu(arr, -1));
    }

    @Test
    void testLayPhanTuTaiViTri7() {
        int[] arr = {999};
        assertEquals(999, bai2.layPhanTu(arr, 0));
    }

    @Test
    void testLayPhanTuTaiViTri8() {
        int[] arr = {111, 222, 333};
        assertEquals(222, bai2.layPhanTu(arr, 1));
    }

    @Test
    void testLayPhanTuTaiViTri9() {
        int[] arr = {55, 44, 33};
        assertEquals(33, bai2.layPhanTu(arr, 2));
    }

    @Test
    void testLayPhanTuTaiViTri10() {
        int[] arr = {100, 200, 300};
        assertEquals(300, bai2.layPhanTu(arr, 2));
    }


    //    Bài 5
    @Test
    void testLayTenDoiTuong1() {
        assertEquals("Xin chào", bai2.layTen("Xin chào"));
    }

    @Test
    void testLayTenDoiTuong2() {
        assertEquals("456", bai2.layTen(456));
    }

    @Test
    void testLayTenDoiTuong3() {
        assertEquals("false", bai2.layTen(false));
    }

    @Test
    void testLayTenDoiTuong4() {
        assertEquals("empty", bai2.layTen("empty"));
    }

    @Test
    void testLayTenDoiTuong5() {
        assertEquals("JUnit Test", bai2.layTen(new String("JUnit Test")));
    }

    @Test
    void testLayTenDoiTuong6() {
        assertThrows(NullPointerException.class, () -> bai2.layTen(null));
    }

    @Test
    void testLayTenDoiTuong7() {
        assertEquals("Custom Object", bai2.layTen(new Object() {
            public String toString() {
                return "Custom Object";
            }
        }));
    }

    @Test
    void testLayTenDoiTuong8() {
        assertEquals("2.718", bai2.layTen(2.718));
    }

    @Test
    void testLayTenDoiTuong9() {
        assertEquals("true", bai2.layTen(true));
    }

    @Test
    void testLayTenDoiTuong10() {
        assertEquals("0.007", bai2.layTen(0.007));
    }


    //    Bài 6
    @Test
    void testTimPhanTuNhoNhat1() {
        assertEquals(3, bai2.timMin(new int[]{7, 3, 9, 12, 15}));
    }

    @Test
    void testTimPhanTuNhoNhat2() {
        assertEquals(5, bai2.timMin(new int[]{5, 15, 25, 35}));
    }

    @Test
    void testTimPhanTuNhoNhat3() {
        assertEquals(-20, bai2.timMin(new int[]{-10, -15, -20, -5}));
    }

    @Test
    void testTimPhanTuNhoNhat4() {
        assertEquals(1, bai2.timMin(new int[]{1, 5, 10, 20}));
    }

    @Test
    void testTimPhanTuNhoNhat5() {
        assertEquals(-200, bai2.timMin(new int[]{-200, -150, -50, -10}));
    }

    @Test
    void testTimPhanTuNhoNhat6() {
        assertEquals(42, bai2.timMin(new int[]{42, 42, 42, 42}));
    }

    @Test
    void testTimPhanTuNhoNhat7() {
        assertEquals(2, bai2.timMin(new int[]{8, 6, 4, 2}));
    }

    @Test
    void testTimPhanTuNhoNhat8() {
        assertEquals(11, bai2.timMin(new int[]{11, 22, 33, 44}));
    }

    @Test
    void testTimPhanTuNhoNhat9() {
        assertEquals(0, bai2.timMin(new int[]{0, 1, 2, 3}));
    }


    @Test
    void testTimPhanTuNhoNhat10() {
        assertThrows(IllegalArgumentException.class, () -> bai2.timMin(new int[]{}));
    }
}


