/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static huyttd.utils.MyToys.cF;

/**
 *
 * @author KRIS
 */
public class MyToysTest {

    //Class "Test" này dùng để test các Method ta viết, đảm bảo chất lượng
    // Mỗi "Method" cần chuẩn bị: giá trị kì vọng (Expected Value) sau đó chạy thử Method
    // => xem kết quả xử lý, so sánh xem đúng với "Giá trị kì vọng" không
    // Nếu không đúng: 1/ Sai ở Expected Value hoặc 2/ Code của Method sai
    // Việc kiểm tra kết quả của một Method được gọi là "Test Case" 
    // Ex: Login: case 1 -> Đúng Username, password => Login Success
    //            case 2 -> Đúng Username, sai Password => Thông báo sai 
    // Mỗi Test Case dùng cho mỗi hàm
    // Tình huống Method cF() chạy đúng
    @Test // Dùng "Annotation" biến Method bất kì đi kèm JUnit thành Public static void main()
    public void testSuccessfulCases() {
        // Method Test này được viết với mục đích so sánh Expected Value với Kết quả của Method
        // KẾT QUẢ: In ra màu xanh nếu tất cả Kết quả khớp với Expected Value đi kèm
        //          In ra màu đỏ nếu có một Kết quả không khớp với Expected Value đi kèm
        assertEquals(1, cF(0));

        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));

    }

    // Trường hợp xảy ra Exception: vì Exception không phải là một Value để so sánh
    // không ước lượng chính xác giá trị => không thể dùng để so sánh với một Value khác
    // => không thể dùng Method "AssertX" được
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionCases() {
        cF(-5);
        cF(-6);
    }
    
    // Trường hợp Clean and Build: Success or Failed
    // Nếu không Setup thì "Ant không quan tâm lỗi Logic" mà vẫn Clean and Build bình thường
    // Nếu muốn Setup Ant thì thay đổi Code trong File "build.xml" và "build-impl.xml" 

    
    // Clean and Build trên là làm thủ công
    // Sử dụng "JENKINS" để tự động hóa việc Clean and Build tạo File .jar
    // NHIỆM VỤ CỦA JENKINS:
    // 1/ Theo dõi Git, khi có thay đổi do DEVs push code lên Git Server
    // => Kéo code về máy của DEVs đó (local)
    // => Gọi Ant ngay tại Local
    // => Tự động chạy Ant để Check xem Code chạy đúng bao gồm cả việc Test
    //    --> Trường hợp Test đúng: tạo File .jar
    //    --> Trường hợp Test sai: Copy lỗi gửi Mail cho DEVs
    // 2/ Luôn luôn theo dõi và kiểm tra Code trên Git Server - Continuous Integration
    
    
}
