#include <jni.h>

// com.test.ndk_enter

int test(){
    return 12306;
}

jint Java_com_test_ndk_1enter_MainActivity_nativeTest(JNIEnv *env, jobject thiz) {
    return test();
}