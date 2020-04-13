/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huyttd.utils;

/**
 *
 * @author KRIS
 */
public class MyToys {

    //Class này chứa các hàm tiện ích dùng chung cho mọi Project
    // => Method trong class sẽ là Static
    // cF: computeFactorial: Tính n! = 1*2*3*...*n;
    // trong đó: n >= 0 && n <=15; 0! = 1;
    // 15 là số lớn, có thể cho hơn nếu muốn
    // Vì n! tăng tiến giá trị nhanh nên dùng biến "long" để lưu kết quả
    // Dành cho CI (Continuous Integration), Đệ quy Recursion sau
    public static long cF(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("n must be between 1...15");
        }

        if (n == 0) {
            return 1;
        }
        // Đến đây, n từ 1...15
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

}
