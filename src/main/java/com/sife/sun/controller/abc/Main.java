package com.sife.sun.controller.abc;

import com.sife.sun.common.utils.HttpUtils;

public class Main {


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                HttpUtils.doGet("http://127.0.0.1:8080/sun/buyProduct?productCode=PD000001");
            });
            thread.start();
        }
    }

}
