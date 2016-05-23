package example;

import cn.incontent.eci.sdk.Configuration;
import cn.incontent.eci.sdk.PluginInfo;
import cn.incontent.eci.sdk.PluginRunner;

/**
 * @Author : wuzhen
 * @Created : 2016-05-20
 * @E-mail : valer@126.com
 * @Version : 1.0
 */
public class HelloEci {

    public static void main(String[] args) throws Exception {

        new PluginRunner("/incontent/develope/ECI-SDK/webroot",5050)
                .addPlugin(new PluginInfo("aa","bb",
                        "/incontent/resources/ic-eci/lib",
                        "/incontent/resources/ic-eci/resource",
                        "/incontent/resources/ic-eci/page"))
                .configure(new Configuration().configMode(Configuration.ServerMode.DEBUG)
                .configMongoDb("localhost",27017))
                .setContextPath("ECI").start(false);

    }

}
