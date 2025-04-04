package com.vptrm.vcvroom.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import com.vptrm.common.app.CommonApp;
import com.vptrm.common.utils.C8992i;
import com.vptrm.vcvroom.helper.C9198c;
import com.vptrm.vcvroom.helper.C9279t;
import com.vptrm.vcvroom.receiver.NetworkChangeReceiver;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlinx.coroutines.AbstractC14805f0;
import kotlinx.coroutines.AbstractC14807f2;
import kotlinx.coroutines.C14980t0;
import kotlinx.coroutines.InterfaceC14801e0;
import p455nd.C15497x;

/* loaded from: classes3.dex */
public final class App extends CommonApp implements Application.ActivityLifecycleCallbacks {

    /* renamed from: A */
    public static final C9159a f14383A = new C9159a(null);

    /* renamed from: B */
    public static final InterfaceC14801e0 f14384B = AbstractC14805f0.m8058a(AbstractC14807f2.m8051b(null, 1, null).plus(C14980t0.m7561b()));

    /* renamed from: C */
    public static App f14385C;

    /* renamed from: D */
    public static volatile WeakReference f14386D;

    /* renamed from: z */
    public NetworkChangeReceiver f14387z;

    /* renamed from: com.vptrm.vcvroom.app.App$a */
    /* loaded from: classes3.dex */
    public static final class C9159a {
        public C9159a() {
        }

        /* renamed from: a */
        public final Context m21182a() {
            App app = App.f14385C;
            if (app == null) {
                AbstractC14656n.m8360x("XBaseApplication");
                return null;
            }
            return app;
        }

        /* renamed from: b */
        public final Activity m21181b() {
            WeakReference weakReference = App.f14386D;
            if (weakReference != null) {
                return (Activity) weakReference.get();
            }
            return null;
        }

        public /* synthetic */ C9159a(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC14656n.m8377g(activity, "activity");
        C15497x.m6184j(activity);
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
        f14386D = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC14656n.m8377g(activity, "activity");
    }

    @Override // com.vptrm.library.app.LibApp, android.app.Application
    public void onCreate() {
        super.onCreate();
        f14385C = this;
        C9198c.f20173a.m20708a(this);
        registerActivityLifecycleCallbacks(this);
        this.f14387z = new NetworkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        NetworkChangeReceiver networkChangeReceiver = this.f14387z;
        if (networkChangeReceiver == null) {
            AbstractC14656n.m8360x("networkChangeReceiver");
            networkChangeReceiver = null;
        }
        registerReceiver(networkChangeReceiver, intentFilter);
        C9174h.m21042e(this);
        try {
            C8992i.f13914a.m21603h(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C9279t.f20305a.m20524a().m20532k();
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        NetworkChangeReceiver networkChangeReceiver = this.f14387z;
        if (networkChangeReceiver != null) {
            if (networkChangeReceiver == null) {
                AbstractC14656n.m8360x("networkChangeReceiver");
                networkChangeReceiver = null;
            }
            unregisterReceiver(networkChangeReceiver);
        }
    }
}
