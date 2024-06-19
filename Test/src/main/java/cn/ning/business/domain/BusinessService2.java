package cn.ning.business.domain;

public class BusinessService2 implements BusinessInterface {

    private static BusinessService2 businessService2= new BusinessService2();

    @Override
    public String getUserName() {
        System.out.println("获取用户姓名2");
        return null;
    }

    /**
     * 通过静态工厂方法创建Bean
     * @return
     */
    public static BusinessService2 createInstance(){
        return businessService2;
    }

}
