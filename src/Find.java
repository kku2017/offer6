/**
 * @author xukai
 * @date 2019/5/2 - 22:54
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 * 因为矩阵中的每一个数，左边都比它小，下边都比它大。
 * 因此，从右上角开始查找，就可以根据 target
 * 和当前元素的大小关系来缩小查找区间。
 */
public class Find {
    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        int m = 0, n = array[0].length - 1;//从右上角开始找，array[0][n-1]
        while (m <= array.length - 1 && n >= 0) {
            if (target == array[m][n]) return true;
            else if (target >= array[m][n])
                m++;
            else
                n--;
        }
    }

}





