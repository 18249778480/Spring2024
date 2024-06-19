package cn.ning.business.domain;

public class BusinessService implements BusinessInterface {

    @Override
    public String getUserName() {
        System.out.println("获取用户姓名");
        return null;
    }
}
