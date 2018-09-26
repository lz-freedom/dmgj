package com.example.github.dmgj;

import java.util.HashSet;

public class Name {

    public static String zx[] = {"1号","2号","3号","4号","5号","6号","7号","8号","9号"};

    public static String[] tr() {
        HashSet pdcf = new HashSet();
//        String student [] = {"陈鑫谈","管兴","谷文崇","刘方胜","姚志成",
//                "汝凡玥","程旭博","徐习习","褚博文","鲍晋轩","刘展",
//                "冯轩","顾靖","刘正翰","桑闯","李小飞","吴坤","张月明",
//                "金梦颖","黄新潜","刘冬","杨龙梅","王芸","余芳萍","陆光辉","于志国","滕强","方小虎","周阳","刘思琪",
//                "张金慧","黄志群","何明慧","孙玉龙","张明波","胡嗣良","周志远","李娟娟"};
        for (int i = 0;i<9;i++) {
            int random = (int)(Math.random()*activity_ss.length);
            if (pdcf.add(random)){
                zx[i] = activity_ss.student[random];
            }else i--;
        }

        return zx;

    }
}
