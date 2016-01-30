package assignment;

/**
 * Created by waps12b on 2016. 1. 30..
 */
public class SampleQueue<T> extends CustomCollection<T> {

    private int count;
    private int head;
    private int tail;
    private T[] array;


    public SampleQueue()
    {
        clear();
    }

    @Override
    public void clear() {
        this.array = (T[])(new Object[1]);
        this.head = 0;
        this.tail = 0;
    }

    @Override
    public void insert(T obj)
    {
        if(count + 1 == array.length)
        {
            T[] newArray = (T[])(new Object[array.length*2]);
            for(int i = 0 ; i < count; i++)
            {
                newArray[i] = array[head];
                head = getNext(head);
            }
            head = 0;
            tail = count;
            this.array = newArray;
        }

        array[tail] = obj;
        tail = getNext(tail);
        count ++;

        /**
         * 아이템이 5개가 되었다면 onFiveItem호출
         */
        if(count == 5)
            onFiveItem();
    }

    @Override
    public T remove()
    {
        if( count == 0 )
            return null;
        count --;
        T ret = array[head];
        head = getNext(head);


        /**
         * 아이템이 5개가 되었다면 onFiveItem호출
         */
        if(count == 5)
            onFiveItem();

        return ret;

    }

    @Override
    public int size() {
        return this.count;
    }


    /**
     * index의 다음 인덱스를 계산합니다
     * @param index
     * @return
     */
    private int getNext(int index)
    {
        return (index+1) % array.length;
    }

    /**
     * index의 이전 인덱스를 계산합니다
     * @param index
     * @return
     */
    private int getBack(int index)
    {
        return (index-1+array.length) % array.length;
    }
}
