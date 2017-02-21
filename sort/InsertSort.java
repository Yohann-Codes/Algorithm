package sort;

/**
 * 插入排序:
 *      1) 直接插入排序
 *      2) 二分插入排序
 *
 * 有一个已经有序的数据序列，要求在这个已经排好的数据序列中插入一个数，
 * 但要求插入后此数据序列仍然有序，这个时候就要用到一种新的排序方法——插入排序法.
 *
 * @author Yohann.
 */
public class InsertSort {

    /**
     * 直接插入排序
     *
     * @param numbers 有序数组(升序)
     * @param n 待插入数据
     * @return
     */
    public static int[] directInsertSort(int[] numbers, int n) {
        int size = numbers.length;
        int[] numbersNew = new int[size + 1];
        int sizeNew = numbersNew.length;

        // 拷贝数组，最后一位空出
        for (int i = 0; i < size; i++) {
            numbersNew[i] = numbers[i];
        }

        // 最好的情况，不需要移动
        if (numbersNew[sizeNew - 2] <= n) {
            numbersNew[sizeNew - 1] = n;
            return numbersNew;
        }

        // 需要移动的情况
        // 从左到右遍历新数组中的元素，找出第一个大于n的位置
        for (int i = 0; i < sizeNew - 1; i++) {
            if (numbersNew[i] > n) {
                // 从i位置开始向后移动
                for (int j = sizeNew - 2; j >= i;j--) {
                    numbersNew[j + 1] = numbersNew[j];
                }
                // 将n插入到i位置
                numbersNew[i] = n;
                break;
            }
        }

        return numbersNew;
    }
}
