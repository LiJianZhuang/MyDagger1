package com.dagger.mydagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by libo on 2017-04-12.
 */
@Module
public class StudentModule {

    @Provides
    public Student getStudent(String name){
        return new Student(name);
    }

    @Provides
    public String providePoems(){
        return "只有意志坚强的人，才能到达彼岸";
    }
}
