package org.apache;

import org.apache.commons.lang3.StringUtils;

public class a01StringUtilsTest {
    public static void main(String[] args) {

        String ss = "";
        //JDK判断是否是空格
        boolean whitespace = Character.isWhitespace(ss.indexOf(1));

        //判断字符串null或者 "" 或者内容是空格（1个或者多个空格） 结果是true
        boolean blank = StringUtils.isBlank(ss);
        //false
        blank = StringUtils.isNotBlank(ss);
        System.out.println(blank);

        //字符串是null 或者长度为0 返回true
        boolean empty = StringUtils.isEmpty(ss);
        empty = StringUtils.isNotEmpty(ss);

        /**
         * 对手机号进行脱敏处理，比如将中间四位设置为4个星号
         */
        String mobileNumber = "12345679889";
        //返回字符串左边的几个字符,结果是123
        String left = StringUtils.left(mobileNumber, 3);
        System.out.println(left);
        //返回字符串右边的几个字符,，本例是返回右边4位结果是9889
        String right = StringUtils.right(mobileNumber, 4);
        System.out.println(right);
        //结果是  ****123
        String leftPad = StringUtils.leftPad(left, 7, "*");
        //如果长度小于指定长度（本例是7），则用指定字符添加到字符右边拓展到指定长度
        String rightPad = StringUtils.rightPad(left, 7, "*");
        System.out.println(leftPad);
        //123****9889
        System.out.println(rightPad + right);

    }
}
