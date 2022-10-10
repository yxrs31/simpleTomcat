package com.hero.herocat;

import com.hero.servlet.HeroRequest;
import com.hero.servlet.HeroResponse;
import com.hero.servlet.HeroServlet;

import java.io.InputStream;

/**
 * 获取静态资源
 */
public class StaticServlet extends HeroServlet {
    @Override
    public void doGet(HeroRequest request, HeroResponse response) throws Exception {
        String uri = request.getUri();
        String htmlName = uri.substring(uri.lastIndexOf("/") + 1);
        InputStream in = HeroCatServer.class.getClassLoader().getResourceAsStream(htmlName);
        if(in==null){
            response.write("page not found");
            return;
        }
        byte[] buffer = new byte[1024];
        //循环读取
        int len = 0;
        while ((len = in.read(buffer)) != -1) {
            String s = new String(buffer, 0, len, "utf-8");
            response.write(s);
        }
    }

    @Override
    public void doPost(HeroRequest request, HeroResponse response) throws Exception {

    }
}
