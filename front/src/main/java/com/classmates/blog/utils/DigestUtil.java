package com.classmates.blog.utils;


import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * @auth yangzhiwei
 * @date 2020-11-15 20:22
 */

//加盐（salt）后取摘要（digest）
    // key1: 不同密码的盐应该不同

public class DigestUtil {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println((int) 'A');
        Random random = new Random();

        byte[] res = DigestUtils.md5("aaa");
        System.out.println(res.length);
        byte[] encode = {res[0],res[1]};
     /*   System.out.println(new String(encode,"utf-8"));


        for (int i = 0;i < res.length; i++) {

            System.out.println((char)res[i]);
        }*/

//        for (int i = 0; i < encode.length; i++) {
//            int a = (int)encode[i];
//            System.out.print(a + " ");
//        }

        //String s = new String(encode,"GBK");
        //System.out.println(s);
        //byte[] encode = s.getBytes("GBK");

        for (int i = 0; i < encode.length; i++) {
            int a = (int)encode[i];
            System.out.print(a + " ");
        }
        System.out.println(encode.length);
        byte[] test = "G".getBytes("GBK");
        for (int i = 0; i < test.length; i++) {
            int a = (int)test[i];
            System.out.print(a + " ");
        }

        String testGBK = "�";
        byte[] testgBk = testGBK.getBytes("GBK");
        System.out.println(testgBk.length);
        System.out.println();
        for (int i = 0; i < testgBk.length; i++) {
            int a = (int)testgBk[i];
            System.out.print(a + " ");
        }



        /*for(int i = 0; i < 10000; i++) {
            int j;
            if (( j = random.nextInt(Integer.MAX_VALUE)) < 0) {
                System.out.println(j);
            }
        }*/
    }
    // apache codec 主要是用于摘要，加密
    private static String md5(String src) {
        String md5Res = new String (DigestUtils.md5(src));
        DigestUtils.md5Hex(src);
        return md5Res;
    }

    /**
     *
     * @param一个标识性字符串
     * @return 基于该字符串的随机字符串
     */
    private String generateSalt(String source) {
        Random random = new Random();

        //random.nextInt()
        String md5Res = new String (DigestUtils.md5(source));
        return null;
    }

    /**
     *
     * @param pass 可以是原始密码
     * @param salt 你应该包名不同的密码有不同的盐，这会提高密码的安全性
     * @return
     */
    public String passAndSaltmd5(String pass,String salt) {

      //  md5()
        return null;
    }
}
