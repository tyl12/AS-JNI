//
// Created by Administrator on 2016/6/25.
//

#include <string.h>
#include <jni.h>
#include "com_example_jniapplication_HelloJni.h"

JNIEXPORT jstring JNICALL Java_com_example_jniapplication_HelloJni_stringFromJNI
        (JNIEnv* env, jobject thiz){
    return (*env)->NewStringUTF(env, "Hello from JNI 1!");
}
