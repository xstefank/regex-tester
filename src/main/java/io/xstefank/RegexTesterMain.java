package io.xstefank;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.util.regex.Pattern;

@QuarkusMain
public class RegexTesterMain implements QuarkusApplication {


    @Override
    public int run(String... args) throws Exception {
        Pattern pattern = Pattern.compile(args[0]);
        System.out.println(pattern.matcher(args[1]).matches());
        
        return 0;
    }
}
