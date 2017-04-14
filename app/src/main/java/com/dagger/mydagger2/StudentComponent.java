package com.dagger.mydagger2;

import dagger.Component;

/**
 * Created by libo on 2017-04-12.
 */

@Component(modules = StudentModule.class)
public interface StudentComponent {
    public void inject(MainActivity activity);
}
