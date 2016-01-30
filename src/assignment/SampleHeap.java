package assignment;

import java.util.Comparator;

/**
 * Created by waps12b on 2016. 1. 30..
 */
public class SampleHeap<T> extends CustomCollection<T>{

    private int count;
    private T[] array;
    private Comparator<T> cmp;

    public SampleHeap(Comparator<T> cmp)
    {
        this.cmp = cmp;
        clear();
    }

    @Override
    public void clear() {
        this.array = (T[])(new Object[1]);
        this.count = 0;
    }

    @Override
    public void insert(T obj)
    {
        if(count+1 == array.length)
        {   //
            T[] newArray = (T[])(new Object[array.length * 2]);
            for(int i = 1; i < array.length; i++) {
                newArray[i] = array[i];
            }
            this.array = newArray;
        }

        this.count ++;
        array[count] = obj;
        for(int index = count; index > 1 ; index/=2) {
            if(hasToSwap(index, getParent(index)))
            {
                swap(index, getParent(index));
            }
        }

        /**
         * 아이템이 5개가 되었다면 onFiveItem호출
         */
        if(count == 5)
            onFiveItem();
    }



    @Override
    public T remove(){
        if(count < 1)
            return null;


        T ret = array[1];
        array[1] = null;
        swap(1, count);
        count --;

        int index = 1;
        while( true )
        {
            if(hasValue(getLeftChild(index)) && hasValue(getRightChild(index)))
            {
                if(hasToSwap(getLeftChild(index),index) && hasToSwap(getRightChild(index), index))
                {
                    if(hasToSwap(getLeftChild(index), getRightChild(index)))
                    {
                        swap(getLeftChild(index), index);
                        index = getLeftChild(index);
                        continue;
                    }else
                    {
                        swap(getRightChild(index), index);
                        index = getRightChild(index);
                        continue;
                    }
                }else if(hasToSwap(getLeftChild(index), index))
                {
                    swap(getLeftChild(index), index);
                    index = getLeftChild(index);
                    continue;
                }else if(hasToSwap(getRightChild(index), index)){
                    swap(getRightChild(index), index);
                    index = getRightChild(index);
                    continue;
                }
                else{
                    break;
                }
            }else if(hasValue(getLeftChild(index)))
            {
                if(hasToSwap( getLeftChild(index) , index))
                {
                    swap(getLeftChild(index), index);
                    index = getLeftChild(index);
                    continue;
                }else {
                    break;
                }
            }else
            {
                break;
            }
        }
        /**
         * 아이템이 5개가 되었다면 onFiveItem호출
         */
        if(count == 5)
            onFiveItem();

        return ret;
    }


    @Override
    public int size() {
        return count;
    }



    /**
     * 두 index의 value를 교환합니다
     * @param index1
     * @param index2
     */
    private void swap(int index1, int index2)
    {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * 해당 index 노드가 존재하고, 또 값을 가지고 있는지 여부를 반환합니다
     * @param index
     * @return
     */
    private boolean hasValue(int index)
    {
        if(index > count)
            return false;
        return (array[index] != null);
    }

    /**
     * 해당 index의 왼쪽 자식노드의 인덱스를 구합니다
     * @param index
     * @return
     */
    private int getLeftChild(int index)
    {
        return index * 2;
    }

    /**
     * 해당 index의 오른쪽 자식노드의 인덱스를 구합니다
     * @param index
     * @return
     */
    private int getRightChild(int index)
    {
        return index * 2 + 1;
    }

    /**
     * 해당 index의 부모노드의 인덱스를 구합니다
     * @param index
     * @return
     */
    private int getParent(int index)
    {
        return index/2;
    }

    /**
     * 부모 노드의 값이 자식 노드보다 우선순위가 작다면 true를 반환합니다
     * @param child
     * @param parent
     * @return
     */
    private boolean hasToSwap(int child, int parent)
    {
        return cmp.compare(array[child], array[parent]) > 0;
    }

}
