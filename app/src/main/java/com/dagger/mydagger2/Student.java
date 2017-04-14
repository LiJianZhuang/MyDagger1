package com.dagger.mydagger2;

/**
 * Created by libo on 2017-04-12.
 */

public class Student {

    private String name;

//    @Inject
    public  Student (String name){
       this.name =name;
    }

    public String getName() {
        return name;
    }
}
