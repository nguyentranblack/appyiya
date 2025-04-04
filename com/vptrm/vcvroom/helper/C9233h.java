package com.vptrm.vcvroom.helper;

import ad.AbstractC0132f;
import af.C0172e0;
import af.C0179i;
import af.EnumC0181j;
import af.InterfaceC0178h;
import com.blankj.utilcode.util.C2564c0;
import com.vptrm.common.helper.C8923p;
import com.vptrm.library.helper.C9072a;
import com.vptrm.vcvroom.app.C9166e;
import com.vptrm.vcvroom.entity.RoomInfoEntity;
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
import p612xd.C17594b;

/* renamed from: com.vptrm.vcvroom.helper.h */
/* loaded from: classes3.dex */
public final class C9233h {

    /* renamed from: c */
    public static Disposable f20246c;

    /* renamed from: a */
    public static final C9235b f20244a = new C9235b(null);

    /* renamed from: b */
    public static final InterfaceC0178h f20245b = C0179i.m38721a(EnumC0181j.f521a, C9234a.f20248a);

    /* renamed from: d */
    public static long f20247d = 10;

    /* renamed from: com.vptrm.vcvroom.helper.h$a */
    /* loaded from: classes3.dex */
    public static final class C9234a extends AbstractC14657o implements InterfaceC14401a {

        /* renamed from: a */
        public static final C9234a f20248a = new C9234a();

        public C9234a() {
            super(0);
        }

        @Override // p397jf.InterfaceC14401a
        /* renamed from: b */
        public final C9233h invoke() {
            return new C9233h();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.h$b */
    /* loaded from: classes3.dex */
    public static final class C9235b {
        public C9235b() {
        }

        /* renamed from: a */
        public final C9233h m20621a() {
            return (C9233h) C9233h.f20245b.getValue();
        }

        public /* synthetic */ C9235b(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.h$c */
    /* loaded from: classes3.dex */
    public static final class C9236c extends AbstractC0132f {
        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }

        @Override // ad.AbstractC0132f
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.h$d */
    /* loaded from: classes3.dex */
    public static final class C9237d extends AbstractC0132f {
        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
            C9166e m21050a = C9166e.f14400d0.m21050a();
            m21050a.m21090g1("心跳发送失败：errorCode：" + errorCode + " errorMsg：" + errorMsg, 0);
        }

        @Override // ad.AbstractC0132f
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.h$e */
    /* loaded from: classes3.dex */
    public static final class C9238e extends AbstractC0132f {
        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }

        @Override // ad.AbstractC0132f
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.h$f */
    /* loaded from: classes3.dex */
    public static final class C9239f extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ int f20249a;

        public C9239f(int i) {
            this.f20249a = i;
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }

        @Override // ad.AbstractC0132f
        public void onSuccess(Object obj) {
            if (this.f20249a == 1) {
                C9072a.m21420c("VPT_WS_ON_MIC_SUCCESS", "");
            }
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.h$g */
    /* loaded from: classes3.dex */
    public static final class C9240g extends AbstractC14657o implements InterfaceC14412l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9240g() {
            super(1);
            C9233h.this = r1;
        }

        /* renamed from: b */
        public final void m20620b(Long l) {
            C9233h.this.m20629e();
        }

        @Override // p397jf.InterfaceC14412l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20620b((Long) obj);
            return C0172e0.f512a;
        }
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.helper.g.accept(java.lang.Object):void] */
    /* renamed from: a */
    public static /* synthetic */ void m20633a(InterfaceC14412l interfaceC14412l, Object obj) {
        m20623k(interfaceC14412l, obj);
    }

    /* renamed from: k */
    public static final void m20623k(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final void m20630d(long j) {
        if (C8923p.m21789e().m21787g() == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("roomId", Long.valueOf(j));
        C17594b.m760F(hashMap).compose(C14028j.m9195a()).subscribe(new C9236c());
    }

    /* renamed from: e */
    public final void m20629e() {
        Long l;
        long longValue;
        int i;
        if (C8923p.m21789e().m21787g() == null) {
            return;
        }
        C9166e.C9167a c9167a = C9166e.f14400d0;
        RoomInfoEntity m21156D = c9167a.m21050a().m21156D();
        if (m21156D != null) {
            l = m21156D.getId();
        } else {
            l = null;
        }
        long j = 0;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        int i2 = 0;
        int m36295e = C2564c0.m36298b().m36295e("KEY_ROOM_TYPE", 0);
        Integer m21134O = c9167a.m21050a().m21134O();
        if (m21134O != null) {
            i = m21134O.intValue();
        } else {
            i = -1;
        }
        if (longValue > 0) {
            if (i != -1) {
                i2 = i;
            }
            j = longValue;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mikeIndex", Integer.valueOf(i2));
        hashMap.put("roomId", Long.valueOf(j));
        hashMap.put("roomType", Integer.valueOf(m36295e));
        C17594b.m565s1(hashMap).compose(C14028j.m9195a()).subscribe(new C9237d());
    }

    /* renamed from: f */
    public final void m20628f() {
        m20624j();
    }

    /* renamed from: g */
    public final void m20627g(long j) {
        if (C8923p.m21789e().m21787g() == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("roomId", Long.valueOf(j));
        C17594b.m540x1(hashMap).compose(C14028j.m9195a()).subscribe(new C9238e());
    }

    /* renamed from: h */
    public final void m20626h(int i, long j, int i2) {
        if (C8923p.m21789e().m21787g() == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mikeIndex", Integer.valueOf(i));
        hashMap.put("roomId", Long.valueOf(j));
        hashMap.put("type", Integer.valueOf(i2));
        C17594b.m733K1(hashMap).compose(C14028j.m9195a()).subscribe(new C9239f(i2));
    }

    /* renamed from: i */
    public final void m20625i() {
        Disposable disposable;
        Disposable disposable2 = f20246c;
        if (disposable2 != null) {
            AbstractC14656n.m8380d(disposable2);
            if (!disposable2.isDisposed() && (disposable = f20246c) != null) {
                disposable.dispose();
            }
        }
    }

    /* renamed from: j */
    public final void m20624j() {
        m20625i();
        Observable<Long> observeOn = Observable.interval(0L, f20247d, TimeUnit.SECONDS).subscribeOn(Schedulers.m9075io()).observeOn(AndroidSchedulers.mainThread());
        final C9240g c9240g = new C9240g();
        f20246c = observeOn.subscribe(new Consumer() { // from class: com.vptrm.vcvroom.helper.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9233h.m20633a(c9240g, obj);
            }
        });
    }
}
