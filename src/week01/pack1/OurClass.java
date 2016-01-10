package week01.pack1;

/**
 * Created by waps12b on 2016. 1. 10..
 * 같은 패키지에 있는 myclass에서 이 클래스의 다양한 멤버에 접근해봅시다
 */
public class OurClass {
    int defaultMember;
    private int privateMember ;
    protected int protectedMember ;
    public int publicMember;

    //static 멤버들은 선언시에 초기화를 해주는게 보통
    public static int staticPublicMember    = 1;
    private static int staticPrivateMemeber = 1;

    /**
     * constructor에도 제한자를 항상 적어주는게 좋은 버릇
     */
    public OurClass(){

    }

    void defaultMethod()
    {
        System.out.println("It's default Method of a instance of the OurClass.java");
    }
    protected void protectedMethod()
    {
        System.out.println("It's protected Method of a instance of the OurClass.java");
    }
    private void privateMathod()
    {
        System.out.println("It's private Method of a instance of the OurClass.java");
    }
    public void publicMethod()
    {
        System.out.println("It's public Method of a instance of the OurClass.java");
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
