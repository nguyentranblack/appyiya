package com.vptrm.vcvroom.helper.room;

import ad.AbstractC0132f;
import af.C0172e0;
import af.C0179i;
import af.EnumC0181j;
import af.InterfaceC0178h;
import id.C14028j;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import p397jf.InterfaceC14401a;
import p397jf.InterfaceC14412l;
import p413kd.InterfaceC14536b;
import p426ld.C15101a;
import p612xd.C17594b;

/* renamed from: com.vptrm.vcvroom.helper.room.c */
/* loaded from: classes3.dex */
public final class C9264c {

    /* renamed from: c */
    public static Disposable f20290c;

    /* renamed from: d */
    public static long f20291d;

    /* renamed from: a */
    public static final C9266b f20288a = new C9266b(null);

    /* renamed from: b */
    public static final InterfaceC0178h f20289b = C0179i.m38721a(EnumC0181j.f521a, C9265a.f20294a);

    /* renamed from: e */
    public static long f20292e = 1800000;

    /* renamed from: f */
    public static long f20293f = 10;

    /* renamed from: com.vptrm.vcvroom.helper.room.c$a */
    /* loaded from: classes3.dex */
    public static final class C9265a extends AbstractC14657o implements InterfaceC14401a {

        /* renamed from: a */
        public static final C9265a f20294a = new C9265a();

        public C9265a() {
            super(0);
        }

        @Override // p397jf.InterfaceC14401a
        /* renamed from: b */
        public final C9264c invoke() {
            return new C9264c(null);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.c$b */
    /* loaded from: classes3.dex */
    public static final class C9266b {
        public C9266b() {
        }

        /* renamed from: a */
        public final C9264c m20562a() {
            return (C9264c) C9264c.f20289b.getValue();
        }

        public /* synthetic */ C9266b(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.c$c */
    /* loaded from: classes3.dex */
    public static final class C9267c extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20295a;

        public C9267c(InterfaceC14536b interfaceC14536b) {
            this.f20295a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(ArrayList arrayList) {
            C15101a.f29751S0.m7185a().m7210r1(arrayList);
            InterfaceC14536b interfaceC14536b = this.f20295a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(arrayList);
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.c$d */
    /* loaded from: classes3.dex */
    public static final class C9268d extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ int f20296a;

        public C9268d(int i) {
            this.f20296a = i;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(ArrayList arrayList) {
            if (arrayList != null) {
                int i = this.f20296a;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 5) {
                                if (i == 6) {
                                    C15101a.f29751S0.m7185a().m7213q1(arrayList);
                                    return;
                                }
                                return;
                            }
                            C15101a.f29751S0.m7185a().m7222n1(arrayList);
                            return;
                        }
                        C15101a.f29751S0.m7185a().m7216p1(arrayList);
                        return;
                    }
                    C15101a.f29751S0.m7185a().m7219o1(arrayList);
                    return;
                }
                C15101a.f29751S0.m7185a().m7207s1(arrayList);
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.c$e */
    /* loaded from: classes3.dex */
    public static final class C9269e extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20297a;

        public C9269e(InterfaceC14536b interfaceC14536b) {
            this.f20297a = interfaceC14536b;
        }

        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(ArrayList arrayList) {
            InterfaceC14536b interfaceC14536b = this.f20297a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(arrayList);
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.c$f */
    /* loaded from: classes3.dex */
    public static final class C9270f extends AbstractC0132f {
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(ArrayList arrayList) {
            C15101a.f29751S0.m7185a().m7213q1(arrayList);
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.room.c$g */
    /* loaded from: classes3.dex */
    public static final class C9271g extends AbstractC14657o implements InterfaceC14412l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9271g() {
            super(1);
            C9264c.this = r1;
        }

        /* renamed from: b */
        public final void m20557b(Long l) {
            C9264c.this.m20576e();
        }

        @Override // p397jf.InterfaceC14412l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20557b((Long) obj);
            return C0172e0.f512a;
        }
    }

    public C9264c() {
    }

    /* JADX DEBUG: Method not inlined, still used in: [com.vptrm.vcvroom.helper.room.b.accept(java.lang.Object):void] */
    /* renamed from: a */
    public static /* synthetic */ void m20580a(InterfaceC14412l interfaceC14412l, Object obj) {
        m20564q(interfaceC14412l, obj);
    }

    /* renamed from: i */
    public static /* synthetic */ void m20572i(C9264c c9264c, InterfaceC14536b interfaceC14536b, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC14536b = null;
        }
        c9264c.m20573h(interfaceC14536b);
    }

    /* renamed from: q */
    public static final void m20564q(InterfaceC14412l tmp0, Object obj) {
        AbstractC14656n.m8377g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final void m20577d() {
        f20291d = 0L;
        C15101a.C15102a c15102a = C15101a.f29751S0;
        ArrayList m7299P = c15102a.m7185a().m7299P();
        if (m7299P != null) {
            m7299P.clear();
        }
        ArrayList m7296Q = c15102a.m7185a().m7296Q();
        if (m7296Q != null) {
            m7296Q.clear();
        }
        ArrayList m7308M = c15102a.m7185a().m7308M();
        if (m7308M != null) {
            m7308M.clear();
        }
        ArrayList m7305N = c15102a.m7185a().m7305N();
        if (m7305N != null) {
            m7305N.clear();
        }
        ArrayList m7311L = c15102a.m7185a().m7311L();
        if (m7311L != null) {
            m7311L.clear();
        }
        ArrayList m7302O = c15102a.m7185a().m7302O();
        if (m7302O != null) {
            m7302O.clear();
        }
    }

    /* renamed from: e */
    public final void m20576e() {
        m20572i(this, null, 1, null);
        m20571j(1);
        m20571j(2);
        m20571j(3);
        m20571j(5);
        m20569l();
    }

    /* renamed from: f */
    public final ArrayList m20575f() {
        return C15101a.f29751S0.m7185a().m7299P();
    }

    /* renamed from: g */
    public final ArrayList m20574g(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            return new ArrayList();
                        }
                        return C15101a.f29751S0.m7185a().m7302O();
                    }
                    return C15101a.f29751S0.m7185a().m7311L();
                }
                return C15101a.f29751S0.m7185a().m7305N();
            }
            return C15101a.f29751S0.m7185a().m7308M();
        }
        return C15101a.f29751S0.m7185a().m7296Q();
    }

    /* renamed from: h */
    public final void m20573h(InterfaceC14536b interfaceC14536b) {
        C17594b.m576q0().compose(C14028j.m9195a()).subscribe(new C9267c(interfaceC14536b));
    }

    /* renamed from: j */
    public final void m20571j(int i) {
        HashMap hashMap = new HashMap();
        if (100 != i) {
            if (5 == i) {
                hashMap.put("gifTypes", "5,7");
            } else {
                hashMap.put("gifTypes", Integer.valueOf(i));
            }
        } else {
            hashMap.put("gifType", Integer.valueOf(i));
        }
        C17594b.m707P2(hashMap).compose(C14028j.m9195a()).subscribe(new C9268d(i));
    }

    /* renamed from: k */
    public final void m20570k(int i, InterfaceC14536b interfaceC14536b) {
        HashMap hashMap = new HashMap();
        if (100 != i) {
            if (5 == i) {
                hashMap.put("gifTypes", "5,7");
            } else {
                hashMap.put("gifTypes", Integer.valueOf(i));
            }
        } else {
            hashMap.put("gifType", Integer.valueOf(i));
        }
        C17594b.m707P2(hashMap).compose(C14028j.m9195a()).subscribe(new C9269e(interfaceC14536b));
    }

    /* renamed from: l */
    public final void m20569l() {
        C17594b.m581p0(new HashMap()).compose(C14028j.m9195a()).subscribe(new C9270f());
    }

    /* renamed from: m */
    public final void m20568m() {
        long j = f20291d;
        if (((int) j) == 0) {
            f20291d = System.currentTimeMillis();
            m20565p();
        } else if (m20567n(System.currentTimeMillis(), j)) {
            f20291d = System.currentTimeMillis();
            m20565p();
        }
    }

    /* renamed from: n */
    public final boolean m20567n(long j, long j2) {
        if (Math.abs(j - j2) > f20292e) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final void m20566o() {
        Disposable disposable = f20290c;
        if (disposable != null) {
            AbstractC14656n.m8380d(disposable);
            if (!disposable.isDisposed()) {
                Disposable disposable2 = f20290c;
                AbstractC14656n.m8380d(disposable2);
                disposable2.dispose();
            }
        }
    }

    /* renamed from: p */
    public final void m20565p() {
        m20566o();
        Observable<Long> observeOn = Observable.interval(0L, f20293f, TimeUnit.MINUTES).subscribeOn(Schedulers.m9075io()).observeOn(AndroidSchedulers.mainThread());
        final C9271g c9271g = new C9271g();
        f20290c = observeOn.subscribe(new Consumer() { // from class: com.vptrm.vcvroom.helper.room.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9264c.m20580a(c9271g, obj);
            }
        });
    }

    public /* synthetic */ C9264c(AbstractC14648g abstractC14648g) {
        this();
    }
}
