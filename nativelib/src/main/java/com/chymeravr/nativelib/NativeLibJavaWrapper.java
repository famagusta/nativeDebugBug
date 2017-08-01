package com.chymeravr.nativelib;

/**
 * Created by robin_chimera on 8/1/2017.
 */

public class NativeLibJavaWrapper {
    public NativeLibJavaWrapper(){}

    public String getNativeString(){
        return this.stringFromJNI();
    }

    /* A native method that is implemented by the
    * 'hello-jni' native library, which is packaged
    * with this application.
    */
    private native String stringFromJNI();

    /* This is another native method declaration that is *not*
     * implemented by 'hello-jni'. This is simply to show that
     * you can declare as many native methods in your Java code
     * as you want, their implementation is searched in the
     * currently loaded native libraries only the first time
     * you call them.
     *
     * Trying to call this function will result in a
     * java.lang.UnsatisfiedLinkError exception !
     */
    static {
        System.loadLibrary("hello-jni");
    }
}
