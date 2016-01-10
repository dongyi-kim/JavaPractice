package week01.pack2;


/**
 * Created by waps12b on 2016. 1. 9..
 *
 * 다른 패키지에 있는 myclass에서 이 클래스의 다양한 멤버에 접근해봅시다
 *
 */
public class YourClass
{
    int defaultMember;
    private int privateMember ;
    protected int protectedMember ;
    public int publicMember;

    //static 변수들은 선언시에 초기화를 해주는게 보통
    public static int staticPublicVariable    = 1;
    private static int staticPrivateVariable = 1;

    void defaultMethod()
    {
        System.out.println("It's default Method of a instance of the YourClass.java");
    }
    protected void protectedMethod()
    {
        System.out.println("It's protected Method of a instance of the YourClass.java");
    }
    private void privateMathod()
    {
        System.out.println("It's private Method of a instance of the YourClass.java");
    }
    public void publicMethod()
    {
        System.out.println("It's public Method of a instance of the YourClass.java");
    }


    /**
     * constructor에도 제한자를 항상 적어주는게 좋은 버릇
     */
    public YourClass()
    {
        //constructor은 멤버에
        defaultMember = 0;
        privateMember = 0;
        protectedMember = 0;
        publicMember = 0;
    }

    public void setPrivateMember(int privateMember)
    {   //setter for privaeMember
        this.privateMember = privateMember;
    }

    public int getPrivateMember()
    {
        return this.privateMember;
    }

    public void setProtectedMember(int protectedMember)
    {
        this.protectedMember = protectedMember;
    }
    public int getProtectedMember(){
        return this.protectedMember;
    }
}
