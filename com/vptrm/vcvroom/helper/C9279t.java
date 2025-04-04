package com.vptrm.vcvroom.helper;

import ad.AbstractC0132f;
import ad.C0134h;
import af.C0172e0;
import af.C0179i;
import af.EnumC0181j;
import af.InterfaceC0178h;
import android.text.TextUtils;
import com.blankj.utilcode.util.AbstractC2565d;
import com.blankj.utilcode.util.AbstractC2584j;
import com.blankj.utilcode.util.C2564c0;
import com.google.gson.Gson;
import com.vptrm.common.utils.C8980f;
import com.vptrm.library.app.LibApp;
import com.vptrm.vcvroom.app.C9166e;
import com.vptrm.vcvroom.entity.CurrentSignKeyEntity;
import id.C14028j;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import p397jf.InterfaceC14401a;
import p397jf.InterfaceC14412l;
import p426ld.C15101a;
import p455nd.C15470e;
import p490pd.C15916b;
import p612xd.C17594b;

/* renamed from: com.vptrm.vcvroom.helper.t */
/* loaded from: classes3.dex */
public final class C9279t {

    /* renamed from: c */
    public static Disposable f20307c;

    /* renamed from: a */
    public static final C9281b f20305a = new C9281b(null);

    /* renamed from: b */
    public static final InterfaceC0178h f20306b = C0179i.m38721a(EnumC0181j.f521a, C9280a.f20309a);

    /* renamed from: d */
    public static long f20308d = 10;

    /* renamed from: com.vptrm.vcvroom.helper.t$a */
    /* loaded from: classes3.dex */
    public static final class C9280a extends AbstractC14657o implements InterfaceC14401a {

        /* renamed from: a */
        public static final C9280a f20309a = new C9280a();

        public C9280a() {
            super(0);
        }

        @Override // p397jf.InterfaceC14401a
        /* renamed from: b */
        public final C9279t invoke() {
            return new C9279t();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.t$b */
    /* loaded from: classes3.dex */
    public static final class C9281b {
        public C9281b() {
        }

        /* renamed from: a */
        public final C9279t m20524a() {
            return (C9279t) C9279t.f20306b.getValue();
        }

        public /* synthetic */ C9281b(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.t$c */
    /* loaded from: classes3.dex */
    public static final class C9282c extends AbstractC0132f {
        public C9282c() {
            C9279t.this = r1;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(CurrentSignKeyEntity currentSignKeyEntity) {
            long j;
            if (currentSignKeyEntity != null) {
                C9279t c9279t = C9279t.this;
                C9281b c9281b = C9279t.f20305a;
                Long nextPullTime = currentSignKeyEntity.getNextPullTime();
                long j2 = 0;
                if (nextPullTime != null) {
                    j = nextPullTime.longValue();
                } else {
                    j = 0;
                }
                C9279t.f20308d = j;
                C15101a.C15102a c15102a = C15101a.f29751S0;
                C15101a m7185a = c15102a.m7185a();
                String encryptionSignKey = currentSignKeyEntity.getEncryptionSignKey();
                if (encryptionSignKey == null) {
                    encryptionSignKey = "";
                }
                m7185a.m7277W0(encryptionSignKey);
                C15101a m7185a2 = c15102a.m7185a();
                Long timestamp = currentSignKeyEntity.getTimestamp();
                if (timestamp != null) {
                    j2 = timestamp.longValue();
                }
                m7185a2.m7285T1(j2);
                c9279t.m20529n();
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
            C9279t.this.m20527p();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.t$d */
    /* loaded from: classes3.dex */
    public static final class C9283d extends AbstractC14657o implements InterfaceC14412l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9283d() {
            super(1);
            C9279t.this = r1;
        }

        /* renamed from: b */
        public final void m20522b(Long l) {
            C15101a.C15102a c15102a = C15101a.f29751S0;
            C15101a m7185a = c15102a.m7185a();
            m7185a.m7285T1(m7185a.m7199v0() + 1000);
            if (c15102a.m7185a().m7199v0() >= C9279t.f20308d) {
                C9279t.this.m20531l();
                C9279t.this.m20533j();
            }
        }

        @Override // p397jf.InterfaceC14412l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20522b((Long) obj);
            return C0172e0.f512a;
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.t$e */
    /* loaded from: classes3.dex */
    public static final class C9284e extends AbstractC14657o implements InterfaceC14412l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9284e() {
            super(1);
            C9279t.this = r1;
        }

        /* renamed from: b */
        public final void m20521b(Long l) {
            C9279t.this.m20533j();
        }

        @Override // p397jf.InterfaceC14412l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20521b((Long) obj);
            return C0172e0.f512a;
        }
    }

    /* renamed from: o */
    public static final void m20528o(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m20526q(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public final void m20533j() {
        C17594b.m661Z().compose(C14028j.m9195a()).subscribe(new C9282c());
    }

    /* renamed from: k */
    public final void m20532k() {
        m20531l();
        m20533j();
    }

    /* renamed from: l */
    public final void m20531l() {
        Disposable disposable;
        Disposable disposable2 = f20307c;
        if (disposable2 != null) {
            AbstractC14656n.m8380d(disposable2);
            if (!disposable2.isDisposed() && (disposable = f20307c) != null) {
                disposable.dispose();
            }
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: [(r3v1 long)] */
    /* renamed from: m */
    public final void m20530m(String str, HashMap map) {
        AbstractC14656n.m8377g(map, "map");
        String json = new Gson().toJson(map);
        String m38745b = C0134h.m38745b(8);
        C15101a.C15102a c15102a = C15101a.f29751S0;
        long m7199v0 = c15102a.m7185a().m7199v0();
        String m7203u = c15102a.m7185a().m7203u();
        String m36292h = C2564c0.m36298b().m36292h("VPT_SP_APP_DEVICEID", "");
        if (TextUtils.isEmpty(m36292h)) {
            m36292h = AbstractC2584j.m36231d();
            C2564c0.m36298b().m36284p("VPT_SP_APP_DEVICEID", m36292h);
        }
        String m21631a = C8980f.f13898a.m21631a();
        if (!TextUtils.isEmpty(m21631a)) {
            m36292h = m21631a;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m7199v0);
        hashMap.put("t", sb2.toString());
        hashMap.put("n", m38745b);
        hashMap.put("sk", C0134h.m38746a(m7203u, 12));
        if (!TextUtils.isEmpty(json)) {
            hashMap.put("rb", json);
        }
        hashMap.put("app-version", AbstractC2565d.m36273d());
        hashMap.put("channelName", C15470e.m6350a(LibApp.m21481a()));
        hashMap.put("deviceId", m36292h);
        String m38743d = C0134h.m38743d(hashMap);
        HashMap hashMap2 = new HashMap();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m7199v0);
        hashMap2.put("t", sb3.toString());
        hashMap2.put("n", m38745b);
        hashMap2.put("s", m38743d);
        hashMap2.put("app-version", AbstractC2565d.m36273d());
        hashMap2.put("channelName", C15470e.m6350a(LibApp.m21481a()));
        hashMap2.put("deviceId", m36292h);
        hashMap2.put("params", new Gson().toJson(hashMap));
        hashMap2.put("encryptionSignKey", m7203u);
        hashMap2.put("sk", C0134h.m38746a(m7203u, 12));
        String json2 = new Gson().toJson(c15102a.m7185a().m7208s0());
        C15916b.m5061c("签名-失败上报-params", json2);
        C9166e m21050a = C9166e.f14400d0.m21050a();
        m21050a.m21090g1("签名校验失败：errorCode：" + str + " errorMsg：" + json2, 0);
    }

    /* renamed from: n */
    public final void m20529n() {
        m20531l();
        Observable<Long> observeOn = Observable.interval(0L, 1L, TimeUnit.SECONDS).subscribeOn(Schedulers.m9075io()).observeOn(AndroidSchedulers.mainThread());
        final C9283d c9283d = new C9283d();
        f20307c = observeOn.subscribe(new Consumer() { // from class: com.vptrm.vcvroom.helper.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9279t.m20528o(c9283d, obj);
            }
        });
    }

    /* renamed from: p */
    public final void m20527p() {
        Observable<Long> observeOn = Observable.timer(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread());
        final C9284e c9284e = new C9284e();
        observeOn.subscribe(new Consumer() { // from class: com.vptrm.vcvroom.helper.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9279t.m20526q(c9284e, obj);
            }
        });
    }
}
