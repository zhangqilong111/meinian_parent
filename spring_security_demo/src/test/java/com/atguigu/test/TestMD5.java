package com.atguigu.test;

import com.atguigu.util.MD5Utils;

public class TestMD5 {
    public static void main(String[] args) {

        /**
         * MD5算法特点：
         * 1.原文加密成密文，生成固定长度16字节，我们可以将每一个字节分解出高四位和低四位
         * 2.原文不变，加密密文相同
         * 3.不可逆，只能加密，不能解密。可以通过彩虹表进行碰撞破解。
         * 3.已经被破解，直接使用不太安全。密文最好连续加密15次以上，不易被破解。或者采用加盐的方式进行加密。
         */
        String md5 = MD5Utils.md5("d9b1d7db4cd6e70935368a1efb10e377");
        System.out.println(md5);
        //202cb962ac59075b964b07152d234b70
        //202cb962ac59075b964b07152d234b70

        //d9b1d7db4cd6e70935368a1efb10e377
        //7363a0d0604902af7b70b271a0b96480
    }
}
