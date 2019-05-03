/**
 * @author xukai
 * @date 2019/5/2 - 23:07
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy，则经过替换之后的字符串为We%20Are%20Happy。
 *
 * 解题思路：
 * 由于每个空格替换成了三个字符，首先要扩容字符串长度至替换后的长度，
 * 因此当遍历到一个空格时，需要在尾部填充两个任意字符。
 * 然后声明两个下标，一个为原字符串末尾下标 i，一个为现字符串末尾 j，
 * 两个下标同步从后往前扫。当 i 指向空格时，j 就倒着依次添加 ‘0’, ‘2’, ‘%’。
 *这样做的目的是： j 下标不会超过 i 下标，不会影响原字符串的内容。
 */
public class Tihuan {


        public  static String replacespace(StringBuffer str){
            int oldLen = str.length();
            for(int i = 0 ; i < oldLen ; i ++){
                if(str.charAt(i) == ' '){
                    str.append("12");
                }
            }
            int i = oldLen - 1;
            int j = str.length() - 1;

            while (i >= 0 && j > i){
                char c = str.charAt(i);
                i --;
                if(c == ' '){
                    str.setCharAt(j, '0');
                    j --;
                    str.setCharAt(j , '2');
                    j--;
                    str.setCharAt(j,  '%');
                    j--;
                }else{
                    str.setCharAt(j , c);
                    j --;
                }
            }
            return  str.toString();
        }

}
