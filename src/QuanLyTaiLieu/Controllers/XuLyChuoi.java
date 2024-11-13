/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyTaiLieu.Controllers;

public class XuLyChuoi {
    public static String ChuyenDoiChuoi(String str)
    {
        //1. Loại bỏ khoảng trắng đầu 2 chuỗi
        str=str.trim();
        //2. Xóa bỏ dấu cách thừa
        while(str.indexOf("  ")!=-1)
        {
            str=str.replace("  "," ");
        }
        //3. Chuyển đổi chữ cái đầu thành viết hoa, chữ sau viết thường
        String[] arresult=str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arresult.length; i++)
        {
            result.append(Character.toUpperCase(arresult[i].charAt(0)) + arresult[i].substring(1).toLowerCase() + " ");
        }
        return result.toString().trim();

    }
}
