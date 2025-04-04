package com.vptrm.vcvroom.helper;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.vptrm.vcvroom.helper.u */
/* loaded from: classes3.dex */
public final class C9285u {

    /* renamed from: b */
    public static Timer f20312b;

    /* renamed from: c */
    public static TimerTask f20313c;

    /* renamed from: e */
    public static boolean f20315e;

    /* renamed from: a */
    public static final C9285u f20311a = new C9285u();

    /* renamed from: d */
    public static long f20314d = 5000;

    /* renamed from: a */
    public final boolean m20520a() {
        return f20315e;
    }

    /* renamed from: b */
    public final void m20519b() {
        try {
            TimerTask timerTask = f20313c;
            if (timerTask != null) {
                if (timerTask != null) {
                    timerTask.cancel();
                }
                Timer timer = f20312b;
                if (timer != null) {
                    timer.cancel();
                }
                f20312b = null;
                f20313c = null;
                f20315e = false;
            }
        } catch (Exception unused) {
        }
    }
}
