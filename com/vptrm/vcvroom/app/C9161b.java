package com.vptrm.vcvroom.app;

import ad.C0133g;
import af.C0172e0;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import bd.AbstractC2047a;
import com.blankj.utilcode.util.AbstractC2582i0;
import com.vptrm.common.entity.LoginEntity;
import com.vptrm.common.helper.C8923p;
import com.vptrm.vcvroom.helper.C9247m;
import com.vptrm.vcvroom.netease.C9302b;
import com.vptrm.vcvroom.page.home.activity.MainActivity;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import p397jf.InterfaceC14412l;
import p612xd.C17594b;

/* renamed from: com.vptrm.vcvroom.app.b */
/* loaded from: classes3.dex */
public final class C9161b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public long f14389a;

    /* renamed from: b */
    public int f14390b;

    /* renamed from: c */
    public Disposable f14391c;

    /* renamed from: d */
    public long f14392d;

    /* renamed from: e */
    public boolean f14393e;

    /* renamed from: f */
    public boolean f14394f;

    /* renamed from: g */
    public boolean f14395g;

    /* renamed from: com.vptrm.vcvroom.app.b$a */
    /* loaded from: classes3.dex */
    public static final class C9162a extends AbstractC14657o implements InterfaceC14412l {
        public C9162a() {
            super(1);
        }

        /* renamed from: b */
        public final void m21163b(long j) {
            long currentTimeMillis = System.currentTimeMillis();
            if (C9161b.this.f14393e && C9161b.this.f14389a - currentTimeMillis <= 1000) {
                long j2 = currentTimeMillis - C9161b.this.f14392d;
                C9161b.this.f14392d = System.currentTimeMillis();
                C9161b.this.m21168m(j2 / 1000);
                C9161b.this.f14393e = false;
                C9161b.this.m21164q();
                C9161b c9161b = C9161b.this;
                c9161b.f14391c = c9161b.m21166o();
                return;
            }
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0 && j % 300 == 0) {
                C9161b.this.f14392d = System.currentTimeMillis();
                C9161b.this.m21168m(300L);
            }
            if (i > 0 && j % 60 == 0) {
                C9247m.f20263a.m20610a();
            }
            if (!C9161b.this.f14393e) {
                C9161b c9161b2 = C9161b.this;
                c9161b2.f14389a = c9161b2.m21167n();
                C9161b.this.f14393e = true;
            }
        }

        @Override // p397jf.InterfaceC14412l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m21163b(((Number) obj).longValue());
            return C0172e0.f512a;
        }
    }

    /* renamed from: p */
    public static final void m21165p(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public final void m21168m(long j) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM", locale);
        String m36236a = AbstractC2582i0.m36236a(this.f14392d, simpleDateFormat);
        String m36236a2 = AbstractC2582i0.m36236a(this.f14392d, simpleDateFormat2);
        HashMap hashMap = new HashMap();
        hashMap.put("dayDate", m36236a);
        hashMap.put("daySeconds", Long.valueOf(j));
        hashMap.put("monDate", m36236a2);
        hashMap.put("monSeconds", Long.valueOf(j));
        C17594b.m647c(hashMap).subscribe(new C0133g());
    }

    /* renamed from: n */
    public final long m21167n() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis();
    }

    /* renamed from: o */
    public final Disposable m21166o() {
        Disposable subscribe;
        synchronized (this) {
            Observable<Long> observeOn = Observable.interval(1L, TimeUnit.SECONDS).subscribeOn(Schedulers.m9075io()).observeOn(AndroidSchedulers.mainThread());
            final C9162a c9162a = new C9162a();
            subscribe = observeOn.subscribe(new Consumer() { // from class: com.vptrm.vcvroom.app.a
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C9161b.m21165p(InterfaceC14412l.this, obj);
                }
            }, Functions.emptyConsumer());
            AbstractC14656n.m8378f(subscribe, "private fun startInterva…nsumer())\n        }\n    }");
        }
        return subscribe;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z;
        AbstractC14656n.m8377g(activity, "activity");
        if (activity instanceof MainActivity) {
            this.f14394f = true;
            C9302b.m20489c();
            LoginEntity m21787g = C8923p.m21789e().m21787g();
            if (m21787g != null) {
                z = AbstractC2047a.m37537f(m21787g);
            } else {
                z = false;
            }
            this.f14395g = z;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC14656n.m8377g(activity, "activity");
        if (activity instanceof MainActivity) {
            this.f14394f = false;
            m21164q();
        }
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
        this.f14390b++;
        if (this.f14395g && this.f14394f && this.f14391c == null) {
            this.f14392d = System.currentTimeMillis();
            this.f14389a = m21167n();
            this.f14393e = true;
            this.f14391c = m21166o();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC14656n.m8377g(activity, "activity");
        int i = this.f14390b - 1;
        this.f14390b = i;
        if (this.f14395g && i == 0 && this.f14394f) {
            m21164q();
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.f14392d;
            if (j > 60000) {
                this.f14392d = currentTimeMillis;
                m21168m(j / 1000);
            }
        }
    }

    /* renamed from: q */
    public final void m21164q() {
        Disposable disposable = this.f14391c;
        if (disposable != null) {
            AbstractC14656n.m8380d(disposable);
            disposable.dispose();
            this.f14391c = null;
        }
    }
}
