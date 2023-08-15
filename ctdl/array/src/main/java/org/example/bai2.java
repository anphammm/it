package array.src.main.java.org.example;
import java.util.ArrayList;
import java.util.List;
public class bai2 {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.remove(12); // 0(n) | n remove 0,
        arr.clear();
        arr.contains(1); // 0(n) |
    }
// đóng gói

}
//    add(E element một mảng Object): Thêm một phần tử element vào cuối danh sách.
//    Trong phiên bản này, phần tử sẽ được thêm vào cuối danh sách
//    và trở thành phần tử cuối cùng.
// mỗi lần ép vào một phần tử thì size của nó sẽ tăng lên
// size của nó nếu quá length bên phải thì nó sẽ tăng kích thước của arry líst lên

//remove(Object o): Loại bỏ đối tượng o khỏi tập hợp nếu nó tồn tại trong tập hợp.
// Nếu không tìm thấy đối tượng, tập hợp không thay đổi.
// dich mot don vi di len


//Phương thức clear được sử dụng để xóa tất cả các phần tử khỏi tập hợp,
// làm cho tập hợp trở thành trống.
// bản chất của nó ko clear cái gì cả
// nó chỉ duyệt từ đầu cho đến cuối mảng
// rồi gắn tất cả phần tử mảng = null, chỉ thay đổi cái biến size thành 0


//contains(Object o): Kiểm tra xem đối tượng o có tồn tại trong tập hợp hay không.
// Phương thức này trả về true nếu đối tượng được tìm thấy, và false nếu không tìm thấy.