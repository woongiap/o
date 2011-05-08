#include <string.h>
#include <jni.h>

/* This is a trivial JNI example where we use a native method
 * to return a new VM String. See the corresponding Java source
 * file located at:
 */
jstring Java_com_ngiap_Hello_jniString(JNIEnv* env, jobject thiz)
{
    return (*env)->NewStringUTF(env, "JNI: quit?");
}
