package week01;

/**
 * Created by waps12b on 2016. 1. 9..
 */
public class Fighter {


    /**
     * 두 week01.Fighter 클래스의 오브젝트의 friend멤버를 서로를 가리키게 설정해준다
     * 즉 파이터들이 서로를 친구로 등록하게 하는 기능
     * static method이지만 같은 클래스에 있으므로 각 오브젝트의 private한 멤버에 접근 가능
     * @param fighter1
     * @param fighter2
     */
    public static void makeFriend(Fighter fighter1, Fighter fighter2)
    {
        fighter1.friend = fighter2;
        fighter2.friend = fighter1;
    }

    public static int count = 0;


    private int level;
    private int exp;
    private String id;
    private boolean gender;
    private Fighter friend;

    //생성자
    Fighter()
    {
        count ++;
        this.level = 1;
        this.exp = 0;
        id = "anonymous";
        this.gender = true;
        this.friend = null;
    }

    Fighter(boolean gender)
    {
        this(); //자기 자신의 생성자를 한번 호출한다
        this.gender = gender;
    }

    /**
     * 생성자 또한 하나의 메소드로서 다양한 모양으로 오버로딩이 가능하다
     * @param id
     */
    Fighter(String id){
        //DB 에서 id 데이터를 찾고
        //level 불러오고
        //exp 불러오고...
    }


    /**
     * 현재 오브젝트와 fighter오브젝트를 서로 친구로 만들어주는 makeFriend를 호출해준다
     * @param fighter
     */
    public void setFriend(Fighter fighter)
    {
        makeFriend(this, fighter);
    }


    /**
     * 음식을 먹게하는 eat 메소드
     * @param food
     */
    private void eat(Food food)
    {
        System.out.println("먹었다");
    }

    /**
     * 오버로딩
     * 또한 이미 내부에 구현된 메소드의 기능을 thid.메소드명()으로 사용가능하다
     * @param food
     * @param food2
     */
    private void eat(Food food, Food food2)
    {
        this.eat(food);
        this.eat(food2);
    }

    /**
     * 오버로딩
     * @param food
     * @param fighter 현재 동작하는 주체인 오브젝트가 아니지만, 같은 클래스이므로 private멤버에 접근 가능
     *
     */
    void feed(Food food, Fighter fighter){
        fighter.eat(food);
    }
    void feed(Food food){
        friend.eat(food);
    }

    /**
     * 캐릭터가 경험치를 얻었을 때 이 메소드를 호출한다고 하자
     * @param getted   이 캐릭터가 얻은 경험치
     */
    public void getExp(int getted)
    {
        this.exp += getted;
        //경험치가 일정 이상 증가하면 레벨이 올라야한다
        if(this.exp >= 100)
        {
            level ++;
            if(level > Const.LEVEL_MAX ){
                level --;
            }
            this.exp -= 100;
        }

        //이 처럼 멤버의 값이 변하면 내부적으로 수 많은 side-effect에 대한 처리가 필요한 경우가 있다
        //이때 사용자가 직접 멤버를 수정하는게 아닌 메소드를 통해 수정하게하면
        //이에 대한 대응을 쉽게 할 수 있다
    }

}
