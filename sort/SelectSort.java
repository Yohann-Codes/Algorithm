package sort;

/**
 * 选择排序.
 *
 * 在未排序序列中找到最小元素(升序)，存放到排序序列的起始位置
 * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾
 * 以此类推，直到所有元素均排序完毕.
 *
 * @author Yohann.
 */
public class SelectSort {

    public static int[] selectSort(int[] numbers) {
        int size = numbers.length;

        // 循环size-1次
        for (int i = 0; i < size - 1; i++) {
            // 选择第i个位置的数
            for (int j = i + 1; j < size; j++) {
                // 从i+1开始遍历
                if (numbers[i] > numbers[j]) {
                    // 交换值
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers;
    }
}
