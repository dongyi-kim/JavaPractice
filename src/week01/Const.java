package week01;

/**
 * Created by waps12b on 2016. 1. 9..
 * 가끔 프로젝트 전체에
 */
public class Const {

    public static final String developer = "me";
    public static final int LEVEL_MAX = 100;


    /**
     * 보통 이런 클래스들은 static변수나 메서드에 대한 정의를 위해서만 사용하기 때문에
     * 불필요한 오브젝트 생성을 막아 둘 필요가 있다
     * 생성자에 제한자를 걸어서 방지할 수 있다
     */
    private Const()
    {


    }


}
