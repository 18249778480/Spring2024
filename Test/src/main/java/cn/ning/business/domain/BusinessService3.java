package cn.ning.business.domain;

public class BusinessService3 implements BusinessInterface {

    //private static BusinessService3 businessService2= new BusinessService3();
    private UserService userService =  new UserService();
    @Override
    public String getUserName() {
        System.out.println("获取用户姓名3");
        return null;
    }

    /**
     * 通过静态工厂方法创建Bean
     * @return
     */

    public UserService createInstance(){
        return userService;
    }

}
