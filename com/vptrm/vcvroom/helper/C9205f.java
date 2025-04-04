package com.vptrm.vcvroom.helper;

import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.AbstractC14656n;
import p397jf.InterfaceC14401a;

/* renamed from: com.vptrm.vcvroom.helper.f */
/* loaded from: classes3.dex */
public final class C9205f {

    /* renamed from: a */
    public final InterfaceC14401a f20205a;

    /* renamed from: b */
    public final long f20206b;

    /* renamed from: c */
    public Timer f20207c;

    /* renamed from: com.vptrm.vcvroom.helper.f$a */
    /* loaded from: classes3.dex */
    public static final class C9206a extends TimerTask {
        public C9206a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C9205f.this.f20205a.invoke();
        }
    }

    public C9205f(InterfaceC14401a task, long j) {
        AbstractC14656n.m8377g(task, "task");
        this.f20205a = task;
        this.f20206b = j;
    }

    /* renamed from: b */
    public final void m20700b() {
        if (this.f20207c == null) {
            Timer timer = new Timer();
            this.f20207c = timer;
            timer.scheduleAtFixedRate(new C9206a(), 0L, this.f20206b);
        }
    }

    /* renamed from: c */
    public final void m20699c() {
        Timer timer = this.f20207c;
        if (timer != null) {
            timer.cancel();
        }
        this.f20207c = null;
    }
}
