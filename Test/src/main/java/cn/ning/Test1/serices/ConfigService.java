package cn.ning.Test1.serices;

import org.springframework.stereotype.Service;

@Service
public class ConfigService implements IConfigService{

    @Override
    public void getName() {
        System.out.println("实例成功");
    }
}
