package com.vptrm.vcvroom.app;

import af.C0179i;
import af.InterfaceC0178h;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import p397jf.InterfaceC14401a;

/* renamed from: com.vptrm.vcvroom.app.c */
/* loaded from: classes3.dex */
public final class C9163c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public int f14396a;

    /* renamed from: b */
    public final InterfaceC0178h f14397b = C0179i.m38720b(C9164a.f14398a);

    /* renamed from: com.vptrm.vcvroom.app.c$a */
    /* loaded from: classes3.dex */
    public static final class C9164a extends AbstractC14657o implements InterfaceC14401a {

        /* renamed from: a */
        public static final C9164a f14398a = new C9164a();

        public C9164a() {
            super(0);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // p397jf.InterfaceC14401a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC14656n.m8377g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC14656n.m8377g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC14656n.m8377g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC14656n.m8377g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC14656n.m8377g(activity, "activity");
        AbstractC14656n.m8377g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC14656n.m8377g(activity, "activity");
        this.f14396a++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC14656n.m8377g(activity, "activity");
        this.f14396a--;
    }
}
