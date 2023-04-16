package org.apache;

import org.apache.commons.lang3.math.NumberUtils;

public class a02NumberUtilsTest {
    public static void main(String[] args) {
        //判断一个参数是不是数字
        String str = "123aa";
        //只能判断整数,false
        System.out.println(NumberUtils.isDigits(str));
        //false
        System.out.println(NumberUtils.isDigits("12.3"));
        //false
        System.out.println(NumberUtils.isDigits("+12.3"));
        //false
        System.out.println(NumberUtils.isDigits("+12"));
        //true
        System.out.println(NumberUtils.isDigits("12"));
        //false
        System.out.println(NumberUtils.isDigits("-12"));
        /**
         * isParsable可以判断是不是整数，浮点数，不能识别正负
         */
        //true
        System.out.println(NumberUtils.isParsable("12.3"));
        //false
        System.out.println(NumberUtils.isParsable("+12.3"));
        //true
        System.out.println(NumberUtils.isParsable("-12.3"));



    }
}
