package com.codegym;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        String sentence = "JDK là một bộ phát một triển phần mềm trong khi JRE là một gói phần mềm cho phép chương trình Java chạy " +
                "Một chương trình viết bằng ngôn ngữ bậc cao cần được dịch sang ngôn ngữ máy" +
                "Từ khóa static trong Java được sử dụng chính để quản trị bộ nhớ";

        Map<String, Integer> treemap = new TreeMap<>();
        String[] arr = sentence.toLowerCase().split(" ");
        System.out.println("Hiện các từ trong chuỗi nhập");
        for (String s : arr) {
            System.out.print(s+ ", ");
        }

        for (String s : arr) {
            if (treemap.containsKey(s)) {      // nếu trong map đã có key s thì tăng value lên 1
                int count = treemap.get(s);
                treemap.replace(s, count + 1);
            } else {                            // nếu chưa có thì đặt entry (s, 1) vào trong map
                treemap.put(s, 1);
            }
        }


        // in ra map
        treemap.entrySet().forEach(entry -> {
            System.out.println("Từ \"" + entry.getKey() + "\" xuất hiện " + entry.getValue() + " lần");
        });

    }
}
