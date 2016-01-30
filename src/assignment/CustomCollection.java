package assignment;

import java.util.ArrayList;

/**
 * Created by waps12b on 2016. 1. 30..
 */
public abstract class CustomCollection<T>
{

    //OnResizeListener들을 저장합니다
    private ArrayList<OnFiveItemListener> listeners;

    /**
     * Default Constructor
     */
    protected CustomCollection()
    {
        listeners = new ArrayList<>();
    }


    /**
     * 새로운 아이템을 받아 Collection에 추가합니다
     * @param obj
     */
    abstract public void insert(T obj);

    /**
     * Collection에서 아이템을 하나 제거합니다
     * 컬렉션의 정의에 따라 다른 아이템이 제거될 수 있습니다
     * @return
     */
    abstract public T remove();

    /**
     * Collection에 현재 저장된 Item의 개수를 반환합니다
     * @return
     */
    abstract public int size();


    /**
     * Collection에 현재 저장된 Item을 모두 삭제합니다
     * @return
     */
    abstract public void clear();




    public interface OnFiveItemListener
    {
        void onFiveItemEvent();
    }

    /**
     * 컬렉션 내부에 저장된 아이템이 5개가 되었을 때 호출 될 리스너를 추가합니다
     * @param l
     */
    public final void addOnFiveLisener(OnFiveItemListener l)
    {
        listeners.add(l);
    }

    /**
     * 저장된 아이템이 5개가 됬을 때 호출하면 됩니다
     * 호출되면 listeners에 저장된 모든 리스너들을 한번씩 호출합니다
     */
    protected final void onFiveItem()
    {
        for(OnFiveItemListener l : listeners)
        {
            l.onFiveItemEvent();
        }
    }

}
