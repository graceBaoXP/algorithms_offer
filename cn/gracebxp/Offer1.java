package cn.gracebxp;

/**
 * 二维数组中的查找
 *
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Offer1 {
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||array[0].length==0){
                return  false;
        }
        int r=0,c=array[0].length-1;
        int row=array.length,col=array[0].length;
        while (r<row&&c>=0){
            if (target==array[r][c]){
                return true;
            }else if(target>array[r][c]){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}
