package kallin.chen.sort;

public interface IArraySort {
    /**
     * 冒泡排序
     *
     * @param array
     * @return
     */
    int[] BubbleSort(int[] array);

    /**
     * 选择排序
     *
     * @param array
     * @return
     */
    int[] SelectionSort(int[] array);

    /**
     * 插入排序
     *
     * @param array
     * @return
     */
    int[] InsertSort(int[] array);

    /**
     * 希尔排序
     *
     * @param array
     * @return
     */
    int[] ShellSort(int[] array);

    /**
     * 归并排序
     *
     * @param array
     * @return
     */
    int[] MergeSort(int[] array);
}
