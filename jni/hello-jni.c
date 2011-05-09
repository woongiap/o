#include <stdio.h>
#include <string.h>
#include <jni.h>

/* This is a trivial JNI example where we use a native method
 * to return a new VM String. See the corresponding Java source
 * file located at:
 */
jstring Java_com_ngiap_Hello_jniString(JNIEnv* env, jobject thiz,
                                        jint i,
                                        jstring s)
{
	/* no effect on adb logcat */  
        fprintf(stdout, "Passed in i=%d, s=%s", i, s);
        fprintf(stderr, "Passed in i=%d, s=%s", i, s);
        return (*env)->NewStringUTF(env, "JNI: quit?");
}
