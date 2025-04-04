package com.vptrm.vcvroom.helper;

import ad.AbstractC0132f;
import ad.C0127c;
import af.C0179i;
import af.EnumC0181j;
import af.InterfaceC0178h;
import com.vptrm.common.entity.UserLiveTypeEntity;
import kotlin.jvm.internal.AbstractC14648g;
import kotlin.jvm.internal.AbstractC14656n;
import kotlin.jvm.internal.AbstractC14657o;
import p397jf.InterfaceC14401a;
import p413kd.InterfaceC14536b;
import p426ld.C15101a;

/* renamed from: com.vptrm.vcvroom.helper.n */
/* loaded from: classes3.dex */
public final class C9248n {

    /* renamed from: a */
    public static final C9250b f20267a = new C9250b(null);

    /* renamed from: b */
    public static final InterfaceC0178h f20268b = C0179i.m38721a(EnumC0181j.f521a, C9249a.f20269a);

    /* renamed from: com.vptrm.vcvroom.helper.n$a */
    /* loaded from: classes3.dex */
    public static final class C9249a extends AbstractC14657o implements InterfaceC14401a {

        /* renamed from: a */
        public static final C9249a f20269a = new C9249a();

        public C9249a() {
            super(0);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // p397jf.InterfaceC14401a
        /* renamed from: b */
        public final C9248n invoke() {
            return new C9248n(null);
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.n$b */
    /* loaded from: classes3.dex */
    public static final class C9250b {
        public C9250b() {
        }

        /* renamed from: a */
        public final C9248n m20603a() {
            return (C9248n) C9248n.f20268b.getValue();
        }

        public /* synthetic */ C9250b(AbstractC14648g abstractC14648g) {
            this();
        }
    }

    /* renamed from: com.vptrm.vcvroom.helper.n$c */
    /* loaded from: classes3.dex */
    public static final class C9251c extends AbstractC0132f {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC14536b f20270a;

        public C9251c(InterfaceC14536b interfaceC14536b) {
            this.f20270a = interfaceC14536b;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // ad.AbstractC0132f
        /* renamed from: a */
        public void onSuccess(UserLiveTypeEntity entity) {
            int i;
            AbstractC14656n.m8377g(entity, "entity");
            C15101a m7185a = C15101a.f29751S0.m7185a();
            Integer type = entity.getType();
            if (type != null) {
                i = type.intValue();
            } else {
                i = 0;
            }
            m7185a.m7309L1(i);
            InterfaceC14536b interfaceC14536b = this.f20270a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(Boolean.TRUE);
            }
        }

        @Override // ad.AbstractC0132f
        public void onFail(String errorCode, String errorMsg) {
            AbstractC14656n.m8377g(errorCode, "errorCode");
            AbstractC14656n.m8377g(errorMsg, "errorMsg");
            InterfaceC14536b interfaceC14536b = this.f20270a;
            if (interfaceC14536b != null) {
                interfaceC14536b.onSuccess(Boolean.FALSE);
            }
        }
    }

    public C9248n() {
    }

    /* renamed from: b */
    public static final C9248n m20606b() {
        return f20267a.m20603a();
    }

    /* renamed from: c */
    public final void m20605c(InterfaceC14536b interfaceC14536b) {
        C0127c.m38806W().subscribe(new C9251c(interfaceC14536b));
    }

    public /* synthetic */ C9248n(AbstractC14648g abstractC14648g) {
        this();
    }
}
