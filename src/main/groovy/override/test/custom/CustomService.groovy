package override.test.custom

import override.test.dummy.DummyService

/**
 * Created by causecode on 7/2/17.
 */
class CustomService implements DummyService {

    def myMethod() {
        // Custom method definition. dummyService.myMethod will invoke this method now.
    }
}
